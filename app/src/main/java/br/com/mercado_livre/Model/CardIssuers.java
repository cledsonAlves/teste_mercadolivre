package br.com.mercado_livre.Model;

public class CardIssuers {

    String id ;
    String name;
    String secure_thumbnail;
    String thumbnail;
    String processing_mode;
    String merchant_account_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecure_thumbnail() {
        return secure_thumbnail;
    }

    public void setSecure_thumbnail(String secure_thumbnail) {
        this.secure_thumbnail = secure_thumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getProcessing_mode() {
        return processing_mode;
    }

    public void setProcessing_mode(String processing_mode) {
        this.processing_mode = processing_mode;
    }

    public String getMerchant_account_id() {
        return merchant_account_id;
    }

    public void setMerchant_account_id(String merchant_account_id) {
        this.merchant_account_id = merchant_account_id;
    }
}
