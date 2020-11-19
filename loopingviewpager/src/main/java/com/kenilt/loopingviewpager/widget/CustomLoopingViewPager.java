package com.kenilt.loopingviewpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomLoopingViewPager extends LoopingViewPager {

    private Boolean disable = false;

    public CustomLoopingViewPager(Context context) {
        super(context);
    }
    public CustomLoopingViewPager(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return !disable && super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return !disable && super.onTouchEvent(event);
    }

    public void disableScroll(Boolean disable){
        this.disable = disable;
    }
}
