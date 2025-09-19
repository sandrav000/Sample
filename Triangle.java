public class Triangle{
public void display(){
for(int i=0;i<=5;i++){
for(int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
public static void main(String[] args){
Triangle t=new Triangle();
t.display();
}

}