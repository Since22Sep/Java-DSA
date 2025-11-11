public class Shadowing {
    static int x = 90;    // this will be shadowed at line

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // the class variable at line 2 is shadowed by this
//        System.out.println(x);   scope will begin when value is initialized
       x=  40;
        System.out.println(x); // 40
        fun(); // 90

    }
    static void fun(){
        System.out.println(x);
    }
}

// Shadowing effects does not takes place in methods because
// Shadowing is based on block scope not call scope.
// A method defines its own separate scope completely independent of where it is called.
// because java uses lexical scoping :- variable resolution depends on where the code is written not from whre it is called.