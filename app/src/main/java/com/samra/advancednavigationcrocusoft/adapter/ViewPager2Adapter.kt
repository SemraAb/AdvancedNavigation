package com.samra.advancednavigationcrocusoft.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(private val fragments: List<Fragment>, fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
      return  fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}