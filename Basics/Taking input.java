import java.util.Scanner;

public class Takeinput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number ");
        int a=sc.nextInt();
        System.out.println("enter 2nd number ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("answer is " +sum);
    }
}
