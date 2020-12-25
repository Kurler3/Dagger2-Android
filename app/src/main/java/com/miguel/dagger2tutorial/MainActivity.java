package com.miguel.dagger2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent carComponent = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(100,1000);

        carComponent.inject(this);

        car1.drive();
        car2.drive();
    }
}