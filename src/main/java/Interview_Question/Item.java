package Interview_Question;

import java.math.BigDecimal;

class Item {
    int itemQuantity;
    String itemName;
    BigDecimal itemPrice;

    public Item(String itemName, int itemQuantity, BigDecimal itemPrice) {
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
    
}

