public class Even {
    public static void main(String[] args) {
        // Given an array of integers , return how many of them contain an even number of digits

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        System.out.println(digits2(88995));
    }
    static int findNumbers(int[] nums){
    int count = 0;
    for(int i=0; i<nums.length; i++){
        if(even(nums[i])){
            count++;
        }
    }
    return count;

    }

    // function to check whether a number contains even digits or not

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }


    static int digits2(int num){
        if(num < 0) num = num* -1;
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){
        if(num <  0) num = num* -1;
        if(num == 0) return 1;

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count ;
    }
}
