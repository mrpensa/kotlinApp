package com.example.helloworldandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class pantallaTresFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPantallaUno = requireView().findViewById<Button>(R.id.viewThreeToOne);

        btnPantallaUno.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaUnoFragment);
        }

    }


}