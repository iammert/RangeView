package com.iammert.rangeview.library

import android.view.MotionEvent

data class DraggingStateData(val draggingState: DraggingState, val motionX: Float, val motionY: Float) {

    companion object {

        fun idle() = DraggingStateData(DraggingState.NO_DRAGGING, 0f, 0f)

        fun createConflict(motionEvent: MotionEvent) = DraggingStateData(DraggingState.DRAGGING_CONFLICT_TOGGLE, motionEvent.x, motionEvent.y)

        fun left(motionEvent: MotionEvent) = DraggingStateData(DraggingState.DRAGGING_LEFT_TOGGLE, 0f, 0f)

        fun right(motionEvent: MotionEvent) = DraggingStateData(DraggingState.DRAGGING_RIGHT_TOGGLE, 0f, 0f)
    }
}