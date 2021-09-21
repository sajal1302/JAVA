package academy.learnprogramming;

public class objectreference {
    int x;
    objectreference(){

    }

    public static void main(String[] args) {
        objectreference ord= new objectreference();//ord will be holding the address
        System.out.println(ord.x);
    }
}
