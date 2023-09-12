package com.example.helloworldandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController


class pantallaUnoFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPantallaDos = requireView().findViewById<Button>(R.id.viewOnetoTwo);
        val btnPantallaTres = requireView().findViewById<Button>(R.id.viewOnetoThree);

        btnPantallaDos.setOnClickListener{
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaDosFragment);
        }

        btnPantallaTres.setOnClickListener{
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaTresFragment);
        }
    }


}