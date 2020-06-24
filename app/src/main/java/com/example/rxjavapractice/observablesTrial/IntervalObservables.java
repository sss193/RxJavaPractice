package com.example.rxjavapractice.observablesTrial;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
        This operator creates an Observable that emits
        a sequence of integers spaced by a particular time interval.
*/
public class IntervalObservables {

    public void test(){

        /*
         * This will print values from 0 after every second.
         */
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long value) {
                        System.out.println("onNext: " + value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
