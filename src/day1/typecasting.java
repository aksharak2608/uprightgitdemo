package day1;

public class typecasting {
    public static void main(String[] args) {
        typecasting obj= new typecasting();
        obj.wideningcasting();
        obj.narrowcasting();
    }
   void wideningcasting()
    {
        byte a=120;
        short b= (short) (a*5);
        System.out.println(b);
    }

    void narrowcasting()
    {
        byte a=120;
        short b= (short) (a*5);
        byte c= (byte) (b-500);
        System.out.println(c);
    }
}
