class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> result= new ArrayList<>();
        
        int min= Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++)
        {
            min= Math.min(min, arr[i+1]-arr[i]);
        }
        
         for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i] == min)
            {
                List<Integer> list = new ArrayList<>();
                
                list.add(arr[i]);
                list.add(arr[i+1]);
                
                result.add(list);
            }
        }
        
return result;
        
    }
}