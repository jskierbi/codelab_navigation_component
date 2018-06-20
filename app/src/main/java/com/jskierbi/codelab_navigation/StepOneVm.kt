package com.jskierbi.codelab_navigation

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.view.View
import androidx.navigation.findNavController

class StepOneVm(app: Application) : AndroidViewModel(app) {

  val title = "Step 1"

  fun gotoStep2(view: View) = view.findNavController().navigate(R.id.goto_step_2)
}