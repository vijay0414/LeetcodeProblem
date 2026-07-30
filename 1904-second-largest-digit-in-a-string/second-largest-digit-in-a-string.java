class Solution {
    public int secondHighest(String s) {
      List<Integer> list = new ArrayList<>();
      for(char c : s.toCharArray()){
        if(Character.isDigit(c) && !list.contains(c - '0')){
            list.add(c - '0');
        }
      }
      Collections.sort(list);
      if(list.size() <= 1) return -1;
      return list.get(list.size() - 2);
    }
}