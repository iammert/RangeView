# RangeView
Android range view for cropping (video, audio, etc.)

<img src="https://raw.githubusercontent.com/iammert/RangeView/master/art/rangeview.png"/>

## Usage
```xml
<com.iammert.rangeview.library.RangeView
    android:id="@+id/rangeView"
    android:layout_width="match_parent"
    android:layout_height="56dp"
    app:strokeColor="#123123"
    app:colorBackground="#555555" />
```

## Listeners
```kotlin
rangeView.rangeValueChangeListener = object : RangeView.OnRangeValueListener {
    override fun rangeChanged(maxValue: Float, minValue: Float, currentLeftValue: Float, currentRightValue: Float) {}
}
```
```kotlin
rangeView.rangePositionChangeListener = object : RangeView.OnRangePositionListener {
    override fun leftTogglePositionChanged(xCoordinate: Float, value: Float) {}

    override fun rightTogglePositionChanged(xCoordinate: Float, value: Float) {}
}
```
```kotlin
rangeView.rangeDraggingChangeListener = object :RangeView.OnRangeDraggingListener{
    override fun onDraggingStateChanged(draggingState: DraggingState) {}
}
```

## Download
```gradle
maven { url 'https://jitpack.io' }
```

```gradle
dependencies {
  compile 'com.github.iammert:rangeview:0.1'
}
```

License
--------


    Copyright 2019 Mert Şimşek.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




