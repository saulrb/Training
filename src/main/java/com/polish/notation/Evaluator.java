package com.polish.notation;

import java.util.Arrays;
import java.util.Stack;

public class Evaluator {
    Stack<String> elements;
    String operators = "+-*/";
    public int evaluate(String[] opers1) {
        elements = new Stack<>();
        Arrays.stream(opers1).sequential().forEach( val -> {
            if ( operators.contains(val) ){
                String oper1 = elements.pop();
                String oper2 = elements.pop();
               elements.push(String.valueOf(calculate(oper1,oper2,val))) ;
            } else {
                elements.push(val);
            }
        });
      return Integer.parseInt(elements.pop());
    }
    private int calculate(String operador2, String operador1, String operando){
        switch (operando) {
            case "+" : {
               return Integer.parseInt(operador1) + Integer.parseInt(operador2);
            }
            case "-" : {
                return Integer.parseInt(operador1) - Integer.parseInt(operador2);
            }
            case "/" : {
                return Integer.parseInt(operador1) / Integer.parseInt(operador2);
            }
            case "*" : {
                return Integer.parseInt(operador1) * Integer.parseInt(operador2);
            }
        }
        return 0;
    }
}
