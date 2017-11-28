
public class MemoryCard {
	private String company;
	private int size;
	
	public MemoryCard(String company, int size) {
		this.company = company;
		this.size = size;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
