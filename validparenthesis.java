import java.util.*;
public class validparenthesis {
    public boolean isValid(String s){
        Stack<Integer> stack = new Stack<>();
        for(char c:s){
            if(c=='(' || c=='{' || c=='['){
                stack.push((int)c);
            } else {
                if(stack.isEmpty()) return false;
                int top = stack.pop();
                if((c==')' && top != '(') || (c=='}' && top != '{') || (c==']' && top != '[')){
                    return false;
                }
            }   
        }
    }
}
