public class MethodDemo{

public void demo(){
System.out.println("this is a demo method");
}

public static void display(){
System.out.println("this is the static method");
}

public static void main(String[] args){
MethodDemo methoddemo=new MethodDemo();
methoddemo.demo();
display();

}
}