package com.example.camp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.camp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        //binding.lifecycleOwner = this

        val bookMarkList = mutableListOf<Items>()
        for (i in 1..30) {
            bookMarkList.add(Items("bookmark $i"))
        }

        val adapter = FragmentAdapter(bookMarkList)

        binding.rvBookmark.layoutManager = LinearLayoutManager(requireContext())
        binding.rvBookmark.adapter = adapter
        return binding.root
    }

}