// Last updated: 6/12/2025, 8:29:56 AM




class Solution {
    public String decodeString(String s) {
        

        Stack<Character> stack = new Stack<>();
        for(int i =0; i< s.length() ; i++){
            if(s.charAt(i)==']'){
                List<Character> temp = new ArrayList<>();
                while(stack.peek() != '['){
                    temp.add(stack.pop());                   
                }
                stack.pop();
                int base =1;
                int k = 0;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                while(k !=0){
                    for(int p = temp.size()-1; p>=0 ; p--){
                        stack.push(temp.get(p));
                    }
                    k--;
                }     
            }else{
                stack.push(s.charAt(i));
            }
        }
        char result[] = new char[stack.size()];
        for(int j=result.length-1; j>=0;j-- ){
            result[j] = stack.pop();
        }
        return new String(result);
    }
}