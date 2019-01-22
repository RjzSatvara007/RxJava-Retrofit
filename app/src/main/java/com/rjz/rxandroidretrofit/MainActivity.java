package com.rjz.rxandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.rjz.rxandroidretrofit.model.Example;

import java.util.HashMap;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllData();
    }

    private void getAllData() {
        RetrofitApiServices services = RetrofitApi.getRetrofit().create(RetrofitApiServices.class);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("key", value);

        Observable<Example> s = services.getAllData(hashMap);

        s.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(example -> {
                            // onNext
                            Log.e("Data : ", example.getMessage() + " ");
                        },
                        throwable -> {
                            // on Error
                            Log.e("Error : ", "Throwable " + throwable.getMessage());
                        }
                );
    }
}
