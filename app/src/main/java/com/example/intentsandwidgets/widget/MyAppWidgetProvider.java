package com.example.intentsandwidgets.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.EditText;
import android.widget.RemoteViews;

import com.example.intentsandwidgets.R;

public class MyAppWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds){
        for(final int appWidgetId: appWidgetIds){
            final RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.my_app_widget_provider);
            views.setTextViewText(R.id.widgetText,"Hallo World");
        }
    }





}
