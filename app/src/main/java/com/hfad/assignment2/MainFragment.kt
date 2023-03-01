package com.hfad.assignment2
//Dylan Bellinger
//3/1/2023
//Assignment 2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val startButton = view.findViewById<Button>(R.id.start)
        val messageView = view.findViewById<EditText>(R.id.message)

        //Start Button navigates to game fragment with username
        startButton.setOnClickListener{
            val message = messageView.text.toString()
            val action = MainFragmentDirections
                .actionMainFragmentToGameFragment(message)
            view.findNavController() .navigate(/*R.id.action_mainFragment_to_gameFragment*/action)
        }
        return view
    }


}


