package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class flight implements Serializable{
    private int flight_id;
    private String departure_airport;
    private String arrival_airport;
    private String airline_name;
    private String departure_time;
    private String arrival_time;
    private String flight_duration;
    private int wifi;
    private int charge;
    private int in_flight_entertainment;
    private int meal;

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public String getDeparture_airport() {
        return departure_airport;
    }

    public void setDeparture_airport(String departure_airport) {
        this.departure_airport = departure_airport;
    }

    public String getArrival_airport() {
        return arrival_airport;
    }

    public void setArrival_airport(String arrival_airport) {
        this.arrival_airport = arrival_airport;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getFlight_duration() {
        return flight_duration;
    }

    public void setFlight_duration(String flight_duration) {
        this.flight_duration = flight_duration;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getIn_flight_entertainment() {
        return in_flight_entertainment;
    }

    public void setIn_flight_entertainment(int in_flight_entertainment) {
        this.in_flight_entertainment = in_flight_entertainment;
    }

    public int getMeal() {
        return meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof flight flight)) return false;
        return getFlight_id() == flight.getFlight_id() && getWifi() == flight.getWifi() && getCharge() == flight.getCharge() && getIn_flight_entertainment() == flight.getIn_flight_entertainment() && getMeal() == flight.getMeal() && Objects.equals(getDeparture_airport(), flight.getDeparture_airport()) && Objects.equals(getArrival_airport(), flight.getArrival_airport()) && Objects.equals(getAirline_name(), flight.getAirline_name()) && Objects.equals(getDeparture_time(), flight.getDeparture_time()) && Objects.equals(getArrival_time(), flight.getArrival_time()) && Objects.equals(getFlight_duration(), flight.getFlight_duration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlight_id(), getDeparture_airport(), getArrival_airport(), getAirline_name(), getDeparture_time(), getArrival_time(), getFlight_duration(), getWifi(), getCharge(), getIn_flight_entertainment(), getMeal());
    }
}
