class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!freq.containsKey(c)) freq.put(c,1);
            else freq.put(c,freq.get(c)+1);
        }
        for(char c : t.toCharArray()){
            if(freq.containsKey(c)){
                if(freq.get(c)>1) freq.put(c,freq.get(c)-1);
                else freq.remove(c);
            }
            else return false;
        }
        return true;

    }
}
