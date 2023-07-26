package com.vip.domain;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

public class Integra {

    String org;
    String dst;
    String start;
    String disposition;
    String uniqueid;
    String userfield;
    String accountcode;
    int emp;
    String duration;
    int billsec;
    String urlRecord;
    float price;

    public Integra() {}

    public Integra(
            String org,
            String dst,
            String start,
            String disposition,
            String uniqueid,
            String userfield,
            String accountcode,
            int emp,
            String duration,
            int billsec,
            String urlRecord,
            float price) {
        this.org = org;
        this.dst = dst;
        this.start = start;
        this.disposition = disposition;
        this.uniqueid = uniqueid;
        this.userfield = userfield;
        this.accountcode = accountcode;
        this.emp = emp;
        this.duration = duration;
        this.billsec = billsec;
        this.urlRecord = urlRecord;
        this.price = price;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getUserfield() {
        return userfield;
    }

    public void setUserfield(String userfield) {
        this.userfield = userfield;
    }

    public String getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getBillsec() {
        return billsec;
    }

    public void setBillsec(int billsec) {
        this.billsec = billsec;
    }

    public String getUrlRecord() {
        return urlRecord;
    }

    public void setUrlRecord(String urlRecord) {
        this.urlRecord = urlRecord;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Integra{" +
                "org='" + org + '\'' +
                ", dst='" + dst + '\'' +
                ", start='" + start + '\'' +
                ", disposition='" + disposition + '\'' +
                ", uniqueid='" + uniqueid + '\'' +
                ", userfield='" + userfield + '\'' +
                ", accountcode='" + accountcode + '\'' +
                ", emp=" + emp +
                ", duration='" + duration + '\'' +
                ", billsec=" + billsec +
                ", urlRecord='" + urlRecord + '\'' +
                ", price=" + price +
                '}';
    }
}
