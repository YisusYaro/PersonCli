package src.persons.domain.values;

public class PersonName {
    private final String value;

    public PersonName(String value) {
        this.value = value;
    }

    public String toValue() {
        return this.value;
    }
}
