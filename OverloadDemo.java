// Example of method overloading with non-static instance methods (normal object methods).
// This is an example of compile-time polymorphism.

public class OverloadDemo{
int num1,num2,add;
double sum_double;

public void sum(){
num1=10;
num2=30;
add=num1+num2;
System.out.println("sum of the two numbers: " +add);
}

public void sum(int num1,int num2){
add=num1+num2;
System.out.println("sum of the two number :" +add);
}

public int sum(int num1,int num2,int num3){
add=num1+num2+num3;
return add;
}

public double sum(double num1,double num2){
sum_double=num1+num2;
return sum_double;
}

public static void main(String[] args){
OverloadDemo demo=new OverloadDemo();
demo.sum();
demo.sum(10,20);
int add=demo.sum(70,50,30);
double add_double=demo.sum(20.50,30.20);
System.out.println("sum of the integer values :" + add);
System.out.println("sum of the double values :" + add_double);

}

}