class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hmap = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!hmap.containsKey(temp)){
                List<String> l = new ArrayList();
                l.add(s);
                hmap.put(temp,l);
            } 
            else {
               List<String> list = hmap.get(temp);
               list.add(s);
               hmap.put(temp,list);
            }
        }
        List<List<String>> outer = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : hmap.entrySet()){
            outer.add(entry.getValue());
        }
        return outer;
    }
}
