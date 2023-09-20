package day1;

public class car {


String model;
int price;
static int abc=10;
    void modeOfDrive(String mode) {
        System.out.println("Mode of drive is "+mode);
        System.out.println("model is "+model);
        System.out.println("price is "+price);

    }
public static void teststatic()
{
    System.out.println("hello static");
}

public int testparam(int a)
{
    System.out.println(a);
    return a+1;
}
public static void main(String args[])
{
    car.teststatic();
    car obj= new car();
    System.out.println(car.abc);
    obj.model="vxi";
    obj.price=3000;
    obj.modeOfDrive("auto");

    car obj1= new car();

    obj1.model="vxi1";
    obj1.price=30002;
    obj1.modeOfDrive("auto1");
    System.out.println(obj1.testparam(5));
}

}
