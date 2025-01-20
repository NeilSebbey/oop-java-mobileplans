package mobilePlans;
//Operator.java
/** Neil Sebbey - Software Development Stream (Yr. 2)
 * OOP CA 2 - due for Sat, 5th Dec 2020
 * @author  Neil Sebbey
 * @version 1.0
 * @since   14-11-2020  */

import java.io.*;

public class Operator implements Serializable{
    private int operatorId;
    private String name;
    private String prePay;
    private String billPay;
    private String simOnly;
    private String MVNO;

    /** No-argument constructor */
    public Operator() { this(0,"Not available","No","No","No","No"); }

    /** 6-argument constructor
     * @param operatorId The ID number that identifies an operator
     * @param name The name of an operator
     * @param prePay This indicates whether the operator offers Prepay plans
     * @param billPay This indicates whether the operator offers Bill Pay plans
     * @param simOnly This indicates whether the operator offers SIM-only (Bill) plans
     * @param MVNO This indicates if an operator (Mobile Virtual Network Operator) is running off another network
     */
    public Operator(int operatorId, String name, String prePay, String billPay, String simOnly, String MVNO) {
        setOperatorId(operatorId);
        setName(name);
        setPrePay(prePay);
        setBillPay(billPay);
        setSimOnly(simOnly);
        setMVNO(MVNO);
    }

    /** Accessor methods to return (get) the ID number that identifies an operator
     * @return the ID number that identifies an operator */
    public int getOperatorId() {
        return operatorId;
    }

    /** Mutator methods to set the ID number that identifies an operator
     * @param operatorId The ID number that identifies an operator */
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    /** Accessor methods to return (get) the name of an operator
     * @return the name of an operator */
    public String getName() {
        return name;
    }

    /** Mutator methods to set the name of an operator
     * @param name The name of an operator */
    public void setName(String name) {
        this.name = name;
    }

    /** Accessor methods to return (get) the status on whether the operator offers Prepay plans
     * @return the status on whether the operator offers Prepay plans */
    public String getPrePay() {
        return prePay;
    }

    /** Mutator methods to set the status on whether the operator offers Prepay plans
     * @param prePay This indicates whether the operator offers Prepay plans */
    public void setPrePay(String prePay) {
        this.prePay = prePay;
    }

    /** Accessor methods to return (get) the status on whether the operator offers Bill Pay plans
     * @return the status on whether the operator offers Bill Pay plans */
    public String getBillPay() {
        return billPay;
    }

    /** Mutator methods to set the status on whether the operator offers Bill Pay plans
     * @param billPay This indicates whether the operator offers Bill Pay plans */
    public void setBillPay(String billPay) {
        this.billPay = billPay;
    }

    /** Accessor methods to return (get) the status on whether the operator offers SIM-only (Bill) plans
     * @return the status on whether the operator offers SIM-only (Bill) plans */
    public String getSimOnly() {
        return simOnly;
    }

    /** Mutator methods to set the status on whether the operator offers SIM-only (Bill) plans
     * @param simOnly This indicates whether the operator offers SIM-only (Bill) plans */
    public void setSimOnly(String simOnly) {
        this.simOnly = simOnly;
    }

    /** Accessor methods to return (get) the status on whether the operator (Mobile Virtual Network Operator) is running off another network
     * @return the status on whether the operator (Mobile Virtual Network Operator) is running off another network */
    public String getMVNO() {
        return MVNO;
    }

    /** Mutator methods to set the status on whether the operator (Mobile Virtual Network Operator) is running off another network
     * @param MVNO This indicates if an operator (Mobile Virtual Network Operator) is running off another network */
    public void setMVNO(String MVNO) {
        this.MVNO = MVNO;
    }

    @Override
    public String toString() {
        return String.format("Operator ID: %2d\nName: %s\nPrepay Plans offered: %s\nBill Pay plans offered: %s" +
         "\nSIM-only (Bill) Plans Offered: %s\nIs network an MVNO (running on a main network): %s",
                getOperatorId(),getName(),getPrePay(),getBillPay(),getSimOnly(),getMVNO());
    }
}
