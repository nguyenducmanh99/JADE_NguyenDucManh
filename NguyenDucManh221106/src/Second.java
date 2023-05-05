import javax.swing.JOptionPane;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Second extends Agent {
 
@Override
protected void setup() {
    addBehaviour(new CyclicBehaviour() {
        
         @Override
         public void action() {
             ACLMessage msg = receive();
             if(msg != null) {
                 System.out.print("Tin nhắn nhận được:"+msg.getContent());
                 JOptionPane.showMessageDialog(null, "Kết nối thành công \nXin chào: " + msg.getContent());
                 // Sau khi nhận được tin nhắn chúng ta có thể gửi lại
                 ACLMessage reply = msg.createReply();
                 reply.setPerformative(ACLMessage.INFORM);
                 String price = msg.getContent();
                 reply.setContent("off");
                 send(reply); 
                 // .......
             } else {
                 System.out.print("\nKết thúc hàm !");
                 block();
             }               
         }
    });
}}
