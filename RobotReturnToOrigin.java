//657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int[] freq=new int[26];
        for(char ch:moves.toCharArray()){
            freq[ch-'A']++;
        }
        return freq['U'-'A']==freq['D'-'A'] && freq['L'-'A']==freq['R'-'A'];
    }
}

// class Solution {
//     public boolean judgeCircle(String moves) {
//         int x=0,y=0;
//         for(char ch:moves.toCharArray()){
//             if(ch=='U') y++;
//             else if(ch=='D') y--;
//             else if(ch=='R') x++;
//             else if(ch=='L') x--;
//         }
//         return x==0 && y==0;
//     }
// }