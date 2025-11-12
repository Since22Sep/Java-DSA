public class MaxWealth {
    public static void main(String[] args) {
        // you are given a m*n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. return the wealth that the richest cutomer has.


    }
    public int MaximumWealth(int[][] accounts){
        // person = rol
        // account col
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
