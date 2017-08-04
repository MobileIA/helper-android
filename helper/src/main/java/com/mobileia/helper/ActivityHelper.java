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

    public static void createInstance(Activity context, Intent intent){
        context.startActivity(intent);
    }

    public static Object getExtraIntent(Activity context, String key){
        // Verificamos que haya parametros
        if (context.getIntent().getExtras() == null || context.getIntent().getExtras().isEmpty()) {
            return null;
        }
        // Retornamos el valor buscado
        return context.getIntent().getExtras().get(key);
    }
}
