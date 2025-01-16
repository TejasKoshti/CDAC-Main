import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> charList = new Stack<Character>();

        // for(int i = 0 ; i < s.length() ; i++){
        //     if(charList.isEmpty()){
        //         charList.push(s.charAt(i));
        //     }
        //     else if( (charList.peek() == '(' && s.charAt(i) == ')') ||
        //              (charList.peek() == '{' && s.charAt(i) == '}') ||
        //              (charList.peek() == '[' && s.charAt(i) == ']') ){
        //                 charList.pop();
        //              }
        //     else{
        //         charList.push(s.charAt(i));
        //     }
        // }
        
        for(Character c : s.toCharArray()){
            if(charList.isEmpty()){
                charList.push(c);
            }
            else if( (charList.peek() == '(' && c == ')') ||
                     (charList.peek() == '{' && c == '}') ||
                     (charList.peek() == '[' && c == ']') ){
                        charList.pop();
                     }
            else{
                charList.push(c);
            }
        }

        return charList.isEmpty();
    }


    public static void main(String[] args) {
        String s = "([])";
        Solution ss = new Solution();
        System.out.println(ss.isValid(s));
    }
}