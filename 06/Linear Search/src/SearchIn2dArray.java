import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,8,1},
                {88,85,96},
                {87,98,85,56},
                {1,69}
        };
        int target = 69;
        int[] ans = search(arr,target);

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr , int target){
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col}; // create a small new box in memory containing these two nos
                    // if we didn't use new java wouldn't know wherere the array is supposed to live
                }
            }
        }
        return new int[]{-1,-1};
    }

    // max in 2d array
    static int max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col] > maxVal){
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }

}
