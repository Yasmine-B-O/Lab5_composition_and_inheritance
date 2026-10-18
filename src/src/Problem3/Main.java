package Problem3;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter an integer");
        Scanner scan=new Scanner(System.in);
        int Num=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter "+Num+" value");
        String line=scan.nextLine();
        String[] arr=line.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++){
            String m=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=m;
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
}
