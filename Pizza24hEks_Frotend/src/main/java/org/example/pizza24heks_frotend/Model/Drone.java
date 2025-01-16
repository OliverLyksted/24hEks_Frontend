package org.example.pizza24heks_frotend.Model;

public class Drone {
    private Long drone_id;
    private String serial_uuid;
    private String operationStatus;
    private Station station;

    public Long getDrone_id() {
        return drone_id;
    }

    public void setDrone_id(Long drone_id) {
        this.drone_id = drone_id;
    }

    public String getSerial_uuid() {
        return serial_uuid;
    }

    public void setSerial_uuid(String serial_uuid) {
        this.serial_uuid = serial_uuid;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
