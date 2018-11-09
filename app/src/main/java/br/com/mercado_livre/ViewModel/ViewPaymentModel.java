package br.com.mercado_livre.ViewModel;

import android.support.v7.app.AppCompatActivity;

import br.com.mercado_livre.Model.Connection.RetrofitConfig;
import br.com.mercado_livre.Model.PaymentMethods;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewPaymentModel  extends AppCompatActivity {



    public void getPayments(){
        Call<PaymentMethods> call = new RetrofitConfig().getPaymentService().getPayments();
        call.enqueue(new Callback<PaymentMethods>() {
            @Override
            public void onResponse(Call<PaymentMethods> call, Response<PaymentMethods> response) {

            }

            @Override
            public void onFailure(Call<PaymentMethods> call, Throwable t) {

            }
        });
    }

}
