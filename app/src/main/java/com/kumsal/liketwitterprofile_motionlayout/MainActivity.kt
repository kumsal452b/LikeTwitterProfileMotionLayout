package com.kumsal.liketwitterprofile_motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var viewPager2: ViewPager?=null
    var adapter:SectionPagerAdapter?=null
    var tabLayout:TabLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager2=findViewById(R.id.pagerView)
        tabLayout=findViewById(R.id.tabLayout12)
        adapter= SectionPagerAdapter(supportFragmentManager)
        tabLayout?.setupWithViewPager(viewPager2)
        viewPager2?.adapter=adapter
        viewPager2?.setOnScrollChangeListener(object : View.OnScrollChangeListener {
            override fun onScrollChange(
                v: View?,
                scrollX: Int,
                scrollY: Int,
                oldScrollX: Int,
                oldScrollY: Int
            ) {
                println(oldScrollX)
            }
        })
    }
}