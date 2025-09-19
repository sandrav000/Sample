public class IfElseDemo{
int a=20;
int b=70;

public void display(){
if(a>b){
System.out.println(a+ "is greater than" +b);
}
else{
System.out.println(b +" is greater than " +a);
}
}

public static void main(String[] args){
IfElseDemo demo=new IfElseDemo();
demo.display();
}
}