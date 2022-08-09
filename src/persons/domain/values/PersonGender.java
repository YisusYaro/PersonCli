package src.persons.domain.values;

public class PersonGender {
    private final char value;

    public PersonGender(char value) {
        this.value = value;
    }

    public char toValue() {
        return this.value;
    }

    public boolean validate(char gender) {
        return this.value == gender; 
    }
}
