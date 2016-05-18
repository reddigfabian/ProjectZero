package udacity.fabianreddig.zero.myappportfolio.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import udacity.fabianreddig.zero.myappportfolio.R;
import udacity.fabianreddig.zero.myappportfolio.databinding.ActivityPortfolioBinding;
import udacity.fabianreddig.zero.myappportfolio.models.MyApp;
import udacity.fabianreddig.zero.myappportfolio.utils.UiUtils;
import udacity.fabianreddig.zero.myappportfolio.viewmodels.PortfolioViewModel;

public class PortfolioActivity extends AppCompatActivity {

    ActivityPortfolioBinding activityPortfolioBinding;
    PortfolioViewModel portfolioViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPortfolioBinding = DataBindingUtil.setContentView(this, R.layout.activity_portfolio);
        portfolioViewModel = PortfolioViewModel.getInstance();
        ArrayList<MyApp> myApps = portfolioViewModel.getApps();
        for (int i = 0; i < portfolioViewModel.getApps().size(); i++) {
            Button newButton = (Button)getLayoutInflater().inflate(R.layout.portfolio_button, null);
            newButton.setText(myApps.get(i).getName());
            newButton.setId(i);
            newButton.setOnClickListener(new OnPortfolioButtonClickListener());
            activityPortfolioBinding.portfolioContent.addView(newButton);
        }
    }

    private class OnPortfolioButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            UiUtils.shortToast(portfolioViewModel.getApps().get(v.getId()).getName());
        }
    }
}
