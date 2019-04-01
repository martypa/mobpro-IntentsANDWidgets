package com.example.intentsandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.intentsandwidgets.widget.MyAppWidgetProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startBrowseronClick(View Btn){
        Intent browserCall = new Intent();
        browserCall.setAction(Intent.ACTION_VIEW);
        browserCall.setData(Uri.parse("https://www.hslu.ch/de-ch/"));
        startActivity(browserCall);
    }

    public void updateWidgetonClick(View Btn){
        ComponentName widget = new ComponentName(getApplicationContext(), MyAppWidgetProvider.class);
        int[] appWidgetIDs = AppWidgetManager.getInstance(getApplicationContext()).getAppWidgetIds(widget);

        Intent updateWidget = new Intent(getApplicationContext(),MyAppWidgetProvider.class);
        updateWidget.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        updateWidget.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS,appWidgetIDs);

        getApplicationContext().sendBroadcast(updateWidget);
    }







}
