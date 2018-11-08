package br.com.mercado_livre;

import org.junit.Assert;
import org.junit.Test;

import br.com.mercado_livre.Model.Connection.RetrofitConfig;

public class TesteRetrofitConfig {

    @Test
    public boolean testConnection(){
        Boolean resultado = false;
        new RetrofitConfig();
        Assert.assertTrue(resultado);
        return resultado;
    }
}
