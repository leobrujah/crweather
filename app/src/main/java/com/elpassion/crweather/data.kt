package com.elpassion.crweather

import android.support.annotation.ColorInt


data class Chart(
        val inputRange: ClosedFloatingPointRange<Float>,
        val outputRange: ClosedFloatingPointRange<Float>,
        val lines: List<Line>,
        val time: Float = System.currentTimeMillis().toFloat() / 1000
)

data class Line(
        val name: String,
        @ColorInt val color: Int,
        val points: List<Point>
)

data class Point(val x: Float, val y: Float)

sealed class Action

data class SelectCity(val city: String) : Action()
