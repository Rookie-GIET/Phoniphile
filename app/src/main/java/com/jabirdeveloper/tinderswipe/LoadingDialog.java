package com.jabirdeveloper.tinderswipe;

import android.app.Activity;
import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;

public class LoadingDialog {
    Activity activity;
    AlertDialog dialog;
    LoadingDialog(Activity myActivity)
    {
        activity = myActivity;
    }
    void startLoadingDialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_layout,null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
    }
    void dismissDialog()
    {
        dialog.dismiss();
    }
}
