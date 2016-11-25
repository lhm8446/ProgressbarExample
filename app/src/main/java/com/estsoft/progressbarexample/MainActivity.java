package com.estsoft.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarCircle;
    private ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS );
        requestWindowFeature(Window.FEATURE_PROGRESS );
        setContentView(R.layout.activity_main);

        setProgressBarIndeterminateVisibility( true );
        setProgressBarVisibility( true );

        progressBarCircle = (ProgressBar)findViewById( R.id.progressCircle );
        progressBarCircle.setProgress( 0 );

        progressBarHorizontal = (ProgressBar)findViewById( R.id.progressHorizontal );
        progressBarHorizontal.setProgress( 0 );
        progressBarHorizontal.setSecondaryProgress(0);
    }

    public void onButtonClick( View view ) {
        switch(view.getId()){
            case R.id.buttonToggleProgressCircle:{
                boolean isCheked = ((ToggleButton)view).isChecked();
                progressBarCircle.setVisibility(isCheked ? View.INVISIBLE : View.VISIBLE);
                break;
            }

            case R.id.buttonProgressBarPrimaryIncrease:{
                progressBarHorizontal.incrementProgressBy(1);
                break;
            }
            case R.id.buttonProgressBarPrimaryDecrease:{
                progressBarHorizontal.incrementProgressBy(-1);
                break;
            }
            case R.id.buttonProgressBarSecondaryIncrease:{
                progressBarHorizontal.incrementProgressBy(10);
                break;
            }
            case R.id.buttonProgressBarSecondaryDecrease:{
                progressBarHorizontal.incrementProgressBy(-10);
                break;
            }
            default:
                break;
        }


    }
}
