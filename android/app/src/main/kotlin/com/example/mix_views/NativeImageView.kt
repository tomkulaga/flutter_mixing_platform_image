package com.example.mix_views

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.View
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView

internal class NativeImageView(context: Context, id: Int, creationParams: Map<String?, Any?>?) :
    PlatformView {
    private val textView: TextView

    override fun getView(): View {
        return textView
    }

    override fun dispose() {}

    init {
       textView = TextView(context)
       textView.textSize = 72f
       textView.setBackgroundColor(Color.rgb(255, 255, 255))
       textView.text = "Rendered on a native Android view (id: $id)"
        // imageView = ImageView(context)
        // imageView.setImageDrawable(
        //     ContextCompat.getDrawable(context, R.drawable.balmain)
        // );
    //    installHierarchyFitter(imageView)
        // imageView.scaleType = ImageView.ScaleType.FIT_CENTER
        // imageView.id = R.id.native_image_view
    }
}