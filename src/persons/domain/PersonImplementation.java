package src.persons.domain;

import src.persons.domain.values.FemaleImcParameters;
import src.persons.domain.values.IMCParameters;
import src.persons.domain.values.ImcResult;
import src.persons.domain.values.MaleImcParameters;
import src.persons.domain.values.PersonAge;
import src.persons.domain.values.PersonGender;
import src.persons.domain.values.PersonGenderList;
import src.persons.domain.values.PersonHeight;
import src.persons.domain.values.PersonName;
import src.persons.domain.values.PersonNss;
import src.persons.domain.values.PersonWeight;

public class PersonImplementation implements Person {
    private PersonName name = new PersonName("");
    private PersonAge age = new PersonAge(0);
    private PersonNss nss = new PersonNss();
    private PersonGender gender = new PersonGender(PersonGenderList.MALE.getValue());
    private PersonWeight weight = new PersonWeight(0);
    private PersonHeight height = new PersonHeight(0);
    private IMCParameters imcParameters;


    public PersonImplementation(String name, int age, char gender, double weight, double height) throws Exception {
        this.name = new PersonName(name);
        this.age = new PersonAge(age);
        this.gender = new PersonGender(gender);
        this.weight = new PersonWeight(weight);
        this.height = new PersonHeight(height);
        this.setImcParameters();
    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%s, nss=%s, gender=%s, weight=%s, height=%s", this.name.toValue(), this.age.toValue(), this.nss.toValue(), this.gender.toValue(), this.weight.toValue(), this.height.toValue());
    }

    private void setImcParameters() {
        this.imcParameters = this.gender.toValue() == PersonGenderList.MALE.getValue() ? new MaleImcParameters() : new FemaleImcParameters();
    }

    @Override
    public boolean isLegalAge() {
        return this.age.isLegal();
    } 

    @Override
    public boolean validateGender(char gender) {
        return this.gender.validate(gender);
    }

    @Override
    public int getImc() throws Exception {
        return this.getImcStatus((this.calculateIMC()));
    }

    private int getImcStatus(double imc) {
        int bottom = this.imcParameters.getBottom();
        int top = this.imcParameters.getTop();
        if(imc < bottom) return ImcResult.LOW.getValue();
        if(imc >= bottom && imc <= top) return ImcResult.NORMAL.getValue();
        return ImcResult.HIGHT.getValue();
    }

    private double calculateIMC() throws Exception {
        if (this.height.isInvalid()) throw new Exception("Invalid height");
        double result = (this.weight.toValue()/(this.height.toValue()*this.height.toValue()));
        return result;
    }
}
