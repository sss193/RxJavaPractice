package com.example.rxjavapractice.observablesTrial;

/*This operator creates an Observable that emits a range of sequential integers.
        The function takes two arguments: the starting number and length.*/


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RangeObservables {
    public void test(){
        Observable.range(4,7).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {

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
