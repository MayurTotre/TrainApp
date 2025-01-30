package com.example.mytrainapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytrainapp.databinding.FragmentExpressBinding

class ExpressFragment : Fragment() {

    lateinit var binding: FragmentExpressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpressBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swapImage.setOnClickListener {
            val startLocation = binding.etFromStation.text
            val endLocation = binding.etToStation.text

            binding.etFromStation.setText(endLocation)
            binding.etToStation.setText(startLocation)

        }

        binding.btnClose.setOnClickListener {
            binding.etFromStation.text.clear()
        }

        binding.btnCloseToStation.setOnClickListener {
            binding.etToStation.text.clear()
        }

        binding.btnPnr.setOnClickListener{
            Intent(requireContext(), PnrActivity::class.java).also{
                startActivity(it)
            }
        }
    }



}