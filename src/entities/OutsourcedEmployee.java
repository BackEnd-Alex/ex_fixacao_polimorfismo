package entities;

public class OutsourcedEmployee extends Employee {
    private Double addtionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double addtionalCharge) {
        super(name, hours, valuePerHours);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }
    @Override
    public Double payments(){
        return super.payments() + addtionalCharge * 1.1;
    }
}

