package com.weatherapp.mcligeyodev.weatherforecast.util;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by paulodichone on 11/18/17.
 */

public class Prefs {
    SharedPreferences preferences;

    public Prefs(Activity activity) {
        preferences = activity.getPreferences(Activity.MODE_PRIVATE);

    }

    public void setLocation(String location) {
        preferences.edit().putString("location", location).apply();
    }

    public String getLocation() {
        return preferences.getString("location", "Spokane WA");
    }
}
