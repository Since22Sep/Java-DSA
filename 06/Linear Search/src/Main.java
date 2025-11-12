//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] nums = {23,45,1,2,819,-3,16,-11,28};
     int target = 28;
    int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0) return false;
        for(int element : arr){
            if(element == target) return true;
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0) return -1;

        for(int element: arr){
            if(element == target){
                return element;
            }
        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found

        return Integer.MAX_VALUE; // it is a constant in java that represents the largest possible value an int variable can hold.
        // if the target is not found , return a very large number , a value that will never appear as a real array element in normal class. especially if negative values could be part of valid data.
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run for a loop
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}