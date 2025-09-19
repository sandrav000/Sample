public class ConstructorDemo{
int a,b,sum;
double c,d,sum_double;
public ConstructorDemo(){
System.out.println("this is the default construcot :");
System.out.println("this program is to show the egs of constructors ");
a=10;
b=20;
}

public ConstructorDemo(int a,int b){
System.out.println("this is the parameterized constructors ");
this.a=a;
this.b=b;

}

public ConstructorDemo(double c,double d){
this.c=c;
this.d=d;
}

public void demo(){

sum=a+b;
System.out.println("sum of the two numbers :" +sum);
}
public void demoDouble(){
sum_double=c+d;
System.out.println("sum of the two decimal numbers :" + sum_double);
}

public static void main(String[] args){
ConstructorDemo con=new ConstructorDemo();
con.demo();
ConstructorDemo con1=new ConstructorDemo(100,70);
con1.demo();
ConstructorDemo con2=new ConstructorDemo(50,200);
con2.demo();

ConstructorDemo con3=new ConstructorDemo(20.75,70.25);
con3.demoDouble();
}
}