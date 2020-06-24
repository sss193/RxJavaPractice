package com.example.rxjavapractice.observablesTrial;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
        This operator creates an Observable from set of items using an Iterable,
        which means we can pass a list or an array of items to the Observable and each item is
        emitted one at a time. Some of the examples of the operators include fromCallable(), fromFuture(),
        fromIterable(), fromPublisher(), fromArray().
        */


public class FromObservables {
    public void test(){
        Observable.fromArray(new String[]{"A","B","C"}).subscribe(
                new Observer<String>() {
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
