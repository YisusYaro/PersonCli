package src.persons.domain;

public interface Person {
    @Override
    public String toString();
    public boolean isLegalAge();
    public boolean validateGender(char gender);
    public int getImc() throws Exception;
}
