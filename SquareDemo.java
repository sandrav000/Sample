public class SquareDemo{
int i=1;
public void display(){
do{
System.out.println(i*i);
i++;
}while(i<=10);

}
public static void main(String[] args){
SquareDemo sq=new SquareDemo();
sq.display();
} 
}