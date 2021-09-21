package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte a=28;
    short b=150;
    int c=10000;
    long  d=1000000000;
    char e='A';
    float f=1.3f;
    double g= 222222.6789;

//    #adding two byte value should be stored in int or do explicit type casting

        byte h=20;
        //byte j= a+h;


        byte result=(byte)(a+h);//explicit type casting
    }
}
