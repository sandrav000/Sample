public class ThisDemo{
int var1,var2,sum;//this keyword is used to represent the instance variable
public ThisDemo(){
var1=10;
var2=20;
sum=var1+var2;
System.out.println("sum of the 2 numbers" + sum);
}

public ThisDemo(int var1,int var2){
this.var1=var1;
this.var2=var2;
sum=var1+var2;
System.out.println("sum of the 2 numbers" + sum);
}

public static void main(String[] args){
ThisDemo demo=new ThisDemo();
ThisDemo demo1=new ThisDemo(20,40);
}

}