class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0 ;i < g.length;i++ ){
           List<Integer> list1 = map.getOrDefault(g[i], new ArrayList<>());
           list1.add(i);
           map.put(g[i], list1);
        }

        //System.out.println(map.toString());
        for(int i : map.keySet()){
            List<Integer> l = new ArrayList<>();
            for(int j = 0 ;j < map.get(i).size();j++){
                l.add(map.get(i).get(j));
                if(l.size() == i){
                    list.add(new ArrayList(l));
                    l.clear();
                }
            }
        }
        return list;
    }
}