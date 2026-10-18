package Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         System.out.println("How many questions are in the quiz");
         Scanner scan = new Scanner(System.in);
         final int NumQst=scan.nextInt();
         scan.nextLine();
         String[] array =new String[NumQst];
         System.out.println("Enter the key of each question in the quiz (one integer per question in a single line) ");
         String keys=scan.nextLine();
         array=keys.split(" ");
         int[] key =new int[NumQst];
         for(int i=0;i<NumQst;i++){
              key[i]=Integer.parseInt(array[i]);
         }
         String Res="y";
         while(Res.equals("y")){
              System.out.println("Enter the answers for the quiz");
              String answers=scan.nextLine();
              String[] answerParts = answers.split(" ");
              int correctCount = 0;
              for (int i=0; i<NumQst; i++) {
                   int answer=Integer.parseInt(answerParts[i]);
                   if (answer==key[i]) {
                        correctCount++;
                   }
              }
              double percent=(double)correctCount/NumQst*100;
              System.out.println("Number correct: "+correctCount+" out of "+NumQst);
              System.out.printf("Percent correct: %.2f%%\n",percent);
              System.out.println("Grade another quiz? (y/n)");
              Res=scan.next();
              scan.nextLine();
         }
         System.out.println("Closed");
         scan.close();
    }
}
