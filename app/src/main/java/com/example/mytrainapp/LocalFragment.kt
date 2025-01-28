package com.example.mytrainapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mytrainapp.databinding.FragmentLocalBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class LocalFragment : Fragment() {
    private lateinit var binding: FragmentLocalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLocalBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swapImage.setOnClickListener {
            val startLoc = binding.etFromStation.text
            val toLocation = binding.etToStation.text

            binding.etToStation.setText(startLoc)
            binding.etFromStation.setText(toLocation)
        }

        binding.btnClose.setOnClickListener {
            binding.etFromStation.text.clear()
        }
        binding.btnCloseToStation.setOnClickListener {
            binding.etToStation.text.clear()
        }

        binding.displayMap.setOnClickListener {
            val dialog = BottomSheetDialog(requireContext())

            val view = layoutInflater.inflate(R.layout.map_display_bottomsheet, null)

            val textClose = view.findViewById<TextView>(R.id.textClose)
            textClose.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setContentView(view)

            dialog.show()

        }
    }
}