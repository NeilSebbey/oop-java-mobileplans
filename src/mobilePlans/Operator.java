package mobilePlans;
//Operator.java
/** Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
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

    /** Accessor methods to return (get) parameters*/
    public int getOperatorId() {
        return operatorId;
    }

    /** Mutator methods to set parameters*/
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrePay() {
        return prePay;
    }

    public void setPrePay(String prePay) {
        this.prePay = prePay;
    }

    public String getBillPay() {
        return billPay;
    }

    public void setBillPay(String billPay) {
        this.billPay = billPay;
    }

    public String getSimOnly() {
        return simOnly;
    }

    public void setSimOnly(String simOnly) {
        this.simOnly = simOnly;
    }

    public String getMVNO() {
        return MVNO;
    }

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
