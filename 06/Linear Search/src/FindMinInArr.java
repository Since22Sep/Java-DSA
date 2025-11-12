public class FindMinInArr {
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,67,78,89,90};
        // return the minimum value in the array
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans) ans = arr[i];
        }
        return ans;
    }
}
