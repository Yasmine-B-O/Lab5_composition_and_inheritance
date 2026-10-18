package Problem4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        printMenu();
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        ShoppingCart cart=new ShoppingCart(1);

        while (choice==1){
            System.out.println("Enter the name of the item you want to add");
            String name=scan.next();
            System.out.println("Enter the item price");
            double price=scan.nextDouble();
            System.out.println("Enter the quantity");
            int quantity=scan.nextInt();
            cart.addToCart(new Item(name,price,quantity));
            printMenu();
            choice=scan.nextInt();
        }
        System.out.println("Please pay "+cart.getTotalPrice());
    }
    public static void printMenu(){
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Continue Shopping");
    }
}
