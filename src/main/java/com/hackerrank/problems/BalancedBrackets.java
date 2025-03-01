package com.hackerrank.problems;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack stack = new Stack();
        boolean valid = true;
        String val = "";
        for(int i = 0; i < s.length() ; i++){
            switch (s.substring(i,i+1)){
                case "{":
                    stack.push(s.substring(i,i+1));
                    break;
                case "[":
                    stack.push(s.substring(i,i+1));
                    break;
                case "(":
                    stack.push(s.substring(i,i+1));
                    break;
                case ")":
                    val =!stack.empty() ? (String) stack.pop() :")";
                    if ( !val.equals("(") )  {
                        valid = false;
                    }
                    break;
                case "]":
                    val = !stack.empty() ? (String) stack.pop() : "]";
                    if ( !val.equals("[") )  {
                        valid = false;
                    }
                    break;
                case "}":
                    val = !stack.empty() ? (String) stack.pop() : "}";
                    if ( !val.equals("{") )  {
                        valid = false;
                    }
                    break;
            }
        }
        if (!stack.empty()) {
            valid = false;
        }
        return valid ? "YES" : "NO";
    }
}
