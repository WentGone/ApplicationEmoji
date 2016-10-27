package went_gone.applicationemoji;

import android.app.Application;

/**
 * Describe:
 * Author: Created by Went_Gone on 2016/10/26.
 */

public class BaseApplication extends Application {
    private static BaseApplication application;
    public static BaseApplication getContext(){
        return application;
    }

    @Override
    public void onCreate() {
        application = this;
        super.onCreate();
    }
}
