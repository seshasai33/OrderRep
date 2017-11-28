
public class TestAggregation {

	public static void main(String[] args) {
		Mobile m=new Mobile("Nokia","N3160");
		MemoryCard mc=new MemoryCard("Sanddisk",128);
		m.memoryCard=mc;
		System.out.println(m.getMake()+m.getModel()+m.memoryCard.getCompany()+m.memoryCard.getSize());
	}

}
