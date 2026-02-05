//2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String ch : operations){
            if(ch.charAt(0) == '-') --x;
            else if(ch.charAt(0) == '+') ++x;
            else if(ch.charAt(2) == '-') x--;
            else if(ch.charAt(2) == '+') x++;
        }
        return x;
    }
}