package com.example.attracti.customprogressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LineProgressBar lineProgressBar;
    private Runnable mTimer;
    protected int progress;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lineProgressBar = (LineProgressBar) findViewById(R.id.progress);
        mHandler = new Handler();
 //       lineProgressBar.maximum_progress = 100;
//        lineProgressBar.setLineOrientation(ProgressLineOrientation.VERTICAL);
        lineProgressBar.setLinearGradientProgress(true);
        lineProgressBar.setRoundEdgeProgress(true);
//        lineProgressBar.setProgress(50f);

    }
    @Override
    protected void onResume() {
        super.onResume();
        setTimer();
    }

    private void setTimer() {
        mTimer = new Runnable() {
            @Override
            public void run() {
                progress += 1;
                if (progress <= 100)
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            lineProgressBar.setProgress(progress);
                            lineProgressBar.setProgress(progress);

                        }
                    });

                mHandler.postDelayed(this, 100);
            }
        };

        mHandler.postDelayed(mTimer, 1000);

    }
}
