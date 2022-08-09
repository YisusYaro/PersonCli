package src.persons.domain.values;

public class FemaleImcParameters implements IMCParameters{
    private final int bottom = 19;
    private final int top = 24;

    @Override
    public int getBottom() {
        return this.bottom;
    }

    @Override
    public int getTop() {
        return this.top;
    }
}
