import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class First extends Agent {  

@Override
protected void setup() {
    addBehaviour(new OneShotBehaviour() {
        
        @Override
        public void action() {
            System.out.println("I'm sending");
            ACLMessage msg =new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(new AID("second",AID.ISLOCALNAME));
            msg.setContent("Nguyen Duc Manh");
            send(msg);              
        }
    });
}}