class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.trim().split("\\s+");
        if(pattern.length() != arr.length) return false;
        int i = 0;
        for(char c : pattern.toCharArray()){
            if(!map.containsKey(c)){
                if (map.containsValue(arr[i])) return false;
                map.put(c,arr[i]);
            }else{
                String st = map.get(c);

                if(!st.equals(arr[i])) return false;
            }
            i++;
        }
       // System.out.println(map.toString());
        return true;
    }
}