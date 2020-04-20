package com.example.project1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class PercentRelativeLayout extends RelativeLayout {

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PercentRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PercentRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int width= MeasureSpec.getSize(widthMeasureSpec);
        int height= MeasureSpec.getSize(heightMeasureSpec);
        int childCount=this.getChildCount();
        for (int i = 0; i<childCount;i++){
            View child=this.getChildAt(i);
            ViewGroup.LayoutParams layoutParams=child.getLayoutParams();
            float widthPercent=0;
            float heightPercent=0;
            float topMarginPercent=0;
            float bottomMarginPercent=0;
            float leftMarginPercent=0;
            float rightMarginPercent=0;
            if (layoutParams instanceof PercentRelativeLayout.LayoutParams){
                widthPercent=((LayoutParams) layoutParams).getWidthPercent();
                heightPercent=((LayoutParams) layoutParams).getHeightPercent();
                topMarginPercent=((LayoutParams) layoutParams).getTopMarginPercent();
                bottomMarginPercent=((LayoutParams) layoutParams).getBottomMarginPercent();
                leftMarginPercent=((LayoutParams) layoutParams).getLeftMarginPercent();
                rightMarginPercent=((LayoutParams) layoutParams).getRightMarginPercent();
            }
            if (widthPercent>0) {
                layoutParams.width = (int) (width * widthPercent);
            }
            if (heightPercent>0){
                layoutParams.height=(int)(height*heightPercent);
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b){
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        //返回自己的布局参数
        return new LayoutParams(getContext(),attrs);
    }
    public static class LayoutParams extends RelativeLayout.LayoutParams{

        private float widthPercent;
        private float heightPercent;
        private float topMarginPercent;
        private float bottomMarginPercent;
        private float leftMarginPercent;
        private float rightMarginPercent;

        public float getTopMarginPercent() {
            return topMarginPercent;
        }

        public void setTopMarginPercent(float topMarginPercent) {
            this.topMarginPercent = topMarginPercent;
        }

        public float getBottomMarginPercent() {
            return bottomMarginPercent;
        }

        public void setBottomMarginPercent(float bottomMarginPercent) {
            this.bottomMarginPercent = bottomMarginPercent;
        }

        public float getLeftMarginPercent() {
            return leftMarginPercent;
        }

        public void setLeftMarginPercent(float leftMarginPercent) {
            this.leftMarginPercent = leftMarginPercent;
        }

        public float getRightMarginPercent() {
            return rightMarginPercent;
        }

        public void setRightMarginPercent(float rightMarginPercent) {
            this.rightMarginPercent = rightMarginPercent;
        }

        public float getWidthPercent() {
            return widthPercent;
        }

        public void setWidthPercent(float widthPercent) {
            this.widthPercent = widthPercent;
        }

        public float getHeightPercent() {
            return heightPercent;
        }

        public void setHeightPercent(float heightPercent) {
            this.heightPercent = heightPercent;
        }

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray array=c.obtainStyledAttributes(attrs,R.styleable.PercentRelativeLayout);
            widthPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_widthPercent,this.widthPercent);
            heightPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_heightPercent,this.heightPercent);
            topMarginPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_heightPercent,this.topMarginPercent);
            bottomMarginPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_heightPercent,this.bottomMarginPercent);
            leftMarginPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_heightPercent,this.leftMarginPercent);
            rightMarginPercent=array.getFloat(R.styleable.PercentRelativeLayout_layout_heightPercent,this.rightMarginPercent);
        }

        public LayoutParams(int w, int h) {
            super(w, h);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }

        public LayoutParams(RelativeLayout.LayoutParams source) {
            super(source);
        }
    }
}
