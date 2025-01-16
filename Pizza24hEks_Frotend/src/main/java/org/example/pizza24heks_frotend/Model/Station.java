package org.example.pizza24heks_frotend.Model;

public class Station {
    private Long station_id;
    private double latitude;
    private double longitude;
    private int numberOfDrones;

    public Long getStation_id() {
        return station_id;
    }

    public void setStation_id(Long station_id) {
        this.station_id = station_id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getNumberOfDrones() {
        return numberOfDrones;
    }

    public void setNumberOfDrones(int numberOfDrones) {
        this.numberOfDrones = numberOfDrones;
    }
}
