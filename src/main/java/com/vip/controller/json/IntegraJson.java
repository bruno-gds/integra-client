package com.vip.controller.json;

import com.vip.domain.Integra;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

public class IntegraJson {
    String calldate;
    String src;
    String dst;
    String duration;
    String billsec;
    String disposition;
    String userfield;
    String accountcode;
    String price;

    public IntegraJson() {}

    public IntegraJson(String calldate, String src, String dst, String duration, String billsec, String disposition, String userfield, String accountcode, String price) {
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

    public IntegraJson(Integra integra) {
        this.calldate = integra.getCalldate();
        this.src = integra.getSrc();
        this.dst = integra.getDst();
        this.duration = integra.getDuration();
        this.billsec = integra.getBillsec();
        this.disposition = integra.getDisposition();
        this.userfield = integra.getUserfield();
        this.accountcode = integra.getAccountcode();
        this.price = integra.getPrice();
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
}