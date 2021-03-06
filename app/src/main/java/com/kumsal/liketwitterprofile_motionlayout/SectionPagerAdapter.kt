package com.kumsal.liketwitterprofile_motionlayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

class SectionPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            1->Fragment_first()
            2->Fragment_seccond()
            3->Fragment_third()
            else -> Fragment_first()
        }
    }
    override fun getPageTitle(position:Int):CharSequence{
        return when(position){
            0 -> "Paylaşımlar"
            1 ->"Beğeniler"
            2->"Diğer"
            else ->""
        }
    }
}