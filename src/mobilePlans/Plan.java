package mobilePlans;
//Plan.java
/** Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
 * OOP CA 2 - due for Sat, 5th Dec 2020
 * @author  Neil Sebbey
 * @version 1.0
 * @since   14-11-2020  */

import java.io.*;

public class Plan implements Serializable {
    private int planId;
    private String name;
    private String description;
    private int operatorId;
    private int minutes;
    private int texts;
    private double dataGB;
    private double pricePM;

    /** No-argument constrctor */
    public Plan() { this(0,"Not available","Not available",0,0,0,0,0); }

    /** 8-argument constructor
     * @param planId The ID number that identifies a mobile plan
     * @param name The name of a plan
     * @param description The description of a plan
     * @param operatorId The ID number for an operator that promotes the plan
     * @param minutes The minutes allocated for a plan
     * @param texts The texts allocated for a plan
     * @param dataGB The data allowance (in GB) allocated for a plan
     * @param pricePM The price for a plan per month
     */
    public Plan(int planId, String name, String description, int operatorId, int minutes, int texts, double dataGB, double pricePM) {
        setPlanId(planId);
        setName(name);
        setDescription(description);
        setOperatorId(operatorId);
        setMinutes(minutes);
        setTexts(texts);
        setDataGB(dataGB);
        setPricePM(pricePM);
    }

    /** Accessor methods to return (get) parameters*/
    public int getPlanId() {
        return planId;
    }

    /** Mutator methods to set parameters*/
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

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
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

    @Override
    public String toString() {
        return String.format("Plan ID: %3d\nName: %s\nDescription: %s\nOperator ID: %3d\nMinutes: %5d\nTexts: %5d" +
                        "\nData (GB): %.2f\nPrice: %.2f",getPlanId(),getName(),getDescription(),getOperatorId(),getMinutes(),
                getTexts(),getDataGB(),getPricePM());
    }
}
