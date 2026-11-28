class Solution {
    public boolean isValid(String s) {
        //first try with just a stack
        //next, try with a stack and a hashmap
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if (!stack.isEmpty()){
                    char opening = stack.pop();
                    if ((opening=='(' && c!=')') || (opening=='{' && c!='}') || (opening=='[' && c!=']')){
                    return false;
                }
                }
                else return false;
            }
        }
        return stack.isEmpty();

        
    }
}