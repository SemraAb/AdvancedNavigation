package com.samra.advancednavigationcrocusoft.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.samra.advancednavigationcrocusoft.R
import com.samra.advancednavigationcrocusoft.adapter.ViewPager2Adapter
import com.samra.advancednavigationcrocusoft.databinding.FragmentDBinding

class DFragment : Fragment() {
    private lateinit var binding:FragmentDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var viewPager2= binding.viewPager
        var tabLayout = binding.tabLayout
        var fragments = listOf(EFragment(), FFragment())

        val adapter = ViewPager2Adapter(fragments , requireActivity())
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout , viewPager2){ tab , position ->
            tab.text = "Tab ${position+1}"
        }.attach()
    }

}