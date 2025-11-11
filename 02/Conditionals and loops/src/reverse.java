public class reverse {
    public static void main(String[] args) {
        int n = 123456;

        int ans = 0;
        while(n>0){
            int num = n%10;
            n = n/10;

            ans = ans * 10 + num;
        }
        System.out.println(ans);
    }
}
