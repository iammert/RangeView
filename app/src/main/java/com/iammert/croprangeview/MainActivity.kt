package com.iammert.croprangeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iammert.rangeview.library.DraggingState
import com.iammert.rangeview.library.RangeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rangeView = findViewById<RangeView>(R.id.rangeView)

        rangeView.rangeValueChangeListener = object : RangeView.OnRangeValueListener {
            override fun rangeChanged(maxValue: Float, minValue: Float, currentLeftValue: Float, currentRightValue: Float) {}
        }

        rangeView.rangePositionChangeListener = object : RangeView.OnRangePositionListener {
            override fun leftTogglePositionChanged(xCoordinate: Float, value: Float) {}

            override fun rightTogglePositionChanged(xCoordinate: Float, value: Float) {}
        }

        rangeView.rangeDraggingChangeListener = object : RangeView.OnRangeDraggingListener {
            override fun onDraggingStateChanged(draggingState: DraggingState) {}
        }
    }
}
