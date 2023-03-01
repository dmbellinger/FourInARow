package com.hfad.assignment2

import kotlin.random.Random

/**
 * TicTacToe class implements the interface
 * @author Dylan Bellinger
 * Assignment 2
 * @date 3/1/2023
 */
class FourInARow
/**
 * clear board and set current player
 */

    : IGame {
    // game board in 2D array initialized to zeros
    private val board = Array(GameConstants.ROWS) { IntArray(GameConstants.COLS){0} }

    var gameCount: Int = 0

    //Clears the board after win, loss or tie
    override fun clearBoard() {
        for (row in 0 until GameConstants.ROWS) {
            for (col in 0 until GameConstants.COLS) {
                board[row][col] = GameConstants.EMPTY
                //printCell(board[row][col])
            }
        }
    }

    //Sets the piece for the player or computer
    override fun setMove(player: Int, location: Int) {
        board[location%GameConstants.ROWS][location/GameConstants.COLS] = player
        gameCount++
    }

    //Determines the place the computer's piece will be placed
    override fun computerMove(): Int {
        var cMove: Int = (0..35).random()
        while ((board[cMove % GameConstants.ROWS][cMove / GameConstants.COLS] == GameConstants.RED)
            || (board[cMove % GameConstants.ROWS][cMove / GameConstants.COLS] == GameConstants.BLUE)) {
            cMove = (0..35).random()
        }
        return cMove
    }

    //Checks to see if either computer or player has won
    override fun checkForWinner(): Int {
        var pVScore = 0
        var cVScore = 0
        for (row in 0 until  GameConstants.ROWS) {
            for (col in 0 until GameConstants.COLS) {
                if (((row <= 2) && board[row][col] == GameConstants.RED && board[row+1][col] == GameConstants.RED &&
                            board[row+2][col] == GameConstants.RED && board[row+3][col] == GameConstants.RED)
                    || ((col <= 2) && board[row][col] == GameConstants.RED && board[row][col+1] == GameConstants.RED &&
                            board[row][col+2] == GameConstants.RED && board[row][col+3] == GameConstants.RED)
                    || ((row <= 2) && (col <= 2) && board[row][col] == GameConstants.RED && board[row+1][col+1] == GameConstants.RED &&
                            board[row+2][col+2] == GameConstants.RED && board[row+3][col+3] == GameConstants.RED)
                    || ((row >= 3) && (col <= 2) && board[row][col] == GameConstants.RED && board[row-1][col+1] == GameConstants.RED &&
                            board[row-2][col+2] == GameConstants.RED && board[row-3][col+3] == GameConstants.RED)) {
                    pVScore+=4
                } else if (((row <= 2) && board[row][col] == GameConstants.BLUE && board[row+1][col] == GameConstants.BLUE &&
                            board[row+2][col] == GameConstants.BLUE && board[row+3][col] == GameConstants.BLUE)
                    || ((col <= 2) && board[row][col] == GameConstants.BLUE && board[row][col+1] == GameConstants.BLUE &&
                            board[row][col+2] == GameConstants.BLUE && board[row][col+3] == GameConstants.BLUE)
                    || ((row <= 2) && (col <= 2) && board[row][col] == GameConstants.BLUE && board[row+1][col+1] == GameConstants.BLUE &&
                            board[row+2][col+2] == GameConstants.BLUE && board[row+3][col+3] == GameConstants.BLUE)
                    || ((row >= 3) && (col <= 2) && board[row][col] == GameConstants.BLUE && board[row-1][col+1] == GameConstants.BLUE &&
                            board[row-2][col+2] == GameConstants.BLUE && board[row-3][col+3] == GameConstants.BLUE)) {
                    cVScore += 4
                }
            }

        }
        return if (pVScore == 4){
            GameConstants.RED_WON
        } else if (cVScore == 4){
            GameConstants.BLUE_WON
        } else {
            GameConstants.PLAYING
        }
    }

    /**
     * Print the game board
     */
    fun printBoard() {
        for (row in 0 until GameConstants.ROWS) {
            for (col in 0 until GameConstants.COLS) {
                printCell(board[row][col]) // print each of the cells
                if (col != GameConstants.COLS - 1) {
                    print("|") // print vertical partition
                }
            }
            println()
            if (row != GameConstants.ROWS - 1) {
                println("-----------") // print horizontal partition
            }
        }
        println()
    }

    /**
     * Print a cell with the specified "content"
     * @param content either BLUE, RED or EMPTY
     */
    fun printCell(content: Int) {
        when (content) {
            GameConstants.EMPTY -> print("   ")
            GameConstants.BLUE -> print(" B ")
            GameConstants.RED -> print(" R ")
        }
    }
}

