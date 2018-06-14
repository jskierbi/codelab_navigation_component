package com.jskierbi.codelab_navigation

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

class MainFragmentVm(app: Application) : AndroidViewModel(app) {

  val title = "Hey, I'm VM provided title!"
}