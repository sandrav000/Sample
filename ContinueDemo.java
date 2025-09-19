public class ContinueDemo{
 int i=0;
public void display(){
while(i<10){
i++;
if(i==5){

continue;
}
System.out.println(i*i);

}
}
public static void main(String[] args){
ContinueDemo demo=new ContinueDemo();
demo.display();}
}