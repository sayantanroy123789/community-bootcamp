package Loops;
import java.util.Scanner;
public class Forloops {
    public static void main(String[] args) {
        for(int num=1;num<=5;num++){
            System.out.println(num);
        }
        //user input
        Scanner input=new Scanner(System.in);
        System.out.println("enter the renge:");
        int num=input.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
            
        }

    }
    
}
