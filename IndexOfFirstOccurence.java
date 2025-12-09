//28. Find the Index of the First Occurrence in a String

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int j=0;
//         for(int i=0;i<haystack.length();i++){
//             if(haystack.charAt(i) == needle.charAt(j)){
//                 if(j==needle.length()-1) return i-j;
//                 j++;
//             }
//             else{
//                 i=i-j;
//                 j=0;
//             }
//         }
//         return -1;
//     }
// }