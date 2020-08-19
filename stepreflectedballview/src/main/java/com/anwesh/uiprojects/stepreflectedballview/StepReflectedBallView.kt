package com.anwesh.uiprojects.stepreflectedballview

/**
 * Created by anweshmishra on 20/08/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.app.Activity
import android.content.Context

val colors : Array<String> = arrayOf("#4CAF50", "#F44336", "#3F51B5", "#FF9800", "#2196F3")
val parts : Int = 2
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 5.8f
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
