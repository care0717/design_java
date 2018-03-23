package idcard;

import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap owners = new HashMap();
    private int number = 0;
    protected Product createProduct(String owner){
        return new IDCard(owner, number++);
    }

    protected void registerProduct(Product product){
        IDCard card = (IDCard)product;
        owners.put(card.getNumber(), card.getOwner());
    }
}