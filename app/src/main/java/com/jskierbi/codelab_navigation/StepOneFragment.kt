package com.jskierbi.codelab_navigation

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jskierbi.codelab_navigation.databinding.FragmentStep1Binding

class StepOneFragment : Fragment() {

  val safeArgs by lazy { StepOneFragmentArgs.fromBundle(arguments) }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val binding = FragmentStep1Binding.inflate(inflater)
    binding.vm = ViewModelProviders.of(this).get(StepOneVm::class.java)
    Log.d(">>>", "Safe args: ${safeArgs.configType}, ${safeArgs.enumValue}, ${safeArgs.optionalString}")
    return binding.root
  }
}