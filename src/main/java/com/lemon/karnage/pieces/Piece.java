/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lemon.karnage.pieces;

/**
 *
 * @author Beaumont
 */

public abstract class Piece {

    private int value = 0;
    private String name = "";
    private int[] currentPos = new int[2];
    
    public abstract int getValue();
    
    public abstract String getName();
    
    public abstract void setPos(char v, int h);
    
    public abstract int[] getPos();
}
