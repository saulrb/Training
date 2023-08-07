package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        Scanner scanner = new Scanner(System.in);
        int queries = 0;
        List<String> values = new ArrayList<>();
        queries = scanner.nextInt();
        while(  queries > 0) {
            int v1 = scanner.nextInt();
            switch (v1) {
                case 1:
                    int v2 = scanner.nextInt();
                    stk1.push(v2);
                    break;
                case 2:
                    if(!stk2.empty()) {
                        stk2.pop();
                    } else{
                        while(!stk1.empty()){
                            stk2.push(stk1.peek());
                            stk1.pop();
                        }
                        stk2.pop();
                    }
                    break;
                case 3:
                    if(!stk2.empty()){
                        System.out.println(stk2.peek());
                    }else {
                        while(!stk1.empty()){
                            stk2.push(stk1.peek());
                            stk1.pop();
                        }
                        System.out.println(stk2.peek());
                    }
                    break;
            }
            queries --;
        }
    }
}
