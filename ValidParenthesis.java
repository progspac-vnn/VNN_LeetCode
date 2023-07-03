import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
          // All opening parentheses should be closed
          Stack<Character> stack = new Stack<>();

          for( char c:s.toCharArray()){
              if(c=='(' || c=='[' || c=='{')
              {
                  stack.push(c);
              }else if(c==')' || c=='}' || c==']')
              {
                  if(stack.isEmpty()){
                      return false;
                  }else{
                      char top = stack.pop();
                      if(c==')' && top!='(' || c==']' && top!='[' || c=='}' && top!='{' )
                      {
                          return false;
                      }
                  }

              }
          }

          return stack.isEmpty();
    }
}
