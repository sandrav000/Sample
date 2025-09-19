public class VariablesEg{
int var1; // instance variable
static int counter; //static variable

public void displayData(){
System.out.println("instance variable:"+var1);
System.out.println("static variable: "+counter);
var1++;
counter++;
System.out.println("instance variable:"+var1);
System.out.println("static variable: "+counter);
}
public static void main(String[] args){
VariablesEg v=new VariablesEg();
v.displayData();
VariablesEg v1=new VariablesEg();
v1.displayData();
}
}