public class Calculator{
int a,b,c;
int choice;
public void calculate(){
a=10;
b=20;
choice=1;
System.out.println("Menu");
System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:Multipliction");
System.out.println("4:Division");
switch(choice){

case 1:{
c=a+b;
System.out.println("Sum of two numbers :"+c);
break;
}
case 2:{
c=a-b;
System.out.println("Difference of two numbers :"+c);
break;
}
case 3:{
c=a*b;
System.out.println("Product of two numbers :"+c);
break;
}
case 4:{
c=a/b;
System.out.println("Quotient of two numbers :"+c);
break;
}
default:
System.out.println("Wrong entry");


}
}
public static void main(String[] args){

Calculator calc =new Calculator();
calc.calculate();
}
}