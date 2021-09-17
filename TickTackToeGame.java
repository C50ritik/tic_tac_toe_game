package com.workshop;

public class TicTackToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe GAme!!!!");
        createBoard();
    }
    public static void createBoard(){
        char[] board=new char[10];
        for(int index=1;index<=9;index++){
            board[index]=' ';
        }
    }
}
