package academy.learnprogramming;

public class thiskeyword {
    int x;
    thiskeyword(){
        System.out.println(this);//this points where object reference & can be used in nonstatic context
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new thiskeyword();
        new thiskeyword();
    }
}
