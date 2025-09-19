public class If_ElseIf_Else_Demo{
double purchase_amt=50000;
public void displayDiscount(){
if((purchase_amt>=5000)&&(purchase_amt<10000)){
System.out.println("Discount provided is 2%");
}
else if((purchase_amt>=10000)&&(purchase_amt<25000)){
System.out.println("Discount provided is 3%");	
}
else if((purchase_amt>=25000)&&(purchase_amt<50000)){
System.out.println("Discount provided is 5%");	
}
else{
System.out.println("Discount provided is 10%");	
}

}
public static void main(String[] args){
If_ElseIf_Else_Demo demo=new If_ElseIf_Else_Demo();
demo.displayDiscount();
}
}