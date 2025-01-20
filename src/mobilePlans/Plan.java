package mobilePlans;
//Plan.java
/* Neil Sebbey - Software Development Stream (Yr. 2)
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

    /** Accessor methods to return (get) the ID number of a mobile plan
     * @return The ID number that identifies a mobile plan */
    public int getPlanId() {
        return planId;
    }

    /** Mutator methods to set the ID number of a mobile plan
     * @param planId The ID number that identifies a mobile plan */
    public void setPlanId(int planId) {
        this.planId = planId;
    }

    /** Accessor methods to return (get) the name of a plan
     * @return The name of a plan */
    public String getName() {
        return name;
    }

    /** Mutator methods to set the name of a plan
     * @param name The name of a plan */
    public void setName(String name) {
        this.name = name;
    }

    /** Accessor methods to return (get) the description of a plan
     * @return The description of a plan */
    public String getDescription() {
        return description;
    }

    /** Mutator methods to set the description of a plan
     * @param description The description of a plan */
    public void setDescription(String description) {
        this.description = description;
    }

    /** Accessor methods to return (get) the ID number for an operator that promotes the plan
     * @return The ID number for an operator that promotes the plan */
    public int getOperatorId() {
        return operatorId;
    }

    /** Mutator methods to set the ID number for an operator that promotes the plan
    @param operatorId The ID number for an operator that promotes the plan */
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    /** Accessor methods to get the minutes allocated for a plan
     * @return the minutes allocated for a plan */
    public int getMinutes() {
        return minutes;
    }

    /** Mutator methods to set the minutes allocated for a plan
     @param minutes The minutes allocated for a plan */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /** Accessor methods to get the texts allocated for a plan
     * @return the texts allocated for a plan */
    public int getTexts() {
        return texts;
    }

    /** Mutator methods to set the texts allocated for a plan
     * @param texts The texts allocated for a plan */
    public void setTexts(int texts) {
        this.texts = texts;
    }

    /** Accessor methods to get the data allowance (in GB) allocated for a plan
     * @return the data allowance (in GB) allocated for a plan */
    public double getDataGB() {
        return dataGB;
    }

    /** Mutator methods to set the data allowance (in GB) allocated for a plan
     * @param dataGB The data allowance (in GB) allocated for a plan */
    public void setDataGB(double dataGB) {
        this.dataGB = dataGB;
    }

    /** Accessor methods to get the price for a plan per month
     * @return the price for a plan per month */
    public double getPricePM() {
        return pricePM;
    }

    /** Mutator methods to set the price for a plan per month
     * @param pricePM The price for a plan per month */
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
