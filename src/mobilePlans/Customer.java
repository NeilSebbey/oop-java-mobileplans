package mobilePlans;
//Customer.java
/** Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
 * OOP CA 2 - due for Sat, 5th Dec 2020
 * @author  Neil Sebbey
 * @version 1.0
 * @since   14-11-2020  */

import java.io.*;

public class Customer implements Serializable {
    private int custId;
    private String surname;
    private String forename;
    private String email;
    private String address;
    private String city;
    private String county;
    private String eircode;
    private int planId;


    /** No-argument constructor */
    public Customer() { this(0,"Not available","Not available","Not available","Not available","Not available","Not available","N/A",0); }

    /** 9-argument constructor
     * @param custId The ID number that identifies a customer
     * @param surname The surname of a customer
     * @param forename The forename of a customer
     * @param email The email address of a customer
     * @param address The home address of a customer
     * @param city The city where the customer lives
     * @param county The county where the customer resides
     * @param eircode The Eircode of the customer
     * @param planId The Plan ID used to identify the plan that the customer has signed up to
     */
    public Customer(int custId, String surname, String forename, String email, String address, String city, String county, String eircode, int planId) {
        setCustId(custId);
        setSurname(surname);
        setForename(forename);
        setEmail(email);
        setAddress(address);
        setCity(city);
        setCounty(county);
        setEircode(eircode);
        setPlanId(planId);
    }

    /** Accessor methods to return (get) parameters*/
    public int getCustId() {
        return custId;
    }

    /** Mutator methods to set parameters*/
    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return String.format("Surname: %s\nForename: %s\nEmail: %s\nAddress: %s\nCity: %s\nCounty: %s" +
                "\nEircode: %s\nPlan ID: %3d",getSurname(),getForename(),getEmail(),getAddress(),getCity(),
                getCounty(),getEircode(),getPlanId());
    }
}
