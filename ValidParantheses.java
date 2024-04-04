/**
Utilize a stack to keep track of opening brackets encountered.
Iterate through the characters of the string, pushing opening brackets onto the stack and popping the corresponding opening bracket when a closing bracket is encountered.
Return true if the stack is empty at the end, indicating all brackets are properly matched; otherwise, return false.
TC -O(n), SC- O(n)
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);

            }
            else if(c == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
             else if(c == '}'){
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
             else if(c == ']'){
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();

        
    }
}
