package academy.learnprogramming;

/*
public class demo {
  //[  //how to create an object inside a static block
    static{
        demo obj = new demo();
        System.out.println(obj);// yo will see address where it is stored

    }
   // ]

    public static void main(String[] args) {

    }
}
*/

/*
//2.// creating static variable globally

public class demo {

    static demo obj;
    static{
        System.out.println(demo.obj);
        demo.obj= new demo();

    }


    public static void main(String[] args) {
        System.out.println("demo.obj");

    }
}

*/


// how to create reference inside a static method
public class demo {

    static demo obj = new demo();

    static {
        System.out.println(demo.obj);
        demo.init();

    }


    public static void main(String[] args) {
        System.out.println("demo.obj");

    }
    /*static void init(){
        demo.obj= new demo();
            }*/

    static demo init()
    {
        return new demo();
    }
}


