package mobilePlans;

public class Operators {
    private int operatorId;
    private String name;
    private String prePay;
    private String billPay;
    private String simOnly;
    private String MVNO;

    public Operators() { this(0,"Not available","N","N","N","N"); }

    public Operators (int operatorId, String name, String prePay, String billPay, String simOnly, String MVNO) {
        setOperatorId(operatorId);
        setName(name);
        setPrePay(prePay);
        setBillPay(billPay);
        setSimOnly(simOnly);
        setMVNO(MVNO);
    }

    public int getOperatorId() {
        return operatorId;
    }

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
}
