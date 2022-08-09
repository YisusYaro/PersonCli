package src.persons.domain.values;

public class PersonHeight {
    private final double value;

    public PersonHeight(double value) throws Exception {
        if(value < 0) throw new Exception("Invalid height");
        this.value = value;
    }

    public double toValue() {
        return this.value;
    }

    public boolean isInvalid() {
        return this.value <= 0;
    }
}
