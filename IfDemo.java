public class IfDemo{
int a=10; 
int b=15;
public void decisionMaking(){
if(a<b){
System.out.println(b+"is the greatest");
}

}
public static void main(String[] args){
IfDemo demo=new IfDemo();
demo.decisionMaking();
}
}