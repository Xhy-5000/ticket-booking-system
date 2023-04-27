package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class flight_baggage_info {
    private int flight_id;
    private String fk_departure_airport;
    private String fk_arrival_airport;
    private String fk_airline_name;
    private String carry_on_allowance;
    private String checked_bag_allowance;
    private String overweight_bag_fee;

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public String getFk_departure_airport() {
        return fk_departure_airport;
    }

    public void setFk_departure_airport(String fk_departure_airport) {
        this.fk_departure_airport = fk_departure_airport;
    }

    public String getFk_arrival_airport() {
        return fk_arrival_airport;
    }

    public void setFk_arrival_airport(String fk_arrival_airport) {
        this.fk_arrival_airport = fk_arrival_airport;
    }

    public String getFk_airline_name() {
        return fk_airline_name;
    }

    public void setFk_airline_name(String fk_airline_name) {
        this.fk_airline_name = fk_airline_name;
    }

    public String getCarry_on_allowance() {
        return carry_on_allowance;
    }

    public void setCarry_on_allowance(String carry_on_allowance) {
        this.carry_on_allowance = carry_on_allowance;
    }

    public String getChecked_bag_allowance() {
        return checked_bag_allowance;
    }

    public void setChecked_bag_allowance(String checked_bag_allowance) {
        this.checked_bag_allowance = checked_bag_allowance;
    }

    public String getOverweight_bag_fee() {
        return overweight_bag_fee;
    }

    public void setOverweight_bag_fee(String overweight_bag_fee) {
        this.overweight_bag_fee = overweight_bag_fee;
    }

    @Override
    public String toString() {
        return "flight_baggage_info{" +
                "flight_id=" + flight_id +
                ", fk_departure_airport='" + fk_departure_airport + '\'' +
                ", fk_arrival_airport='" + fk_arrival_airport + '\'' +
                ", fk_airline_name='" + fk_airline_name + '\'' +
                ", carry_on_allowance='" + carry_on_allowance + '\'' +
                ", checked_bag_allowance='" + checked_bag_allowance + '\'' +
                ", overweight_bag_fee='" + overweight_bag_fee + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof flight_baggage_info that)) return false;
        return getFlight_id() == that.getFlight_id() && getFk_departure_airport().equals(that.getFk_departure_airport()) && getFk_arrival_airport().equals(that.getFk_arrival_airport()) && getFk_airline_name().equals(that.getFk_airline_name()) && getCarry_on_allowance().equals(that.getCarry_on_allowance()) && getChecked_bag_allowance().equals(that.getChecked_bag_allowance()) && getOverweight_bag_fee().equals(that.getOverweight_bag_fee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlight_id(), getFk_departure_airport(), getFk_arrival_airport(), getFk_airline_name(), getCarry_on_allowance(), getChecked_bag_allowance(), getOverweight_bag_fee());
    }
}
