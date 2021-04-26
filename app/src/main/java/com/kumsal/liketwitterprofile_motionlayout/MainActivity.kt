package com.kumsal.liketwitterprofile_motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var viewPager2: ViewPager?=null
    var adapter:SectionPagerAdapter?=null
    var tabLayout:TabLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager2=findViewById(R.id.pagerView)
        tabLayout=findViewById(R.id.tabLayout)
        adapter= SectionPagerAdapter(supportFragmentManager)
        tabLayout?.setTabsFromPagerAdapter(adapter)
        tabLayout?.setupWithViewPager(viewPager2)
        
    }
}