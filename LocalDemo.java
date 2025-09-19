public class LocalDemo{
int var1 =10;       //instance variable
public void displayLocal(){
int var2=20;        //local variable
System.out.println("local varible" +var2);

}
public void displayData(){
System.out.println("instance variable" +var1);
// System.out.println("local varible" +var2);
}
public static void main(String[] args){
LocalDemo local=new LocalDemo();
local.displayLocal();
local.displayData();

}
}