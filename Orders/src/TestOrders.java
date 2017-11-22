import java.util.Date;

public class TestOrders {

	public static void main(String[] args) {
		Orders o1=new Orders("T-Shirt",1234,"810 sw mill st,ls,mo,64081",150);
		Orders o2=new Orders("Phant",2345,"810 sw mill st,ls,mo,64081",250);
		o1.PurchaseItem();
		o2.PurchaseItem();
		o1.PurchaseItem(5);
		GiftOrder go=new GiftOrder("Phant",2345,"810 sw mill st,ls,mo,64081",250,10);
		int TotalCost=go.ItemCost+go.GiftWrapCost;
		System.out.println("cost of item with gift wrap ="+ TotalCost);
	}
	
}
