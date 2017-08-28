package com.ianmunene.madlibs;


import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    private SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    private Context context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // shared preferences file name
    private static final String PREF_NAME = "madlibs";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this.context = context;
        sharedPref = this.context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return sharedPref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
