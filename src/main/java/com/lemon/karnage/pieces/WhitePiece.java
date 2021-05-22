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
 * @author Beaumont
 */
public class WhitePiece extends Piece{
    
    private final int value = Integer.MAX_VALUE;
    private final String name;
    private int[] currentPos = new int[2];
    private static List<WhitePiece> whiteList = new ArrayList<>();
    
    public WhitePiece(String n,char v, int h){
        this.name = n;
        setPos(v, h);
        whiteList.add(this);
        
    }
    
    public static WhitePiece getWhiteList(int x){
        return whiteList.get(x);
    }
    
    public static int getWhiteListLength(){
        return whiteList.size();
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
    
    public static void drawWhitePieces(){
        WhitePiece king = new WhitePiece("wK", 'e', 1);
        WhitePiece queen = new WhitePiece("wQ", 'd', 1);
        WhitePiece kbishop = new WhitePiece("wB", 'f', 1);
        WhitePiece qbishop = new WhitePiece("wB", 'c', 1);
        WhitePiece kknight = new WhitePiece("wK", 'g', 1);
        WhitePiece qknight = new WhitePiece("wK", 'b', 1);
        WhitePiece krook = new WhitePiece("wR", 'h', 1);
        WhitePiece qrook = new WhitePiece("wR", 'a', 1);

        WhitePiece wpawna = new WhitePiece("wP", 'a', 2);
        WhitePiece wpawnb = new WhitePiece("wP", 'b', 2);
        WhitePiece wpawnc = new WhitePiece("wP", 'c', 2);
        WhitePiece wpawnd = new WhitePiece("wP", 'd', 2);
        WhitePiece wpawne = new WhitePiece("wP", 'e', 2);
        WhitePiece wpawnf = new WhitePiece("wP", 'f', 2);
        WhitePiece wpawng = new WhitePiece("wP", 'g', 2);
        WhitePiece wpawnh = new WhitePiece("wP", 'h', 2);
    }
    
    public static void setWhitePos(Board board){
        for(int i = 0; i < WhitePiece.getWhiteListLength(); i++){
            Piece piece = WhitePiece.getWhiteList(i);
            board.move(piece.getName(), piece.getPos());
        }
    }
}
