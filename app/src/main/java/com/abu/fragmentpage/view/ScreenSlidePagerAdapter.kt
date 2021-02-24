package com.abu.fragmentpage.view

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.abu.fragmentpage.ui.dashboard.DashboardFragment
import com.abu.fragmentpage.ui.home.HomeFragment
import com.abu.fragmentpage.ui.notifications.NotificationsFragment
import com.google.android.material.tabs.TabLayoutMediator

/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */
class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    val fragmentArray: Array<Fragment> = arrayOf (
        HomeFragment(), DashboardFragment(), NotificationsFragment()
    )

    override fun getItemCount(): Int = fragmentArray.size

    override fun createFragment(position: Int): Fragment {
        Log.d("ABu-createFragment", "position:$position")
        return fragmentArray[position]
    }
}