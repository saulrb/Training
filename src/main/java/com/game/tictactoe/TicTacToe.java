package com.game.tictactoe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TicTacToe {
    static Character[] board = {'1','2','3','4','5','6','7','8','9'};
    final static String XXX_LINE = "XXX";
    final static String OOO_LINE = "OOO";

    static Predicate<String>  vLineScenario1 = ( s -> {
         StringBuilder sb = new StringBuilder();
         sb.append(board[0]);sb.append(board[1]);sb.append(board[2]);
         return sb.toString().equals(s);
    });
    static Predicate<String>  vLineScenario2 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[3]);sb.append(board[4]);sb.append(board[5]);
        return sb.toString().equals(s);
    });
    static Predicate<String>  vLineScenario3 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[6]);sb.append(board[7]);sb.append(board[8]);
        return sb.toString().equals(s);
    });
    static Predicate<String>  hLineScenario1 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[0]);sb.append(board[3]);sb.append(board[6]);
        return sb.toString().equals(s);
    });
    static Predicate<String>  hLineScenario2 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[1]);sb.append(board[4]);sb.append(board[7]);
        return sb.toString().equals(s);
    });
    static Predicate<String>  hLineScenario3 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[2]);sb.append(board[5]);sb.append(board[8]);
        return sb.toString().equals(s);
    });

    static Predicate<String> pLineScenario1 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[0]);sb.append(board[4]);sb.append(board[8]);
        return sb.toString().equals(s);
    });
    static Predicate<String> pLineScenario2 = ( s -> {
        StringBuilder sb = new StringBuilder();
        sb.append(board[2]);sb.append(board[4]);sb.append(board[6]);
        return sb.toString().equals(s);
    });

    static List<Predicate<String>> validationCases = new ArrayList<>();

    static {
        validationCases.add(vLineScenario1);
        validationCases.add(vLineScenario2);
        validationCases.add(vLineScenario3);
        validationCases.add(hLineScenario1);
        validationCases.add(hLineScenario2);
        validationCases.add(hLineScenario3);
        validationCases.add(pLineScenario1);
        validationCases.add(pLineScenario2);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Character turn = 'X';
        String winner = null;
        System.out.println("Welcome to 3x3 tick tac toe");
        printBoard();
        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;
            try{
                
                numInput = in.nextInt();
                if(!(numInput > 0 && numInput <=9)) {
                    System.out.println(" Invalid input; re-enter slot number:");
                    continue;
                }
            }catch(InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }

            if (Character.isDigit(board[numInput - 1])) {
                board[numInput -1] = turn;
                if (turn.equals(Character.valueOf('X'))){
                    turn = 'O';
                } else {
                    turn = 'X';
                }
                printBoard();
                winner = checkWinner();
                if (winner == null ){
                    if (turn.equals('O')){
                        System.out.println("O will play next. Enter a slot number to place O in:");
                    }else {
                        System.out.println("X will play next. Enter a slot number to place X in:");
                    }
                }
            }else {
                System.out.println("Slot Already taken; re-enter slot number:");
            }
        }
        if (winner.equals("draw")){
            System.out.println("it is draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations!" +winner+"'s have won! Thanks for playing.") ;
        }

    }

    private static String checkWinner(){
        for(Predicate<String> scenario:validationCases){
            if (scenario.test(XXX_LINE)){
                return "X";
            }
            if (scenario.test(OOO_LINE)){
                return  "O";
            }
        }
        boolean done = true;
        for(Character c :board){
            if(Character.isDigit(c)) {
               done = false;
            }
        }
        return done ? "draw" : null;
    }

    private static void printBoard(){
        for(int i = 0; i < 9 ;) {
            System.out.println("|---|---|---|");
            System.out.println("| "+board[i]+" | "+board[++i]+" | "+board[++i]+" |");
            i++;
        }
        System.out.println("|---|---|---|");
    }
}

