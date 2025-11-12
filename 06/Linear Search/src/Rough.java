import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        // given an array of integers , return how many of them contain an even number of digits
        int[] nums = {12,345,2,6,7896};
    }
static int findNo(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(even(nums[i])){
                count++
            }
        }
        return count;
}

static boolean even(int num){
        int noOfDigits = digits(num);
        return noOfDigits %2 == 0;
}

static int digits(int num){
        if(num < 0) num = num * -1;
        if(num == 0) retun 1;
        int countOfDigits = 0;
        while(n > 0){
            countOfDigits++;
            n = n/10;

        }
        return countOfDigits;
}
}

