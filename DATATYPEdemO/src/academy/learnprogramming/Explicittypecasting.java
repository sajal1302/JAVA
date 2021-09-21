package academy.learnprogramming;

public class Explicittypecasting {
    public static void main(String[] args) {


        int i = 100;
        //byte b=i;
        byte b=(byte)i; //doing explicitly


        int x=97;
        //char ch=x;
        char ch =(char)x;

        System.out.println(ch);

        //pushing beyond range
        int y=130;
        byte z=(byte)y;
        System.out.println(z);

    }
}

