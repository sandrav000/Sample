//method overloading with static method.
public class MultiplyDemo{
static int product;
public static void multiply(){
int var1=20;
int var2=10;
product=var1*var2;
System.out.println("product of the two number :" + product);
} 
public static void multiply(int var1,int var2){
product=var1*var2;
System.out.println("product of the two numbers :" + product);

}
public static double multiply(double var1,double var2){
double product=var1*var2;
return product;

}
public static void main(String[] args){
multiply();
multiply(20,30);
double product_val=multiply(30.50,20.50);
System.out.println("product of thedouble value :" +product_val);


}
}