package com.jskierbi.codelab_navigation

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.arch.lifecycle.AndroidViewModel
import android.os.Build
import android.support.v4.app.NotificationCompat
import android.view.View
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.findNavController


class MainFragmentVm(private val app: Application) : AndroidViewModel(app) {

  val title = "Hey, I'm VM provided title!"

  fun gotoStep1(view: View) {
    val action = MainFragmentDirections.goto_step_1()
    action.setConfigType(10)
    action.setEnumValue(10)
    view.findNavController().navigate(action)
  }

  fun createNotification() {

    val CHANNEL_ID = "NOTIFICATION_CHANNEL_ID"
    val notificationManager = app.getSystemService(NotificationManager::class.java)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      val name = "Channel name"
      val description = "Channel description"
      val importance = NotificationManager.IMPORTANCE_DEFAULT
      val channel = NotificationChannel(CHANNEL_ID, name, importance)
      channel.description = description
      // Register the channel with the system; you can't change the importance
      // or other notification behaviors after this
      notificationManager.createNotificationChannel(channel)
    }

    val args = StepOneFragmentArgs.Builder()
        .setConfigType(5)
        .setEnumValue(5)
        .build()
        .toBundle()

    val pendingIntent = NavDeepLinkBuilder(app)
        .setGraph(R.navigation.nav_graph)
        .setDestination(R.id.stepOne)
        .setArguments(args)
        .createPendingIntent()


    val notificatoin = NotificationCompat.Builder(app, CHANNEL_ID)
        .setSmallIcon(R.drawable.ic_filter_2_black_24dp)
        .setContentTitle("My notification")
        .setContentText("Much longer text that cannot fit one line...")
        .setStyle(NotificationCompat.BigTextStyle()
            .bigText("Much longer text that cannot fit one line..."))
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        .setContentIntent(pendingIntent)
        .setAutoCancel(true)
        .build()

    notificationManager.notify(1237332, notificatoin)
  }
}