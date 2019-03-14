package com.example.tttdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var gameBoard = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener() {
            setMove(1, 1)
        }


    }

    fun setMove(pos: Int, player: Int): Boolean {
        if (player == 1) {
            this.gameBoard[pos] = player
            this.gameBoard[0]++
            return true
        } else if (player == 2) {
            this.gameBoard[pos] = player
            this.gameBoard[0]++
            return true
        }
        return false
    }

    /*
     * return 1 if player 1 wins
     * return 2 if player 2 wins
     * return 3 if draw game
     * return 0. not decided
     */
    fun gameResult(board: Array<Int>): Int {
        //check for player 1
        if (board[1] == 1 && board[2] == 1 && board[3] == 1)
            return 1
        else if (board[4] == 1 && board[5] == 1 && board[6] == 1)
            return 1
        else if (board[7] == 1 && board[8] == 1 && board[9] == 1)
            return 1
        else if (board[1] == 1 && board[4] == 1 && board[7] == 1)
            return 1
        else if (board[2] == 1 && board[5] == 1 && board[8] == 1)
            return 1
        else if (board[3] == 1 && board[6] == 1 && board[9] == 1)
            return 1
        else if (board[1] == 1 && board[5] == 1 && board[9] == 1)
            return 1
        else if (board[3] == 1 && board[5] == 1 && board[7] == 1)
            return 1
        //check for player 2
        else if (board[1] == 2 && board[2] == 2 && board[3] == 2)
            return 2
        else if (board[4] == 2 && board[5] == 2 && board[6] == 2)
            return 2
        else if (board[7] == 2 && board[8] == 2 && board[9] == 2)
            return 2
        else if (board[1] == 2 && board[4] == 2 && board[7] == 2)
            return 2
        else if (board[2] == 2 && board[5] == 2 && board[8] == 2)
            return 2
        else if (board[3] == 2 && board[6] == 2 && board[9] == 2)
            return 2
        else if (board[1] == 2 && board[5] == 2 && board[9] == 2)
            return 2
        else if (board[3] == 2 && board[5] == 2 && board[7] == 2)
            return 2
        else
        //check draw
            if (board[0] == 9)
                return 3

        return 0
    }

}
