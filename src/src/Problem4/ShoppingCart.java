package Problem4;

public class ShoppingCart {
    private Item[] cart;
    private double totalPrice=0.0;
    private int NumItems=0;
    public ShoppingCart(int capacity){
        cart=new Item[capacity];
    }
    public void increaseSize(){
        cart=new Item[cart.length*2];
    }
    public void addToCart(Item item){
        if(NumItems==cart.length){
            increaseSize();
        }
        cart[NumItems]=item;
        NumItems++;
        totalPrice+=item.getPrice()*item.getQuantity();
    }
    public double getTotalPrice(){
        return totalPrice;
    }

}
