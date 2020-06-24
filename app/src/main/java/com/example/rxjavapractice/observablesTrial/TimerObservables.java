package com.example.rxjavapractice.observablesTrial;


import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
This operator creates an Observable that emits one particular item after a span of time that you specify.
Difference between Observable.interval() and Observable.timer() —
timer() emits just a single item after a delay whereas interval() operator,
 on the other hand, will emit items spaced out with a given interval.
*/
public class TimerObservables {
    public void test(){
        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Long aLong) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
