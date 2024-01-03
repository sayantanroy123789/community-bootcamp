import java.util.Scanner;
public class InputCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary: ");
        int total=sc.nextInt();
        if(total>10000){
            total=total+2000;
        }
        else if(total>20000){
            total=total+5000;
        }
        else {
            total=total+1000;
        }
        System.out.println("your net salary is:"+total);


    }
    
}
