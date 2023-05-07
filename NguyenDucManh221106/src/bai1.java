import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.core.Profile;
import jade.core.ProfileImpl;

public class bai1 {
	

	public static void main(String[] args) {
		// TODO Main 
      Runtime rt =  Runtime.instance();
      Profile p = new ProfileImpl();
      p.setParameter(Profile.MAIN, "localhost");
      p.setParameter(Profile.GUI, "true");
      AgentContainer ac = rt.createMainContainer(p);
      
      // Container 2
      Profile p2 = new ProfileImpl();
      p.setParameter(Profile.CONTAINER_NAME, "Container2");
      p.setParameter(Profile.MAIN_HOST, "localhost");
      AgentContainer ac2 = rt.createAgentContainer(p2);
      
      // Container 3
      Profile p3 = new ProfileImpl();
      p.setParameter(Profile.CONTAINER_NAME, "Container3");
      p.setParameter(Profile.MAIN_HOST, "localhost");
      AgentContainer ac3 = rt.createAgentContainer(p3);
	}
}
