package ru.itpark.model;

public class ModemUsers extends Tarif{
    private String internet;

    public ModemUsers(String url, String name, int price, String territory , String internet) {
        super(url, name, price, territory);
        this.internet = internet;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}