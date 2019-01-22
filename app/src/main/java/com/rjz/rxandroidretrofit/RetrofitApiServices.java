package com.rjz.rxandroidretrofit;

import com.rjz.rxandroidretrofit.model.Example;

import java.util.HashMap;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitApiServices {

    @POST("Webservice.php")
    Observable<Example> getAllData(
            @Body HashMap<String, Object> body);
}
