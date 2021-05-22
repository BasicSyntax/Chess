/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lemon.karnage.pieces;

import com.lemon.karnage.view.Board;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BlackPiece
 */
public class BlackPiece extends Piece{
    
    private final int value = Integer.MAX_VALUE;
    private final String name;
    private int[] currentPos = new int[2];
    private static List<BlackPiece> blackList = new ArrayList<>();
    
    public BlackPiece(String n,char v, int h){
        this.name = n;
        setPos(v, h);
        blackList.add(this);
        
    }
    
    public static BlackPiece getBlackList(int x){
        return blackList.get(x);
    }
    
    public static int getBlackListLength(){
        return blackList.size();
    }
    
    public final int getValue(){
        return this.value;
    }
    
    public final String getName(){
        return this.name;
    }
    
    public final void setPos(char v, int h){
        this.currentPos[0] = (int) v;
        this.currentPos[1] = h;
    }
    
    public final int[] getPos(){
        return this.currentPos;
    }
    
    public static void drawBlackPieces(){
        BlackPiece bking = new BlackPiece("bK", 'e', 8);
        BlackPiece bqueen = new BlackPiece("bQ", 'd', 8);
        BlackPiece bkbishop = new BlackPiece("bB", 'f', 8);
        BlackPiece bqbishop = new BlackPiece("bB", 'c', 8);
        BlackPiece bkknight = new BlackPiece("bK", 'g', 8);
        BlackPiece bqknight = new BlackPiece("bK", 'b', 8);
        BlackPiece bkrook = new BlackPiece("bR", 'h', 8);
        BlackPiece bqrook = new BlackPiece("bR", 'a', 8);

        BlackPiece bpawna = new BlackPiece("bP", 'a', 7);
        BlackPiece bpawnb = new BlackPiece("bP", 'b', 7);
        BlackPiece bpawnc = new BlackPiece("bP", 'c', 7);
        BlackPiece bpawnd = new BlackPiece("bP", 'd', 7);
        BlackPiece bpawne = new BlackPiece("bP", 'e', 7);
        BlackPiece bpawnf = new BlackPiece("bP", 'f', 7);
        BlackPiece bpawng = new BlackPiece("bP", 'g', 7);
        BlackPiece bpawnh = new BlackPiece("bP", 'h', 7);
    }
    
    public static void setBlackPos(Board board){
        for(int i = 0; i < BlackPiece.getBlackListLength(); i++){
            Piece piece = BlackPiece.getBlackList(i);
            board.move(piece.getName(), piece.getPos());
        }
    }
}
