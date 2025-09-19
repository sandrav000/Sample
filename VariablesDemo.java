public class VariablesDemo{
	byte var1=10;
	short var2=1000;
	int var3=100000;
	long var4=3456890981l;
	float var5=10.15f;
	double var6=3015.20;
	boolean var7=true;
	char var8='b';
	String name="sandra";
public void displayData(){
System.out.println("byte data: "+var1);
System.out.println("short data: "+var2);
System.out.println("int data: "+var3);
System.out.println("long data: "+var4);
System.out.println("float data: "+var5);
System.out.println("double data: "+var6);
System.out.println("Boolean data: "+var7);
System.out.println("char data: "+var8);
System.out.println("string data: "+name);
}
public static void main(String[] args){
VariablesDemo vd=new VariablesDemo();
vd.displayData();

}
}