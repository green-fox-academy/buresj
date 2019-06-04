package com.testing.groot.models;

public class Cargo {

    private int caliber25;
    private int caliber30;
    private int caliber50;
    private String shipStatus;
    private boolean ready;

    public Cargo() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipStatus = "empty";
        this.ready = false;
    }

    public int getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(int caliber25) {
        this.caliber25 = caliber25;
    }

    public int getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(int caliber30) {
        this.caliber30 = caliber30;
    }

    public int getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(int caliber50) {
        this.caliber50 = caliber50;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
