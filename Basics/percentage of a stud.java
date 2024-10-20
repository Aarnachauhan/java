import java.util.Scanner;
class Marks{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the marks of english");
     int engmarks=sc.nextInt();
     System.out.println("enter the marks of computer science");
     int csmarks=sc.nextInt();
     System.out.println("enter the marks of physics");
     int phymarks=sc.nextInt();
     System.out.println("enter the marks of chemistry");
     int chemmarks=sc.nextInt();
     System.out.println("enter the marks of maths");
     int mathmarks=sc.nextInt();
     int totalmarks=engmarks+csmarks+phymarks+chemmarks + mathmarks;
     System.out.println("total marks of the student"+ totalmarks);
     int maxmarks=500;
     int hun=100;
     int percentage=(hun*totalmarks/maxmarks);
   
     System.out.println(" percentage of the student is"+ percentage);
 }
}
