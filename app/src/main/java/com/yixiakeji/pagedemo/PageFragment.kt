package com.yixiakeji.pagedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yixiakeji.pagedemo.databinding.FragmentPageBinding

/**
 * Created on 2022/8/16.
 */
class PageFragment: Fragment() {
    
    private var _binding: FragmentPageBinding? = null
    private val binding get() = _binding!!
    
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPageBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    
    companion object {
        
        fun new(): PageFragment {
            return PageFragment()
        }
        
    }
}