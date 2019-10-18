package ru.itpark.model;

public class TurnOn extends Tarif{
    private int minutes;
    private String callsToNumbersMegafon;
    private String incomingCalls;
    private String internet;

    public TurnOn(String url, String name, int price, String territory , int minutes ,String callsToNumbersMegafon , String incomingCalls , String internet) {
        super(url, name, price, territory);
        this.minutes = minutes;
        this.callsToNumbersMegafon = callsToNumbersMegafon;
        this.incomingCalls = incomingCalls;
        this.internet = internet;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getCallsToNumbersMegafon() {
        return callsToNumbersMegafon;
    }

    public void setCallsToNumbersMegafon(String callsToNumbersMegafon) {
        this.callsToNumbersMegafon = callsToNumbersMegafon;
    }

    public String getIncomingCalls() {
        return incomingCalls;
    }

    public void setIncomingCalls(String incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}