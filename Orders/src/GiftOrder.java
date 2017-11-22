
public class GiftOrder extends Orders {
	int GiftWrapCost;
    public GiftOrder(String ItemName, int ItemId, String address, int ItemCost,int GiftWrapCost) {
	super(ItemName, ItemId, address, ItemCost);
	this.GiftWrapCost=GiftWrapCost;
	}


}
