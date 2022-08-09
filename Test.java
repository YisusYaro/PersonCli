import java.io.BufferedReader;
import java.io.InputStreamReader;
import src.persons.domain.PersonImplementation;

class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Name: ");
        String name = reader.readLine();

        System.out.println("Age: ");
        String age = reader.readLine();

        System.out.println("Gender: ");
        String gender = reader.readLine();

        System.out.println("Weight: ");
        String weight = reader.readLine();

        System.out.println("height: ");
        String height = reader.readLine();

        PersonImplementation person = new PersonImplementation(
            name,
            Integer.parseInt(age),
            gender.charAt(0),
            Double.parseDouble(weight),
            Double.parseDouble(height)
        );
        
        System.out.println(person);
        System.out.println(person.getImc());
    }
}