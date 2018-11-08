package br.com.mercado_livre.Model.Service;

import br.com.mercado_livre.Model.CardIssuers;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SelectBankService {


    @GET("payment_methods/card_issuers?public_key=444a9ef5-8a6b-429f-abdf-587639155d88")
    Call<CardIssuers> getBanks(@Query("payment_method_id") String payment_method_id);

}

