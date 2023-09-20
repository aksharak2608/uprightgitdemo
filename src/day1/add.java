package day1;

public class add {

    int add2(int a, int b)
    {
        int c=a+b;
        return c;
    }
    int add3(int a, int b, int c)
    {
        int d=a+b+c;
        return d;
    }

    public static void main(String[] args) {
        add obj= new add();
        System.out.println( obj.add2(4,5));
        int result=obj.add3(3,40,2);
        System.out.println(result);
    }

}
