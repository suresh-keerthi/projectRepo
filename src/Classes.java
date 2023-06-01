class Outer {
    private int outnum;
    private static int outnum2;

    Outer(int num) {
        this.outnum = num;
    }

    void display() {
        System.out.println("this is outer class static display method");
    }

    public class Inner {
        int innum;

        static int snum = 5;

        Inner(int innum) {
            this.innum = innum;

        }

        void display() {
            System.out.println("outer class private variable " + outnum);
            System.out.println("inner class variable " + innum);
        }

        /*
        Note:in inner class static methods cannot be declared
        * */


    }

    public static class Nested {
        int nestnum;

        Nested(int nestnum) {
            this.nestnum = nestnum;

        }

        static void display() {
            System.out.println("printing private static variable of outer class from nested class " + outnum2);
        }

        void display(int x) {
            System.out.println("just for showing non static method of static class " + x);
        }


    }

    Inner innerobject = new Inner(6);  //creating inner class object in outer class
    Nested nestedobject = new Nested(4); // creating nested  class object in outer class


}

public class Classes {
    public static void main(String[] args) {
        Outer outerclass = new Outer(5);
        Outer.Inner innerclass = outerclass.new Inner(6);
        innerclass.display();


        Outer.Nested nestedclass = new Outer.Nested(4);
        nestedclass.display(3);
        Outer.Nested.display();


    }
}
