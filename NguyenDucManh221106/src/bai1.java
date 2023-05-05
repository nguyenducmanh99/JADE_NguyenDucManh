import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.core.Profile;
import jade.core.ProfileImpl;

public class bai1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Runtime rt =  Runtime.instance();
      Profile p = new ProfileImpl();
      p.setParameter(Profile.MAIN, "localhost");
      p.setParameter(Profile.GUI, "true");
      AgentContainer ac = rt.createMainContainer(p);
	}
}
