package com.jskierbi.codelab_navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    if (supportFragmentManager.findFragmentById(R.id.fragment_container) == null) {
      supportFragmentManager.beginTransaction()
          .add(R.id.fragment_container, MainFragment())
          .commit()
    }
  }
}
