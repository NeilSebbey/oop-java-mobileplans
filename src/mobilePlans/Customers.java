package mobilePlans;

public class Customers {
    private int custId;
    private String surname;
    private String forename;
    private String email;
    private String address;
    private String city;
    private String county;
    private String eircode;
    private int planId;

    public Customers() { this(0,"Not available","Not available","Not available","Not available","Not available","Not available","N/A",0); }

    public Customers (int custId, String surname, String forename, String email, String address, String city, String county, String eircode, int planId) {
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

    public int getCustId() {
        return custId;
    }

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
}
