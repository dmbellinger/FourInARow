package com.hfad.assignment2

//Dylan Bellinger
//3/1/2023
//Assignment 2

//import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible


class GameFragment : Fragment() {

    //Variables for game
    val FIR_board = FourInARow()
    var buttonArray: Array<Button> = arrayOf()
    var currentState: Int = GameConstants.PLAYING

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //View variables
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        val message = GameFragmentArgs.fromBundle(requireArguments()).message
        var nameView = view.findViewById<TextView>(R.id.player_name)

        //Button values
        val b1 = view.findViewById<Button>(R.id.b1)
        val b2 = view.findViewById<Button>(R.id.b2)
        val b3 = view.findViewById<Button>(R.id.b3)
        val b4 = view.findViewById<Button>(R.id.b4)
        val b5 = view.findViewById<Button>(R.id.b5)
        val b6 = view.findViewById<Button>(R.id.b6)
        val b7 = view.findViewById<Button>(R.id.b7)
        val b8 = view.findViewById<Button>(R.id.b8)
        val b9 = view.findViewById<Button>(R.id.b9)
        val b10 = view.findViewById<Button>(R.id.b10)
        val b11 = view.findViewById<Button>(R.id.b11)
        val b12 = view.findViewById<Button>(R.id.b12)
        val b13 = view.findViewById<Button>(R.id.b13)
        val b14 = view.findViewById<Button>(R.id.b14)
        val b15 = view.findViewById<Button>(R.id.b15)
        val b16 = view.findViewById<Button>(R.id.b16)
        val b17 = view.findViewById<Button>(R.id.b17)
        val b18 = view.findViewById<Button>(R.id.b18)
        val b19 = view.findViewById<Button>(R.id.b19)
        val b20 = view.findViewById<Button>(R.id.b20)
        val b21 = view.findViewById<Button>(R.id.b21)
        val b22 = view.findViewById<Button>(R.id.b22)
        val b23 = view.findViewById<Button>(R.id.b23)
        val b24 = view.findViewById<Button>(R.id.b24)
        val b25 = view.findViewById<Button>(R.id.b25)
        val b26 = view.findViewById<Button>(R.id.b26)
        val b27 = view.findViewById<Button>(R.id.b27)
        val b28 = view.findViewById<Button>(R.id.b28)
        val b29 = view.findViewById<Button>(R.id.b29)
        val b30 = view.findViewById<Button>(R.id.b30)
        val b31 = view.findViewById<Button>(R.id.b31)
        val b32 = view.findViewById<Button>(R.id.b32)
        val b33 = view.findViewById<Button>(R.id.b33)
        val b34 = view.findViewById<Button>(R.id.b34)
        val b35 = view.findViewById<Button>(R.id.b35)
        val b36 = view.findViewById<Button>(R.id.b36)

        //Array of buttons
        buttonArray = arrayOf(b1,b7,b13,b19,b25,b31,
                              b2,b8,b14,b20,b26,b32,
                              b3,b9,b15,b21,b27,b33,
                              b4,b10,b16,b22,b28,b34,
                              b5,b11,b17,b23,b29,b35,
                              b6,b12,b18,b24,b30,b36)

        var rButton = view.findViewById<Button>(R.id.Reset_b)

        //On Click Listeners for buttons with parameters
        b1.setOnClickListener(){
            buttonClick(b1,0, rButton, nameView, message)
        }
        b2.setOnClickListener() {
            buttonClick(b2,6, rButton, nameView, message)
        }
        b3.setOnClickListener(){
            buttonClick(b3,12, rButton, nameView, message)
        }
        b4.setOnClickListener(){
            buttonClick(b4,18, rButton, nameView, message)
        }
        b5.setOnClickListener(){
            buttonClick(b5,24, rButton, nameView, message)
        }
        b6.setOnClickListener(){
            buttonClick(b6,30, rButton, nameView, message)
        }
        b7.setOnClickListener(){
            buttonClick(b7,1, rButton, nameView, message)
        }
        b8.setOnClickListener() {
            buttonClick(b8,7, rButton, nameView, message)
        }
        b9.setOnClickListener(){
            buttonClick(b9,13, rButton, nameView, message)
        }
        b10.setOnClickListener(){
            buttonClick(b10,19, rButton, nameView, message)
        }
        b11.setOnClickListener(){
            buttonClick(b11,25, rButton, nameView, message)
        }
        b12.setOnClickListener(){
            buttonClick(b12,31, rButton, nameView, message)
        }
        b13.setOnClickListener(){
            buttonClick(b13,2, rButton, nameView, message)
        }
        b14.setOnClickListener() {
            buttonClick(b14,8, rButton, nameView, message)
        }
        b15.setOnClickListener(){
            buttonClick(b15,14, rButton, nameView, message)
        }
        b16.setOnClickListener(){
            buttonClick(b16,20, rButton, nameView, message)
        }
        b17.setOnClickListener(){
            buttonClick(b17,26, rButton, nameView, message)
        }
        b18.setOnClickListener(){
            buttonClick(b18,32, rButton, nameView, message)
        }
        b19.setOnClickListener(){
            buttonClick(b19,3, rButton, nameView, message)
        }
        b20.setOnClickListener() {
            buttonClick(b20,9, rButton, nameView, message)
        }
        b21.setOnClickListener(){
            buttonClick(b21,15, rButton, nameView, message)
        }
        b22.setOnClickListener(){
            buttonClick(b22,21, rButton, nameView, message)
        }
        b23.setOnClickListener(){
            buttonClick(b23,27, rButton, nameView, message)
        }
        b24.setOnClickListener(){
            buttonClick(b24,33, rButton, nameView, message)
        }
        b25.setOnClickListener(){
            buttonClick(b25,4, rButton, nameView, message)
        }
        b26.setOnClickListener() {
            buttonClick(b26,10, rButton, nameView, message)
        }
        b27.setOnClickListener(){
            buttonClick(b27,16, rButton, nameView, message)
        }
        b28.setOnClickListener(){
            buttonClick(b28,22, rButton, nameView, message)
        }
        b29.setOnClickListener(){
            buttonClick(b29,28, rButton, nameView, message)
        }
        b30.setOnClickListener(){
            buttonClick(b30,34, rButton, nameView, message)
        }
        b31.setOnClickListener(){
            buttonClick(b31,5, rButton, nameView, message)
        }
        b32.setOnClickListener() {
            buttonClick(b32,11, rButton, nameView, message)
        }
        b33.setOnClickListener(){
            buttonClick(b33,17, rButton, nameView, message)
        }
        b34.setOnClickListener(){
            buttonClick(b34,23, rButton, nameView, message)
        }
        b35.setOnClickListener(){
            buttonClick(b35,29, rButton, nameView, message)
        }
        b36.setOnClickListener(){
            buttonClick(b36,35, rButton, nameView, message)
        }

        //Reset button click function
        rButton.setOnClickListener(){
            FIR_board.clearBoard()
            FIR_board.gameCount = 0
            for (i in 0 until buttonArray.size) {
                buttonArray[i].setBackgroundColor(Color.parseColor("#000000"))
                buttonArray[i].isClickable = true
            }
            rButton.isEnabled = false
            currentState = GameConstants.PLAYING
        }

        return view
    }

    //Function for button clicks
    fun buttonClick(btn:Button, no:Int, res: Button, tex:TextView, mes: String){
        //Runs game
        tex.text = "Turn $mes"
        btn.setBackgroundColor(Color.parseColor("#ff0000"))
        btn.isClickable = false
        FIR_board.setMove(GameConstants.RED,no)
        tex.text = "Turn: CPU"
        var move = FIR_board.computerMove()
        buttonArray[move].setBackgroundColor(Color.parseColor("#0000ff"))
        buttonArray[move].isClickable = false
        FIR_board.setMove(GameConstants.BLUE, move)
        tex.text = "Turn: $mes"

        //Win Conditions
        FIR_board.checkForWinner()
        currentState = if (FIR_board.checkForWinner() == GameConstants.RED_WON){
            GameConstants.RED_WON
        } else if (FIR_board.checkForWinner() == GameConstants.BLUE_WON){
            GameConstants.BLUE_WON
        } else if (FIR_board.gameCount == 36){
            GameConstants.TIE
        } else {
            GameConstants.PLAYING
        }

        //Selects which message to display
        if (currentState == GameConstants.RED_WON){
            toast("You Win")
            for (i in 0 until buttonArray.size) {
                buttonArray[i].isClickable = false
            }
            res.isEnabled = true
        } else if(currentState == GameConstants.BLUE_WON){
            toast("You Lose")
            for (i in 0 until buttonArray.size) {
                buttonArray[i].isClickable = false
            }
            res.isEnabled = true
        } else if(currentState == GameConstants.TIE){
            toast("Tie")
            for (i in 0 until buttonArray.size) {
                buttonArray[i].isClickable = false
            }
            res.isEnabled = true
        }

        FIR_board.printBoard()
    }


    //Function for toast messages
    fun toast(msg:String){
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
    }

}