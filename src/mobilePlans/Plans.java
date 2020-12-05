package mobilePlans;
//Plans.java
/* Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
 * OOP CA 2 - due for Sat, 5th Dec 2020
 * @author  Neil Sebbey
 * @since   14-11-2020  */

public class Plans {
    private int planId;
    private String name;
    private String description;
    private String operator;
    private int minutes;
    private int texts;
    private double dataGB;
    private double pricePM;

    public Plans() { this(0,"Not available","Not available","Not available",0,0,0,0); }

    public Plans (int planId, String name, String description, String operator, int minutes, int texts, double dataGB, double pricePM) {
        setPlanId(planId);
        setName(name);
        setDescription(description);
        setOperator(operator);
        setMinutes(minutes);
        setTexts(texts);
        setDataGB(dataGB);
        setPricePM(pricePM);
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getTexts() {
        return texts;
    }

    public void setTexts(int texts) {
        this.texts = texts;
    }

    public double getDataGB() {
        return dataGB;
    }

    public void setDataGB(double dataGB) {
        this.dataGB = dataGB;
    }

    public double getPricePM() {
        return pricePM;
    }

    public void setPricePM(double pricePM) {
        this.pricePM = pricePM;
    }
}
