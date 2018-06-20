package com.jskierbi.codelab_navigation

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.view.View
import androidx.navigation.findNavController

class StepTwoVm(app: Application) : AndroidViewModel(app) {

  val title = "Step 2"

  fun done(view: View) = view.findNavController().popBackStack(R.id.mainFragment, false)

}