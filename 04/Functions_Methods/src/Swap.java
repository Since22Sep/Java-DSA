public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//       swap numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Dipanshu Sharma";
        changeName(name);
        System.out.println(name);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // THIS CHANGE WILL BE VALID IN THIS FUNCTION SCOPE ONLY
    }

    static void changeName(String naam){
        naam = "Hrithik Sharma";
    }
}
