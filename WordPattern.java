//290. Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if(pattern.length() != words.length) return false;

        HashMap<Character, String> mapPS = new HashMap<>();
        HashMap<String, Character> mapSP = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            if(!mapPS.containsKey(pattern.charAt(i))) mapPS.put(pattern.charAt(i),words[i]);
            else if(!mapPS.get(pattern.charAt(i)).equals(words[i])) return false;

            if(!mapSP.containsKey(words[i])) mapSP.put(words[i],pattern.charAt(i));
            else if(mapSP.get(words[i]) != pattern.charAt(i)) return false;
        }
        return true;
    }
}