import java.util.Arrays;

public class VarLenArgs {
    public static void main(String[] args) {
        fun(2,3,5,6,7,8,9,9,0,5,5,4,4,3,3,4,5,5,5,5);
        fun();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
