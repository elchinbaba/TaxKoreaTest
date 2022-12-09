package Rate;

import java.util.*;

public enum Rates {
    HOUSEHOLD(1, "홍길동", 40, 0.05),
    BUSINESS(2, "이대한", 55, 0.035),
    FACTORIES(3, "이으뜸", 78, 0.025),
    OFFICES(4, "나이쁨", 35, 0.015),
    MILITARY(5, "한국민", 20, 0.0);

    private final int code;
    private final String name;
    private final double waterRate;
    private final double taxRate;
    Rates(int capitalDivisionCode, String capitalDivisionName, double waterRate, double taxRate) {
        this.code = capitalDivisionCode;
        this.name = capitalDivisionName;
        this.waterRate = waterRate;
        this.taxRate = taxRate;
    }

    private static final Map<Integer, Rates> map;
    static {
        map = new HashMap<>();
        for (Rates v : Rates.values()) {
            map.put(v.code, v);
        }
    }
    public static Rates findByCode(int i) {
        return map.get(i);
    }

    public String getDivisionName() {
        return name;
    }
    public double getWaterRate() {
        return waterRate;
    }
    public double getTaxRate() {
        return taxRate;
    }
}
