package com.example.rxjavapractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Observable<String> observable = Observable.just("String 1","String 2","String 3", "String 4","String 5","String 6", "String 7","String 8","String 9","String 10");

       // Observable<String> observable = Observable.fromIterable();

        Observer<String>  observer= new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e("sss","onSubscribe()");
            }

            @Override
            public void onNext(String s) {
                Log.e("sss",s);

            }

            @Override
            public void onError(Throwable e) {
                Log.e("sss","onError()");
            }

            @Override
            public void onComplete() {
                Log.e("sss","onComplete()");
            }
        };

        observable.subscribe(observer);
    }
}
