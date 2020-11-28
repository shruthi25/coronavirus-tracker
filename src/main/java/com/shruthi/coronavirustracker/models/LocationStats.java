package com.shruthi.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String Country;
    private int latestTotalcases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getLatestTotalcases() {
        return latestTotalcases;
    }

    public void setLatestTotalcases(int latestTotalcases) {
        this.latestTotalcases = latestTotalcases;
    }
}
