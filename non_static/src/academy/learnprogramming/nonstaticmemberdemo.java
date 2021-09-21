package academy.learnprogramming;

public class nonstaticmemberdemo {
    int num;
    nonstaticmemberdemo(){ //constructor having same name as class
        System.out.println("Inside the Constructor");

    }
    {
        System.out.println("inside the non static block");

    }
    public static void main(String[] args) {
        System.out.println("inside main method");
        //to create a instance we use new keyword
        //new nonstaticmemberdemo();
    nonstaticmemberdemo obj= new nonstaticmemberdemo();
    obj.dosomething();

    }

    static
    {
        System.out.println("Inside the block");
    }
   // initiating a nonstatic method
    void dosomething()
    {
        System.out.println("Inside do something");
    }

}
