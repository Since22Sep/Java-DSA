public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Dipanshu";
        {
//            int a = 78; already initialized outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Hrithik";
            System.out.println(name);
            // values initialized in this block will remain in block
        }
         int c = 900;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);

      // scoping in for loops
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
    }
}


// Anything initialized outside  the block can be used inside but can not be initialized again,
// and anything that is initialized inside the block can be initialized outside the block as well
// but cannot be used outside.