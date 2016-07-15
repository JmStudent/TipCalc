package com.migremlin.tipcalc;

import android.app.Application;

/**
 * Created by JM Peña on 06/07/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/srpeña";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
