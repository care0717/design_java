package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner;
    private int number;
    IDCard(String owner, int number){
        System.out.println(owner+"のカードを作ります"+number) ;
        this.number = number;
        this.owner = owner;
    }
    public void use(){
        System.out.println(owner+"のカードを使います") ;
    }
    public String getOwner(){
        return owner;
    }
    public int getNumber(){
        return number;
    }
}