package com.wq.myjpush;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        initContext(context);
    }

    private Context  initContext(Context context) {
        this.context = context;
        return  context;
    }
}
