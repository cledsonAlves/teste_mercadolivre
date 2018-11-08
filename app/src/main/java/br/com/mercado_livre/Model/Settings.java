package br.com.mercado_livre.Model;

public class Settings {
    CardNumber card_number;
    Bin bin;
    SecurityCode security_code;


    public CardNumber getCard_number() {
        return card_number;
    }

    public void setCard_number(CardNumber card_number) {
        this.card_number = card_number;
    }

    public Bin getBin() {
        return bin;
    }

    public void setBin(Bin bin) {
        this.bin = bin;
    }

    public SecurityCode getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(SecurityCode security_code) {
        this.security_code = security_code;
    }
}
