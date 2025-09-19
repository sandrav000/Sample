import java.util.*;

public class MatrixDemo{
int [][] arr1=new int[4][4];
Scanner sc=new Scanner(System.in);


public void assignValue(){
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
arr1[i][j]=sc.nextInt();
}
}
}
public void displayValue(){
for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
System.out.print(arr1[i][j] + "\t");
}
System.out.println();
}
}
public static void main(String[] args){
MatrixDemo demo=new MatrixDemo();
System.out.println("assign value to the matrix");
demo.assignValue();
System.out.println("printing the matrix");
demo.displayValue();
}
}