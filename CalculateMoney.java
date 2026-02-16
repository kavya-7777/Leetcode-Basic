//1716. Calculate Money in Leetcode Bank

class Solution {
    public int totalMoney(int n) {

        int weeks = n / 7;
        int days = n % 7;

        int fullWeeksMoney = weeks * 28 + 7 * (weeks * (weeks - 1) / 2);

        int start = weeks + 1;
        int remainingMoney = 0;

        for (int i = 0; i < days; i++) {
            remainingMoney += start + i;
        }

        return fullWeeksMoney + remainingMoney;
    }
}

// class Solution {
//     public int totalMoney(int n) {
//         int i=1;
//         int sum=0;
//          while(n>0){
//             for(int j=i;j<i+7&&n>0;j++){
//                 sum+=j; 
//                 n--;
//             }
//             i++;
           
//          }
//       return sum;
//     }
// }