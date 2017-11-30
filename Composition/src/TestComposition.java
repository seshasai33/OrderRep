
public class TestComposition {

	public static void main(String[] args) {
		Sim s=new Sim("Idea","12345");
		Mobile m=new Mobile("Nokia","N3160",s);
		m.sim=s;
		System.out.println(m.getMake()+m.getModel()+m.sim.getNetwork()+m.sim.getNumber());
	}

}
