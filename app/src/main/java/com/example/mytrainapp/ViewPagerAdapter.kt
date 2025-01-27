package com.example.mytrainapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ExpressFragment()
            1 -> LocalFragment()
            2 -> MetroFragment()
            else -> throw IllegalArgumentException("No such position")
        }
    }

}