package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class order {
    private int order_id;
    private String passenger_name;
    private double price;
    private String status="Booked";
    private int fk_user_id;
    private String fk_insurance_package;
    private int fk_payment_id;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFk_user_id() {
        return fk_user_id;
    }

    public void setFk_user_id(int fk_user_id) {
        this.fk_user_id = fk_user_id;
    }

    public String getFk_insurance_package() {
        return fk_insurance_package;
    }

    public void setFk_insurance_package(String fk_insurance_package) {
        this.fk_insurance_package = fk_insurance_package;
    }

    public int getFk_payment_id() {
        return fk_payment_id;
    }

    public void setFk_payment_id(int fk_payment_id) {
        this.fk_payment_id = fk_payment_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof order order)) return false;
        return getOrder_id() == order.getOrder_id() && getPrice() == order.getPrice() && getFk_user_id() == order.getFk_user_id() && getFk_payment_id() == order.getFk_payment_id() && Objects.equals(getPassenger_name(), order.getPassenger_name()) && Objects.equals(getStatus(), order.getStatus()) && Objects.equals(getFk_insurance_package(), order.getFk_insurance_package());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrder_id(), getPassenger_name(), getPrice(), getStatus(), getFk_user_id(), getFk_insurance_package(), getFk_payment_id());
    }
}
