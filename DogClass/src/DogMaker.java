public class DogMaker {
private String name;
private int age;

public DogMaker () {
name = "noName";
age= -1;

}
public DogMaker(String x, int y) {

name = x;
age= y;
}
public void printInfo() {
System.out.println("Dogs name is "+ name + " and the age is "+ age);
}

}


