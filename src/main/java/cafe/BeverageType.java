package cafe;

public enum BeverageType {
    AMERICANO("아메리카노"),
    LATTE("라떼"),
    MILK_TEA("밀크티"),
    MILK_SHAKE("밀크쉐이크"),
    CAMOMILE("캐모마일");

    private final String name;

    private BeverageType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
