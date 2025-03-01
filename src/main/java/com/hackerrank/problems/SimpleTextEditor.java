package com.hackerrank.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        long commands = Long.parseLong(reader.readLine());
        String sb = "";
        int pos = 0;
        while( commands-- > 0){
            String[] v1 = reader.readLine().split(" ");
            switch ( v1[0]) {
                case "1":
                    stack.push(sb);
                    sb = sb + v1[1];
                    break;
                case "2":
                    stack.push(sb);
                    pos = Integer.parseInt(v1[1]);
                    if (pos <= sb.length()) {
                        int ll = sb.length();
                        sb = sb.substring(0, ll - pos);
                    }
                    break;
                case "3":
                    pos = Integer.parseInt(v1[1]) - 1;
                    if(pos <= sb.length()) {
                        System.out.println(sb.substring(pos,pos+1));
                    }
                    break;
                case "4":
                    if (!stack.empty()) {
                        sb = stack.pop();
                    }
                    break;
            }
        }

    }
}
