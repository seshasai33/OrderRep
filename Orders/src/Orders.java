import java.util.*;

public class Orders {
	String ItemName;
	int ItemId;
	String address;
	int AvailableBalance;
	int ItemCost;
	public Orders(String ItemName,int ItemId,String address,int ItemCost) {
		this.ItemName=ItemName;
		this.ItemId=ItemId;
		this.address=address;
		this.ItemCost=ItemCost;
	}
	public void PurchaseItem() {
		System.out.println("enter bank balance");
		Scanner sc = new Scanner(System.in);
		int ip=sc.nextInt();
		AvailableBalance=ip;
		if(ItemCost>AvailableBalance) {
			System.err.println("Insufficient funds");
		}
		else {
			AvailableBalance=AvailableBalance-ItemCost;
			System.out.println("Balance remaining :"+AvailableBalance+
					"\nItem details:"+ItemName + ItemId+ 
					"\npurchased and will be shipped to:"+address);
		}
	}
	public void PurchaseItem(int CuponAmt) {
		ItemCost=ItemCost-CuponAmt;
		PurchaseItem();
		
		}
		
	}
	

