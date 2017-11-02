package com.khutal.sandesh.act;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.answers.Answers;
import com.khutal.sandesh.R;
import com.khutal.sandesh.helper.SampleHelper;

import io.fabric.sdk.android.Fabric;


public class ActivitySample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Answers());
        setContentView(R.layout.sample_view);
        SampleHelper.with(this).init().loadAbout();
    }
}
