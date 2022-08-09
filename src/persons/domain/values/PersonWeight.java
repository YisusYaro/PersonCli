package src.persons.domain.values;

public class PersonWeight {
    private final double value;

    public PersonWeight(double value) throws Exception {
        if(value < 0) throw new Exception("Invalid weight");
        this.value = value;
    }

    public double toValue() {
        return this.value;
    }
}
