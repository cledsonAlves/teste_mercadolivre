package br.com.mercado_livre.Model.Connection;

import br.com.mercado_livre.Model.Service.PaymentsService;
import br.com.mercado_livre.Model.Service.SelectBankService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by cledson.alves on 08/08/2018.
 */

public class RetrofitConfig {
    private final Retrofit retrofit;

    private final String BASE_URL = "https://api.mercadopago.com/v1/";

    public RetrofitConfig() {
        this.retrofit =  new Retrofit.Builder().baseUrl(BASE_URL).
                addConverterFactory(JacksonConverterFactory.create()).
                build();

    }

    public SelectBankService getServiceBank(){
        return this.retrofit.create(SelectBankService.class);
    }

    public PaymentsService getPaymentService(){
        return  this.retrofit.create(PaymentsService.class);
    }

}
