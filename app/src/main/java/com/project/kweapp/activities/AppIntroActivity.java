package com.project.kweapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.project.kweapp.R;
import com.project.kweapp.fragments.SampleSlide;

public class AppIntroActivity extends BaseAppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.fragment_first_slide));
        addSlide(SampleSlide.newInstance(R.layout.fragment_second_slide));
        addSlide(SampleSlide.newInstance(R.layout.fragment_third_slide));
        addSlide(SampleSlide.newInstance(R.layout.fragment_fourth_slide));

        setFadeAnimation();
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    @Override
    public void onSlideChanged() {

    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
