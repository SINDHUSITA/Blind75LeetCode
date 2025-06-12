// Last updated: 6/12/2025, 8:29:36 AM
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uemails = new HashSet<>();
        for(String emial : emails){
            String names[] = emial.split("@");
            String parts[] = names[0].split("\\+");
            uemails.add(parts[0].replace(".","")+"@"+names[1]);
        }
        return uemails.size();
    }
    
    
}