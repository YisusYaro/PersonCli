package src.persons.domain.values;

public class MaleImcParameters implements IMCParameters {
    private final int bottom = 20;
    private final int top = 25;

    @Override
    public int getBottom() {
        return this.bottom;
    }

    @Override
    public int getTop() {
        return this.top;
    }
}
