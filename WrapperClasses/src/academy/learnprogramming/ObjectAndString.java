package academy.learnprogramming;

public class ObjectAndString {
    public static void main(String[] args) {
        long x=100;
        long y = Long.valueOf(x);//longtoobject
        String s= y.toString();
        Long z = Long.valueOf(s);//string back to object

    }
}
