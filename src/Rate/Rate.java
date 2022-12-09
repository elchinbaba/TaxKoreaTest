package Rate;

public class Rate {
    public String getDivisionName(int capitalDivisionCode) {
        return Rates.findByCode(capitalDivisionCode).getDivisionName();
    }
    public double getWaterRate(int capitalDivisionCode) {
        return Rates.findByCode(capitalDivisionCode).getWaterRate();
    }

    public double getTaxRate(int capitalDivisionCode) {
        return Rates.findByCode(capitalDivisionCode).getTaxRate();
    }
}
