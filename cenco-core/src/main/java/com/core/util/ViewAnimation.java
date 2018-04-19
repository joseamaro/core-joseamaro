package com.core.util;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/**
 * Created by carlosenock on 08-12-17.
 */

public class ViewAnimation {

    public static void expand(final View v, int duration, int targetHeight) {
        v.measure(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.getLayoutParams().height = 0;
        v.setVisibility(View.VISIBLE);
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, targetHeight);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                v.getLayoutParams().height = (int) animation.getAnimatedValue();
                v.requestLayout();
            }
        });
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(duration);
        valueAnimator.start();
    }



    public static void collapse(final View v, int duration, int targetHeight) {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, targetHeight);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                v.getLayoutParams().height = (int) animation.getAnimatedValue();
                v.requestLayout();

            }
        });
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(duration);
        valueAnimator.start();
    }


    public static final void resetRotation(View view) {
        if (view != null) {
            view.setRotation(0);
        }
    }


}
