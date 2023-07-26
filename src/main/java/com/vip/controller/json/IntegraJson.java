package com.vip.controller.json;

import com.vip.domain.Integra;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 03/07/2023
 * Project Name: integra-client
 */

public class IntegraJson {
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

    public IntegraJson() {}

    public IntegraJson(Integra integra) {
        this.org = integra.getOrg();
        this.dst = integra.getDst();
        this.start = integra.getStart();
        this.disposition = integra.getDisposition();
        this.uniqueid = integra.getUniqueid();
        this.userfield = integra.getUserfield();
        this.accountcode = integra.getAccountcode();
        this.emp = integra.getEmp();
        this.duration = integra.getDuration();
        this.billsec = integra.getBillsec();
        this.urlRecord = integra.getUrlRecord();
        this.price = integra.getPrice();
    }

    public String getOrg() {
        return org;
    }

    public String getDst() {
        return dst;
    }

    public String getStart() {
        return start;
    }

    public String getDisposition() {
        return disposition;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public String getUserfield() {
        return userfield;
    }

    public String getAccountcode() {
        return accountcode;
    }

    public int getEmp() {
        return emp;
    }

    public String getDuration() {
        return duration;
    }

    public int getBillsec() {
        return billsec;
    }

    public String getUrlRecord() {
        return urlRecord;
    }

    public float getPrice() {
        return price;
    }
}