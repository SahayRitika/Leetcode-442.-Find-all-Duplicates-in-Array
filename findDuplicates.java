class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(Integer x: nums){
            map.put(x, map.getOrDefault(x,0)+1);
            if(map.get(x)==2){
                ans.add(x);
            }
        }
        return ans;
    }
}
