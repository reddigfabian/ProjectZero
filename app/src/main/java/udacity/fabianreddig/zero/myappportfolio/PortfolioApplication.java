package udacity.fabianreddig.zero.myappportfolio;

import android.app.Application;

/**
 * Created by WillowTree, Inc. on 5/16/16.
 */
public class PortfolioApplication extends Application {
    private static PortfolioApplication app;

    public static PortfolioApplication getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
