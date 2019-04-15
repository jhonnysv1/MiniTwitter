package com.jhonny.android.minitwitter.retrofit;

import com.jhonny.android.minitwitter.RequestLogin;
import com.jhonny.android.minitwitter.RequestSignup;
import com.jhonny.android.minitwitter.ResponseAuth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MiniTwitterService {

    @POST("/auth/login")
    Call<ResponseAuth> doLogin(@Body RequestLogin requestLogin);

    @POST("/auth/signup")
    Call<ResponseAuth> doSignup(@Body RequestSignup requestSignup);

}
