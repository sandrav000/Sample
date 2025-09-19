public class Person{
static String name;
static int age;

public static void setData(String n, int a){
name = n;
age = a;
}

public static void getData() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}

public static void main(String[] args) {
setData("Sandra", 26);
getData();
}
}



