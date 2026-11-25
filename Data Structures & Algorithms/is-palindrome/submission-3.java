class Solution {
    public boolean isPalindrome(String s) {
        //This keeps $O(n)$ time and $O(n)$ space
        StringBuilder cleaned = new StringBuilder();
        String allowed = "abcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (allowed.indexOf(c) != -1) {
                cleaned.append(c);
            }
        }

        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}