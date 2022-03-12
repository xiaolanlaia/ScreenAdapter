package com.example.screenadaptertest;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class PTAdaptUtils {

    private static DisplayMetrics appDm;
    private Context context;
    public PTAdaptUtils(Context context){
        this.context = context.getApplicationContext();
    }
    /**
     * Adapt for the horizontal screen, and call it in [android.app.Activity.getResources].
     */
    public Resources adaptWidth(Resources resources, int designWidth) {
        DisplayMetrics dm = resources.getDisplayMetrics();
        float newXdpi = dm.xdpi = (dm.widthPixels * 72f) / designWidth;
        setAppDmXdpi(newXdpi);
        return resources;
    }

    /**
     * Adapt for the vertical screen, and call it in [android.app.Activity.getResources].
     */
    public Resources adaptHeight(Resources resources, int designHeight) {
        DisplayMetrics dm = resources.getDisplayMetrics();
        float newXdpi = dm.xdpi = (dm.heightPixels * 72f) / designHeight;
        setAppDmXdpi(newXdpi);
        return resources;
    }

    /**
     * @param resources The resources.
     * @return the resource
     */
    public Resources closeAdapt(Resources resources) {
        DisplayMetrics dm = resources.getDisplayMetrics();
        float newXdpi = dm.xdpi = dm.density * 72;
        setAppDmXdpi(newXdpi);
        return resources;
    }

    /**
     * Value of pt to value of px.
     *
     * @param ptValue The value of pt.
     * @return value of px
     */
    public int pt2Px(float ptValue) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (ptValue * metrics.xdpi / 72f + 0.5);
    }

    /**
     * Value of px to value of pt.
     *
     * @param pxValue The value of px.
     * @return value of pt
     */
    public int px2Pt(float pxValue) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (pxValue * 72 / metrics.xdpi + 0.5);
    }

    private void setAppDmXdpi(final float xdpi) {
        if (appDm == null) {
            appDm = context.getResources().getDisplayMetrics();
        }
        appDm.xdpi = xdpi;
    }
}
