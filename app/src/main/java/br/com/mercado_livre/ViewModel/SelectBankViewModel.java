package br.com.mercado_livre.ViewModel;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import br.com.mercado_livre.Model.CardIssuers;
import br.com.mercado_livre.Model.Connection.RetrofitConfig;
import br.com.mercado_livre.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SelectBankViewModel {
    RecyclerView listBanks;
    Button btnNext;
    private Activity activity;


    public SelectBankViewModel(Activity activity) {
        this.activity = activity;
        initComponets();

    }


    private void initComponets() {
       listBanks = activity.findViewById(R.id.listBanks);
       btnNext = activity.findViewById(R.id.btnNext);

    }

    public void getBanks(String payment_id) {
        Call<CardIssuers> call = new RetrofitConfig().getServiceBank().getBanks(payment_id);
        call.enqueue(new Callback<CardIssuers>() {
            @Override
            public void onResponse(Call<CardIssuers> call, Response<CardIssuers> response) {

            }

            @Override
            public void onFailure(Call<CardIssuers> call, Throwable t) {

            }
        });
    }

}
