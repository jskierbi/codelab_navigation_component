package com.jskierbi.codelab_navigation

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jskierbi.codelab_navigation.databinding.FragmentStep2Binding

class StepTwoFragment : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val binding = FragmentStep2Binding.inflate(inflater)
    binding.vm = ViewModelProviders.of(this).get(StepTwoVm::class.java)
    return binding.root
  }
}