class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character,Integer> map = new HashMap<>();;
        map.put('U', -1);
        map.put('D', 1);
        map.put('L', -100);
        map.put('R', 100);

        char c[] = moves.toCharArray();
        int sum =0;
        for(int i =0; i< c.length; i++){
            sum = sum + map.get(c[i]);
        }
        if(sum ==0) return true;
        return false;
    }
}