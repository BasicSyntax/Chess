/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lemon.karnage.Chess;

import com.lemon.karnage.pieces.*;
import com.lemon.karnage.view.Board;

/**
 *
 * @author Beaumont
 */
public class ChessMain {
    public static void main(String[] args){
        Board board = new Board();
        WhitePiece.drawWhitePieces();
        WhitePiece.setWhitePos(board); 
        BlackPiece.drawBlackPieces();
        BlackPiece.setBlackPos(board); 
        board.draw();
    }
}
