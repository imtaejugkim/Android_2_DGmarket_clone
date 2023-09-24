package com.example.carrotmarket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carrotmarket.databinding.FragmentKeyWordBinding

class KeyWordFragment : Fragment() {
    lateinit var binding : FragmentKeyWordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentKeyWordBinding.inflate(layoutInflater)
        return binding.root
    }


}