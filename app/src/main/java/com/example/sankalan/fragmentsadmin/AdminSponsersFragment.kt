package com.example.sankalan.fragmentsadmin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sankalan.R
import com.example.sankalan.databinding.FragmentAdminSponsersBinding
import com.example.sankalan.databinding.FragmentSponsersBinding


class AdminSponsersFragment : Fragment() {

    private lateinit var sponserBinding : FragmentAdminSponsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        sponserBinding = FragmentAdminSponsersBinding.inflate(layoutInflater)
        return sponserBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sponserBinding.sponsersListAdmin.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            setHasFixedSize(true)
        }
    }


}