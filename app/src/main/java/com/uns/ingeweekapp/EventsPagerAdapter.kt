package com.uns.ingeweekapp

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class EventsPagerAdapter(parent: Fragment, private val fragments: List<Fragment>) :
    FragmentStateAdapter(parent) {

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}
