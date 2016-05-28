package org.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by rajeevgurram on 5/28/16.
 */
public class BracketSyntax {
    private Map<Character, Character> openBrackets= new HashMap<Character, Character>();
    private Map<Character, Character> closedBrackets= new HashMap<Character, Character>();
    private Stack<Character> stack= new Stack<Character>();

    public BracketSyntax(){
        openBrackets.put('{', '}');
        openBrackets.put('(', ')');
        openBrackets.put('[', ']');

        closedBrackets.put('}', '{');
        closedBrackets.put(')', '(');
        closedBrackets.put(']', '[');
    }

    public boolean checkSyntax(String code){
        char[] codeChars= code.toCharArray();

        for(int i=0; i<codeChars.length; i++){
            if(openBrackets.get(codeChars[i]) !=null){
                stack.push(codeChars[i]);
            }
            else{
                if(closedBrackets.get(codeChars[i]) !=null){
                    if( openBrackets.get(stack.pop()) != codeChars[i] ){
                        return false;
                    }
                }
            }
        }

        if(stack.size() > 0){
            return false;
        }

        return true;
    }
}
