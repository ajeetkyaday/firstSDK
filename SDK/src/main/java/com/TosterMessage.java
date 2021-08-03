package com;

import android.content.Context;
import android.widget.Toast;

public class TosterMessage {
    private static String accessToken;


    public static void s(Context c, String message) {
        if (accessToken == "") {
            Toast.makeText(c, "No Access token provide", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

        }
    }
}
