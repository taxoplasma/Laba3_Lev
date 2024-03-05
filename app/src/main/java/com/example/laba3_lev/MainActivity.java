package com.example.laba3_lev;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree());

        logToLogcat("Это обычное сообщение в логе для Logcat");
        logToTimber("Это обычное сообщение в логе для Timber");

        logVerbose("Подробное сообщение в логе");
        logDebug("Отладочное сообщение в логе");
        logInfo("Информационное сообщение в логе");
        logWarning("Предупреждающее сообщение в логе");
        logError("Ошибка в логе");
    }

    private void logToLogcat(String message) {
        Log.i(TAG, message);
    }

    private void logToTimber(String message) {
        Timber.i(message);
    }

    private void logVerbose(String message) {
        Timber.v(message);
    }

    private void logDebug(String message) {
        Timber.d(message);
    }

    private void logInfo(String message) {
        Timber.i(message);
    }

    private void logWarning(String message) {
        Timber.w(message);
    }

    private void logError(String message) {
        Timber.e(message);
    }
}