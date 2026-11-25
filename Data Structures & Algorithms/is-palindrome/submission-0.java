class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = "";
        for (int i=0; i<s.length(); i++){
            if ("abcdeghijklmnopqrstuvwxyz0123456789".indexOf(s.toLowerCase().charAt(i))!=-1){
                cleaned +=s.toLowerCase().charAt(i);
            }
        }
        for (int i=0; i<cleaned.length()/2; i++)
            if (cleaned.charAt(i)!=cleaned.charAt(cleaned.length()-1-i)) return false;
        return true;
    }
}
