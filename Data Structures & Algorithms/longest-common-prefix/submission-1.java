class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        if(strs.length == 1) return strs[0];
        for(int j = 0; j < Math.min(strs[0].length(),strs[1].length()); j++){
                if(strs[0].charAt(j)==strs[1].charAt(j)){
                    sb.append(strs[0].charAt(j));
                }
                else break;
            }
            if(sb.length()==0) return "";
            System.out.println(sb);
        for(int i = 2; i < strs.length; i++){
            StringBuilder s = new StringBuilder("");
            for(int j = 0; j < Math.min(sb.length(),strs[i].length()); j++){
                if(strs[i].charAt(j)==sb.charAt(j)){
                    s.append(sb.charAt(j));
                }
                if(s.length()==0) return "";
            }
            sb = s;
        }
        return sb.toString();
        
    }
}