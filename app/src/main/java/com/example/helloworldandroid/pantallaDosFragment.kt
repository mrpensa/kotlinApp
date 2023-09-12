package com.example.helloworldandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController


class pantallaDosFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPantallaUno = requireView().findViewById<Button>(R.id.viewTwotoOne);
        val btnPantallaTres = requireView().findViewById<Button>(R.id.viewTwoToThree);

        btnPantallaUno.setOnClickListener{
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaUnoFragment);
        }

        btnPantallaTres.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaTresFragment);
        }

    }
}