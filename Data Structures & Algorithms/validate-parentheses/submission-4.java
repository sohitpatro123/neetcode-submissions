class Solution {
    public boolean isValid(String s) {
        //first try with just a stack
        //next, try with a stack and a hashmap
        //even if you use getValue instead of getKey--which you can get if the keys were closing brackets and the values were opening brackets instead (like in LeetCode niit soln), it's fine
        // The key here is that the two operations depend on different sizes:The for loop runs once per character in s, so it takes $O(n)$ iterations, where $n = \text{s.length()}$.mapping.containsValue(c) scans the entries in mapping, so it takes $O(m)$ time, where $m$ is the number of entries in the map.Because mapping is hardcoded with 3 bracket pairs (')', '}', ']'), $m$ is always $3$—even if s has 10 million characters.Multiplying them together gives:$$n \times 3 = 3n = O(n)$$So this code is $O(n)$, not $O(n^2)$.
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