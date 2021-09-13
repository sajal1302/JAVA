package academy.learnprogramming;

public class method {
    public static void main(String[] args) {
        System.out.println("Inside main");
        method.method1();

    }
    static void method1()
    {
        System.out.println("Inside method1");
    }
    static{
        System.out.println(" Inside Static Block 1");
        method.method1();
    }
}
