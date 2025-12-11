//205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        for(int i=0;i<s.length();i++){
            if(mapST[s.charAt(i)] != mapTS[t.charAt(i)]) return false;
            mapST[s.charAt(i)]=i+1;
            mapTS[t.charAt(i)]=i+1;
        }
        return true;
    }
}

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> maps = new HashMap<>();
//         HashMap<Character, Character> mapt = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             if(!maps.containsKey(s.charAt(i))) maps.put(s.charAt(i),t.charAt(i));
//             else if (maps.get(s.charAt(i)) != t.charAt(i)) return false;

//             if(!mapt.containsKey(t.charAt(i))) mapt.put(t.charAt(i),s.charAt(i));
//             else if (mapt.get(t.charAt(i)) != s.charAt(i)) return false;
//         }
//         return true;
//     }
// }