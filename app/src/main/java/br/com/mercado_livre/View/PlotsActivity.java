package br.com.mercado_livre.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.mercado_livre.R;
import br.com.mercado_livre.ViewModel.PlotsViewModel;

public class PlotsActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plots);
        new PlotsViewModel();
    }
}
