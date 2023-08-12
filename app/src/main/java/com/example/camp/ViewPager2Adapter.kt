package com.example.camp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int{
        return 2 // 탭의 개수
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()  // 첫 번째 탭의 프래그먼트
            1 -> SecondFragment()  // 두 번째 탭의 프래그먼트
            else -> throw IllegalArgumentException("Invalid position: $position")
        }

    }

}