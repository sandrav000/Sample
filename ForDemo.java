public class ForDemo{
int n=7;
public void displayTable(){
for(int i=1;i<=10;i++){
System.out.println(i + "*" +n + "=" +(i*n));
}

}
public static void main(String[] args){
ForDemo demo=new ForDemo();
demo.displayTable();
}
}