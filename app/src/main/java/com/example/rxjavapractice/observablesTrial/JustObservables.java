package com.example.rxjavapractice.observablesTrial;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*This operator takes a list of arguments (maximum 10) and converts the items into Observable items.
        just() makes only 1 emission. For instance, If an array is passed as a parameter to the just() method,
        the array is emitted as single item instead of individual numbers.
        Note that if you pass null to just(), it will return an Observable that emits null as an item.*/
public class JustObservables {
    public void test(){
        Observable.just("a","a","as","aq","aw").subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {

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
