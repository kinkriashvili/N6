package com.example.n6.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.n6.fragments.FragmentFirstphoto
import com.example.n6.fragments.FragmentNote
import com.example.n6.fragments.FragmentSecondphoto

class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> FragmentNote()
            1-> FragmentFirstphoto()
            2-> FragmentSecondphoto()
            else -> FragmentNote()

        }

    }
}