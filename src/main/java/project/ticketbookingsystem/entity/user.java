package project.ticketbookingsystem.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class user implements Serializable{
    private Integer user_id;
    private String last_name;
    private String first_name;
    private String date_of_birth;
    private String gender;
    private String email;
    private double balance=0;
    private String password;
    private int mileage=0;
    private String membership_level="Basic";

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getMembership_level() {
        return membership_level;
    }

    public void setMembership_level(String membership_level) {
        this.membership_level = membership_level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user user)) return false;
        return Double.compare(user.getBalance(), getBalance()) == 0 && getMileage() == user.getMileage() && Objects.equals(getUser_id(), user.getUser_id()) && Objects.equals(getLast_name(), user.getLast_name()) && Objects.equals(getFirst_name(), user.getFirst_name()) && Objects.equals(getDate_of_birth(), user.getDate_of_birth()) && Objects.equals(getGender(), user.getGender()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getMembership_level(), user.getMembership_level());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getLast_name(), getFirst_name(), getDate_of_birth(), getGender(), getEmail(), getBalance(), getPassword(), getMileage(), getMembership_level());
    }
}
