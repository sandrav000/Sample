public class Square{
int i=1;
public void printSquare(){
System.out.println("number \t square");
while(i<=10){
System.out.println(i+"\t"+(i*i));
i++;
}

}
public static void main(String[] args){
Square sq=new Square();
sq.printSquare();
}
}