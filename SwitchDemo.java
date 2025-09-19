public class SwitchDemo{
char ch='a';

public void viewVowel(){
System.out.println("print if a varaiable is vowel or not");
switch(ch){
case 'a':{
System.out.println("a is a vowel");
break;
}
case 'e':{
System.out.println("e is a vowel");
break;
}
case 'i':{
System.out.println("i is a vowel");
break;
}
case 'o':{
System.out.println("o is a vowel");
break;
}
case 'u':{
System.out.println("u is a vowel");
break;
}
default:{
System.out.println("The letter entered is not a vowel");
}

}
}
public static void main(String[] args){

SwitchDemo demo=new SwitchDemo();

demo.viewVowel();

}
}