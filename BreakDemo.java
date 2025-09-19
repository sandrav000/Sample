public class BreakDemo{
int i=1;
public void display(){
while(i<=10){
if(i==5){
break;
}
System.out.println(i*i);
i++;

}
}
public static void main(String[] args){
BreakDemo b=new BreakDemo();
b.display();
}

}