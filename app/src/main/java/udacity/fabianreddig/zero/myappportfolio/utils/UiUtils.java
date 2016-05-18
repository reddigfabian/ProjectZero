package udacity.fabianreddig.zero.myappportfolio.utils;

import android.widget.Toast;

import udacity.fabianreddig.zero.myappportfolio.PortfolioApplication;

/**
 * Created by WillowTree, Inc. on 5/17/16.
 */
public class UiUtils {

    public static void shortToast(String text){
        showToast(text, Toast.LENGTH_SHORT);
    }

    public static void longToast(String text){
        showToast(text, Toast.LENGTH_LONG);
    }

    private static void showToast(String text, int length){
        Toast.makeText(PortfolioApplication.getApp(), text, length).show();
    }
}
