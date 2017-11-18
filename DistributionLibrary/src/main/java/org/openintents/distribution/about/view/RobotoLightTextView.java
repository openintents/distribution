package org.openintents.distribution.about.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoLightTextView extends TextView {
    private static Typeface robotoLight;

    public RobotoLightTextView(Context context) {
        super(context);
        init();
    }

    public RobotoLightTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoLightTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        // Avoid leak as per http://code.google.com/p/android/issues/detail?id=9904
        if (robotoLight == null) {
            robotoLight = Typeface.createFromAsset(getContext().getAssets(), "RobotoLight.ttf");
        }

        setTypeface(robotoLight);
    }
}