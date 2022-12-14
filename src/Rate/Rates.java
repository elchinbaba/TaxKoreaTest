package Rate;

import java.util.*;

public enum Rates {
    HOUSEHOLD(1, "홍길동", 40, 0.05),
    BUSINESS(2, "이대한", 55, 0.035),
    FACTORIES(3, "이으뜸", 78, 0.025),
    OFFICES(4, "나이쁨", 35, 0.015),
    MILITARY(5, "한국민", 20, 0.0);

    private final int divisionCode;
    private final String divisionName;
    private final double waterRate;
    private final double taxRate;
    Rates(int divisionCode, String divisionName, double waterRate, double taxRate) {
        this.divisionCode = divisionCode;
        this.divisionName = divisionName;
        this.waterRate = waterRate;
        this.taxRate = taxRate;
    }

    private static final Map<Integer, Rates> map;
    static {
        map = new HashMap<>();
        for (Rates v : Rates.values()) {
            map.put(v.divisionCode, v);
        }
    }
    public static Rates findByDivisionCode(int i) {
        return map.get(i);
    }

    public String getDivisionName() {
        return divisionName;
    }
    public double getWaterRate() {
        return waterRate;
    }
    public double getTaxRate() {
        return taxRate;
    }
}
