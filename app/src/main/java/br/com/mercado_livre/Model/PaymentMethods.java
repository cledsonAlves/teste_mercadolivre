package br.com.mercado_livre.Model;

import java.util.ArrayList;

public class PaymentMethods {
    String id;
    String name;
    String payment_type_id;
    String status;
    String secure_thumbnail;
    String thumbnail;
    String deferred_capture;
    Settings settings;
    ArrayList<String> additional_info_needed;
    String min_allowed_amount;
    String max_allowed_amount;
    String accreditation_time;
    ArrayList<String> financial_institutions;
    ArrayList<String> processing_modes;

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

    public String getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(String payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getDeferred_capture() {
        return deferred_capture;
    }

    public void setDeferred_capture(String deferred_capture) {
        this.deferred_capture = deferred_capture;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public ArrayList<String> getAdditional_info_needed() {
        return additional_info_needed;
    }

    public void setAdditional_info_needed(ArrayList<String> additional_info_needed) {
        this.additional_info_needed = additional_info_needed;
    }

    public String getMin_allowed_amount() {
        return min_allowed_amount;
    }

    public void setMin_allowed_amount(String min_allowed_amount) {
        this.min_allowed_amount = min_allowed_amount;
    }

    public String getMax_allowed_amount() {
        return max_allowed_amount;
    }

    public void setMax_allowed_amount(String max_allowed_amount) {
        this.max_allowed_amount = max_allowed_amount;
    }

    public String getAccreditation_time() {
        return accreditation_time;
    }

    public void setAccreditation_time(String accreditation_time) {
        this.accreditation_time = accreditation_time;
    }

    public ArrayList<String> getFinancial_institutions() {
        return financial_institutions;
    }

    public void setFinancial_institutions(ArrayList<String> financial_institutions) {
        this.financial_institutions = financial_institutions;
    }

    public ArrayList<String> getProcessing_modes() {
        return processing_modes;
    }

    public void setProcessing_modes(ArrayList<String> processing_modes) {
        this.processing_modes = processing_modes;
    }
}