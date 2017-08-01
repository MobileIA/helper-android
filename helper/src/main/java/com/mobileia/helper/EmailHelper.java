package com.mobileia.helper;

import android.text.TextUtils;

/**
 * Created by matiascamiletti on 1/8/17.
 */

public class EmailHelper {

    public final static boolean isValid(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
