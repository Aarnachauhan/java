import java.io.*;
class A{
    String message;
    public void display(){
        System.out.println("hello this is display function");
    }
}
class B extends A{
    public void show(){
        System.out.println("hello this is show function");
    }
}
public class main{
    public static void main(String[] args){
    B obj=new B();
    obj.display();

    obj.show();
}
}
