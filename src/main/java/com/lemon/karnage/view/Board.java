/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lemon.karnage.view;

/**
 *
 * @author Beaumont
 */
public class Board {
    private final int[] verticalAxis = { 1, 2, 3, 4, 5, 6, 7, 8};
    private final char[] horizontalAxis = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private String[][] boardState = new String[verticalAxis.length][horizontalAxis.length];
    
    public Board(){
        reset();
    }
    
    public static void println() {
        System.out.println();
    }
    
    public void reset(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        
        for(int i = verticalAxis.length - 1; i >= 0; i--){
            for(int j = 0; j < horizontalAxis.length; j++){
                boardState[i][j] = "__";
            }
        }
    }
    
    public void draw(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        
        System.out.println("    a   b   c   d   e   f   g   h  ");
        println();
        
        for(int ii = verticalAxis.length - 1; ii >= 0; ii--){
            System.out.print(verticalAxis[ii] + "");
            for(int i = ii; i >= 0;){
                for(int j = 0; j < horizontalAxis.length; j++){
    //                System.out.print("[" + verticalAxis[i] + horizontalAxis[j] + "] ");
                    System.out.print("  " + boardState[i][j]);
                }
                break;
            }
            System.out.println("  " + verticalAxis[ii]);
            println();
        }   
        System.out.println("    a   b   c   d   e   f   g   h  ");
    }
    
    public void move(String name, int[] dest){
        boardState[dest[1] - 1][dest[0] - 97] = name;
    }
    
}

