package mobilePlans;
//Customer.java
/* Neil Sebbey - Software Development Stream (Yr. 2)
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

    /** Accessor methods to return (get) the ID number that identifies a customer
     * @return the ID number that identifies a customer */
    public int getCustId() {
        return custId;
    }

    /** Mutator methods to set the ID number that identifies a customer
     * @param custId The ID number that identifies a customer */
    public void setCustId(int custId) {
        this.custId = custId;
    }

    /** Accessor methods to return (get) the surname of a customer
     * @return the surname of a customer */
    public String getSurname() {
        return surname;
    }

    /** Mutator methods to set the surname of a customer
     * @param surname The surname of a customer */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** Accessor methods to return (get) the forename of a customer
     * @return the forename of a customer */
    public String getForename() {
        return forename;
    }

    /** Mutator methods to set the forename of a customer
     * @param forename The surname of a customer */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /** Accessor methods to return (get) the email address of a customer
     * @return the email address of a customer */
    public String getEmail() {
        return email;
    }

    /** Mutator methods to set the email address of a customer
     * @param email The email address of a customer */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Accessor methods to return (get) the home address of a customer
     * @return the home address of a customer */
    public String getAddress() {
        return address;
    }

    /** Mutator methods to set the home address of a customer
     * @param address The home address of a customer */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Accessor methods to return (get) the city where the customer lives
     * @return the city where the customer lives */
    public String getCity() {
        return city;
    }

    /** Mutator methods to set the city where the customer lives
     * @param city The city where the customer lives */
    public void setCity(String city) {
        this.city = city;
    }

    /** Accessor methods to return (get) the county where the customer resides
     * @return the county where the customer resides */
    public String getCounty() {
        return county;
    }

    /** Mutator methods to set the county where the customer resides
     * @param county The county where the customer resides */
    public void setCounty(String county) {
        this.county = county;
    }

    /** Accessor methods to return (get) the Eircode of the customer
     * @return the Eircode of the customer */
    public String getEircode() {
        return eircode;
    }

    /** Mutator methods to set the Eircode of the customer
     * @param eircode The Eircode of the customer */
    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    /** Accessor methods to return (get) the Plan ID used to identify the plan that the customer has signed up to
     * @return the Plan ID used to identify the plan that the customer has signed up to */
    public int getPlanId() {
        return planId;
    }

    /** Mutator methods to set the Plan ID used to identify the plan that the customer has signed up to
     * @param planId The Plan ID used to identify the plan that the customer has signed up to */
    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return String.format("Customer ID: %3d\nSurname: %s\nForename: %s\nEmail: %s\nAddress: %s\nCity: %s\nCounty: %s" +
                "\nEircode: %s\nPlan ID: %3d",getCustId(),getSurname(),getForename(),getEmail(),getAddress(),getCity(),
                getCounty(),getEircode(),getPlanId());
    }
}
