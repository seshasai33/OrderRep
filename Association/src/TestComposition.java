
public class TestComposition {
	public static void main(String[] args) {
		Mobile m=new Mobile("Nokia","N3160");
		Sim s=new Sim("Idea","12345");
		m.sim=s;
		System.out.println(m.getMake()+m.getModel()+m.sim.getNetwork()+m.sim.getNumber());
	}

}
