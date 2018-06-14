package com.jskierbi.codelab_navigation

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jskierbi.codelab_navigation.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val binding = FragmentDetailBinding.inflate(inflater)
    binding.vm = ViewModelProviders.of(this).get(DetailFragmentVm::class.java)
    return binding.root
  }
}