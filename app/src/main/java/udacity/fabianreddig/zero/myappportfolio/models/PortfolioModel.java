package udacity.fabianreddig.zero.myappportfolio.models;

import java.util.ArrayList;

import udacity.fabianreddig.zero.myappportfolio.PortfolioApplication;
import udacity.fabianreddig.zero.myappportfolio.R;

/**
 * Created by WillowTree, Inc. on 5/16/16.
 */
public class PortfolioModel {
    ArrayList<MyApp> apps = new ArrayList<>();

    public PortfolioModel(){
        String[] appsStrings = PortfolioApplication.getApp().getResources().getStringArray(R.array.my_apps);
        for (String appsString : appsStrings) {
            apps.add(new MyApp.Builder(appsString).build());
        }
    }

    public ArrayList<MyApp> getApps() {
        return apps;
    }
}
