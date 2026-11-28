class MyHashSet {
   public List<Integer> [] arr;
   public static final int n = 1000;
   public MyHashSet() {
        arr = new List[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
    }
    
    public void add(int key) {
        if(contains(key)) return;
        else arr[key%n].add(key);
    }
    
    public void remove(int key) {
        if(!contains(key)) return;
        else arr[key%n].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = key % n;
        List<Integer> list = arr[index];
        if(list.contains(key)) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */