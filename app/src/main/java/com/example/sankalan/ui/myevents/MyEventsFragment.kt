package com.example.sankalan.ui.myevents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sankalan.R
import com.example.sankalan.adapter.EventListAdapter
import com.example.sankalan.adapter.MyEventAdapter
import com.example.sankalan.databinding.FragmentHomeBinding
import com.example.sankalan.databinding.FragmentMyEventsBinding

class MyEventsFragment : Fragment() {
    private var _binding: FragmentMyEventsBinding? = null

    private val binding get() =_binding!!
    private lateinit var recyclerMyEventList:RecyclerView
    private lateinit var adapter:MyEventAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentMyEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerMyEventList = binding.recyclerViewMyEvents
        recyclerMyEventList.setHasFixedSize(true)
        recyclerMyEventList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        recyclerMyEventList.adapter = adapter
        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}