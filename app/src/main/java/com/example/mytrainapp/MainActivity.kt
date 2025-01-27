package com.example.mytrainapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import com.example.mytrainapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.mainToolBar)

        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.mainToolBar, R.string.open, R.string.close)

        toggle.drawerArrowDrawable.color = ContextCompat.getColor(this, android.R.color.white)

        binding.drawerLayout.addDrawerListener(toggle)

        toggle.syncState()

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapterView = ViewPagerAdapter(this)
        viewPager.adapter = adapterView

        TabLayoutMediator(tabLayout, viewPager,){tab, Position ->
            tab.text = when(Position){
                0 -> "EXPRESS"
                1 -> "LOCAL"
                2 -> "METRO"
                else -> null
            }
        }.attach()
        viewPager.isUserInputEnabled = true
    }
}