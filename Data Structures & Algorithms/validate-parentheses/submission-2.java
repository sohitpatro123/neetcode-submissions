class Solution {
    public boolean isValid(String s) {
        //first try with just a stack
        //next, try with a stack and a hashmap
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');
        for (char c: s.toCharArray()){
            if (hm.containsKey(c)){
                stack.push(c);
            }
            else{
                if (!stack.isEmpty()){
                    char opening = stack.pop();
                    if (c!=hm.get(opening)){
                    return false;
                }
                }
                else return false;
            }
        }
        return stack.isEmpty();

        
    }
}