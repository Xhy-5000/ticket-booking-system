package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class airline implements Serializable{
    private String airline_name;
    private String contact_information;
    private String password;

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getContact_information() {
        return contact_information;
    }

    public void setContact_information(String contact_information) {
        this.contact_information = contact_information;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof airline airline)) return false;
        return Objects.equals(getAirline_name(), airline.getAirline_name()) && Objects.equals(getContact_information(), airline.getContact_information()) && Objects.equals(getPassword(), airline.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirline_name(), getContact_information(), getPassword());
    }
}
