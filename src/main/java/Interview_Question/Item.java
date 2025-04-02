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
}

