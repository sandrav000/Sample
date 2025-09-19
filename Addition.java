//invoking(call) parameterized methods and different return types.

public class Addition{
int var1,var2,sum;
double add_val;

public void sum(int var1,int var2){
this.var1=var1;
this.var2=var2;
sum=var1+var2;
System.out.println("sum of the two variables:"+ sum);
}

public int addNum(int var1,int var2){
this.var1=var1;
this.var2=var2;
sum=var1+var2;
return sum;
}
public double addDouble(double var1,double var2){
add_val=var1+var2;
return add_val;
}

public static void main(String[] args){
Addition add=new Addition();
add.sum(10,20);
int value=add.addNum(50,70);
System.out.println("sum of the addNum method " + value);
double sum=add.addDouble(75.85,10.25);
System.out.println("sum of the addDouble method:"  +sum);
}
}