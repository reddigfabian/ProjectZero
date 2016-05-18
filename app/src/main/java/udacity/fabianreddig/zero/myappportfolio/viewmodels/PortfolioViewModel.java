package udacity.fabianreddig.zero.myappportfolio.viewmodels;

import java.util.ArrayList;

import udacity.fabianreddig.zero.myappportfolio.models.MyApp;
import udacity.fabianreddig.zero.myappportfolio.models.PortfolioModel;

/**
 * Created by WillowTree, Inc. on 5/16/16.
 */
public class PortfolioViewModel {
    private static PortfolioViewModel instance;
    private PortfolioModel model;

    private PortfolioViewModel() {
        model = new PortfolioModel();
    }

    public static PortfolioViewModel getInstance(){
        if(instance == null){
            instance = new PortfolioViewModel();
        }
        return instance;
    }

    public ArrayList<MyApp> getApps(){
        return model.getApps();
    }
}
