package src.persons.domain.values;

public enum ImcResult{
    LOW(-1),
    NORMAL(0),
    HIGHT(1);

    private final int value;

    private ImcResult(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}