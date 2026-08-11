class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        Map<Character,String> map = new LinkedHashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        list.add("");
        for(char c : digits.toCharArray()){
            String str = map.get(c);
            List<String> m = new ArrayList<>(); 
            for(String k : list){
                for(char ch : str.toCharArray()){
                    m.add(k + ch);
                }
            }
            list = m;
        }
        return list;
    }
}