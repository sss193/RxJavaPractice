package com.example.rxjavapractice.observablesTrial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.rxjavapractice.R;

/*
This operator creates an Observable from scratch by calling observer methods programmatically.
 An emitter is provided through which we can call the respective interface methods when needed.
*/

public class CreateObservables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_observables);
    }
}
