package com.jskierbi.codelab_navigation

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jskierbi.codelab_navigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, state: Bundle?): View {
    val binding = FragmentMainBinding.inflate(inflater)
    binding.vm = ViewModelProviders.of(this).get(MainFragmentVm::class.java)
    return binding.root
  }
}