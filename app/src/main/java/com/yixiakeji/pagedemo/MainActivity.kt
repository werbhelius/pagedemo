package com.yixiakeji.pagedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.yixiakeji.pagedemo.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    
        val demoCollectionAdapter = DemoCollectionAdapter(this)
        
        binding.viewPager.scaleX = 0.6f
        binding.viewPager.scaleY = 0.6f
        
        binding.viewPager.setPageTransformer(MarginPageTransformer(20))
        binding.viewPager.offscreenPageLimit = 3
        binding.viewPager.adapter = demoCollectionAdapter
    }
    
    class DemoCollectionAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        
        override fun getItemCount(): Int = 10
        
        override fun createFragment(position: Int): Fragment {
            return PageFragment.new()
        }
        
        
    }
}