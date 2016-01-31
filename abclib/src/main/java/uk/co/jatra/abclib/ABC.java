package uk.co.jatra.abclib;

import android.util.Log;

/**
 * Created by tim on 31/01/2016.
 */
public class ABC {
    private static final String TAG = ABC.class.getSimpleName();

    private static ABC instance;

    private ABC() {
        Log.d(TAG, "ABC() called");
    }

    public static ABC init() {
        Log.d(TAG, "init() called");
        if (instance == null) {
            instance = new ABC();
        }
        return instance;
    }

    public void onPause() {

    }

    public void onResume() {

    }

    public void onDestroy() {

    }

}
