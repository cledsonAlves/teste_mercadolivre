package br.com.mercado_livre.Model.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PaymentsService {
    @GET("payment_methods?public_key=444a9ef5-8a6b-429f-abdf-587639155d88")
    Call getPayments();

}
