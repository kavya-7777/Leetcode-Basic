//125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int left=0, right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         String str = "";
//         for(int i=0;i<s.length();i++){
//             if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
//                 str+=s.charAt(i);
//         }
//         str = str.toLowerCase();
//         System.out.println(str);
//         int j=str.length()-1;
//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(j)) return false;
//             j--;
//         }
//         return true;
//     }
// }