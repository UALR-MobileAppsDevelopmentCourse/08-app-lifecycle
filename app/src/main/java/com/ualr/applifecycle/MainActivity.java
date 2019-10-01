package com.ualr.applifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage(R.string.on_create);
        logMessage(R.string.on_create);
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage(R.string.on_pause);
        logMessage(R.string.on_pause);
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage(R.string.on_resume);
        logMessage(R.string.on_resume);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage(R.string.on_restart);
        logMessage(R.string.on_restart);
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage(R.string.on_start);
        logMessage(R.string.on_start);
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage(R.string.on_stop);
        logMessage(R.string.on_stop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage(R.string.on_destroy);
        logMessage(R.string.on_destroy);
    }

    public void destroyActivity(View view) {
        this.finishAndRemoveTask();
    }

    private void showMessage(int stringResId) {
        Toast.makeText(getApplicationContext(), stringResId, Toast.LENGTH_SHORT).show();
    }

    private void logMessage(int stringResId) {
        Log.d(TAG, getString(stringResId));
    }

}
