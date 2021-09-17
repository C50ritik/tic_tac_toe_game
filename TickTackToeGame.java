package com.workshop;

import java.util.Scanner;

public class TicTackToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe GAme!!!!");
        char[] board=createBoard();				            //Calling the createBoard function
        char player=selection();
        char computer;
        if(player=='X'){
            computer='O';
        }
        else {
            computer='X';
        }
        System.out.println("player :"+player+" "+"Computer :"+computer);
    }
    public static char[] createBoard(){
        char[] board=new char[10];
        for(int index=1;index<=9;index++){      // making all position of ticktacktoegame to null
            board[index]=' ';
        }
        return board;
    }
    public static char selection(){         //selection of X or O;
        Scanner sc=new Scanner(System.in);
        char player=sc.next().charAt(0);
        return player;
    }
}