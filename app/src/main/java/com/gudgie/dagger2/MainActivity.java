package com.gudgie.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean injected = networkApi != null;
        TextView userAvailable = findViewById(R.id.main_activity_target_view);
        userAvailable.setText(String.format("Dependency injection worked: %1$s", String.valueOf(injected)));
    }
}
