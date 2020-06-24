package com.example.rxjavapractice.observablesTrial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.rxjavapractice.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
This operator creates an Observable from scratch by calling observer methods programmatically.
 An emitter is provided through which we can call the respective interface methods when needed.
*/

public class CreateObservables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_observables);

        final List<String> alphabets = Arrays.asList("one", "two", "three");
        /*
         * Observable.create() -> We will need to call the
         * respective methods of the emitter such as onNext()
         * & onComplete() or onError()
         *
         * */
        Observable observable = Observable.create(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter emitter) {

                try {

                    /*
                     * The emitter can be used to emit each list item
                     * to the subscriber.
                     *
                     * */
                    for (String alphabet : alphabets) {
                        emitter.onNext(alphabet);
                    }

                    /*
                     * Once all the items in the list are emitted,
                     * we can call complete stating that no more items
                     * are to be emitted.
                     *
                     * */
                    emitter.onComplete();

                } catch (Exception e) {

                    /*
                     * If an error occurs in the process,
                     * we can call error.
                     *
                     * */
                    emitter.onError(e);
                }
            }
        });


        /*
         * We create an Observer that is subscribed to Observer.
         * The only function of the Observer in this scenario is
         * to print the valeus emitted by the Observer.
         *
         * */
        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext: " + o);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        /*
         * We can call this method to subscribe
         * the observer to the Observable.
         * */
        observable.subscribe(observer);
    }
}
