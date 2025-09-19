public class ArrayDemo{

int [] arr1=new int[10];

String [] weekdays={"sun","mon","tue","wed","thur","fri","sat"};

public void display(){
System.out.println(weekdays[0]);
arr1[0]=100;
System.out.println(arr1[0]);
System.out.println("display the days of the week");
for(int i=0;i<weekdays.length;i++){
System.out.println(weekdays[i]);
}

}
public static void main(String[] args){
ArrayDemo demo=new ArrayDemo();
demo.display();
}
}