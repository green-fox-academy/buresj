package com.greenfox.frontend.models;

public class Doubling {

    private int received;
    private int result;
    private String error;

    public Doubling() {
    }

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public void getError(String error) {
        this.error = error;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
