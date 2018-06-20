package com.jskierbi.codelab_navigation

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.view.View
import androidx.navigation.findNavController

class MainFragmentVm(app: Application) : AndroidViewModel(app) {

  val title = "Hey, I'm VM provided title!"

  fun gotoStep1(view: View) {
    val action = MainFragmentDirections.goto_step_1(10, 10)
    view.findNavController().navigate(action)
  }
}