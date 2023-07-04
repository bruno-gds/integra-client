package com.vip.domain;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

public class Integra {

    private String calldate;
    private String src;
    private String dst;
    private String duration;
    private String billsec;
    private String disposition;
    private String userfield;
    private String accountcode;
    private String price;

    public Integra() {}

    public Integra(
            String calldate,
            String src,
            String dst,
            String duration,
            String billsec,
            String disposition,
            String userfield,
            String accountcode,
            String price) {
        this.calldate = calldate;
        this.src = src;
        this.dst = dst;
        this.duration = duration;
        this.billsec = billsec;
        this.disposition = disposition;
        this.userfield = userfield;
        this.accountcode = accountcode;
        this.price = price;
    }

    public String getCalldate() {
        return calldate;
    }

    public String getSrc() {
        return src;
    }

    public String getDst() {
        return dst;
    }

    public String getDuration() {
        return duration;
    }

    public String getBillsec() {
        return billsec;
    }

    public String getDisposition() {
        return disposition;
    }

    public String getUserfield() {
        return userfield;
    }

    public String getAccountcode() {
        return accountcode;
    }

    public String getPrice() {
        return price;
    }

    public void setCalldate(String calldate) {
        this.calldate = calldate;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setBillsec(String billsec) {
        this.billsec = billsec;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public void setUserfield(String userfield) {
        this.userfield = userfield;
    }

    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Integra{" +
                "calldate='" + calldate + '\'' +
                ", src='" + src + '\'' +
                ", dst='" + dst + '\'' +
                ", duration='" + duration + '\'' +
                ", billsec='" + billsec + '\'' +
                ", disposition='" + disposition + '\'' +
                ", userfield='" + userfield + '\'' +
                ", accountcode='" + accountcode + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
