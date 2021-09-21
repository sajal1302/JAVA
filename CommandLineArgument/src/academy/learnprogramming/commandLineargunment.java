package academy.learnprogramming;

public class commandLineargunment {
    public static void main(String[] args) {
        // write your code here
        int length = args.length;
        if (length == 0) {
            System.out.println("No Inputs Provided ");
        } else {
            System.out.println("List of argument");
            for (int i = 0; i < length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
