package br.com.mercado_livre.Model.Connection;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by cledson.alves on 08/08/2018.
 */

public class RetrofitConfig {
    private final Retrofit retrofit;

    private final String BASE_URL = "https://api.mercadopago.com/v1/";

    public RetrofitConfig() {
        this.retrofit =  new Retrofit.Builder().baseUrl("").
                addConverterFactory(JacksonConverterFactory.create()).
                build();

    }


}
