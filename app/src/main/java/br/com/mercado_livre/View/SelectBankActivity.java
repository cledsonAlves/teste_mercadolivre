package br.com.mercado_livre.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import br.com.mercado_livre.R;
import br.com.mercado_livre.ViewModel.SelectBankViewModel;

public class SelectBankActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bank);
        new SelectBankViewModel(this);


    }
}
