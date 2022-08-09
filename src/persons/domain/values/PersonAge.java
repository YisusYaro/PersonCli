package src.persons.domain.values;

public class PersonAge {
    private final int value;

    public PersonAge(int value) throws Exception {
        if(value < 0) throw new Exception("Invalid height");
        this.value = value;
    }

    public int toValue() {
        return this.value;
    }
    
    public boolean isLegal() {
        return this.value >= 18;
    }
}
