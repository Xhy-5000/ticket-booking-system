package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Data
public class payment {
    private int payment_id;
    private double amount;
    private Date payment_date;
    private String payment_method;
    private int fk_user_id;

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getFk_user_id() {
        return fk_user_id;
    }

    public void setFk_user_id(int fk_user_id) {
        this.fk_user_id = fk_user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof payment payment)) return false;
        return getPayment_id() == payment.getPayment_id() && Double.compare(payment.getAmount(), getAmount()) == 0 && getFk_user_id() == payment.getFk_user_id() && Objects.equals(getPayment_date(), payment.getPayment_date()) && Objects.equals(getPayment_method(), payment.getPayment_method());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPayment_id(), getAmount(), getPayment_date(), getPayment_method(), getFk_user_id());
    }
}
