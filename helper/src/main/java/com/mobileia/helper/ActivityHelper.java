package com.mobileia.helper;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by matiascamiletti on 16/3/17.
 */

public class ActivityHelper {

    public static void createInstance(Activity context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}