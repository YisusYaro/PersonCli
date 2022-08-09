package src.persons.domain.values;

public enum PersonGenderList{

    MALE('H'),
    FEMALE('M');

    private final char value;

    private PersonGenderList(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}