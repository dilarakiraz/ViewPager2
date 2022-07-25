package com.dilara.viewpager2tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dilara.viewpager2tablayout.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "first"
                }
                1 -> {
                    tab.text = "second"
                }
                2 -> {
                    tab.text = "third"
                }
            }
        }.attach()
    }
}