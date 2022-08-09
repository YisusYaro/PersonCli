package src.persons.domain.values;
import java.util.Random;

public class PersonNss {
    private String value;
    private final String salt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private final int length = 8;

    public PersonNss() {
        this.value = this.generate();
    }

    private String generate() {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < this.length; i++) {
            builder.append(this.salt.charAt(random.nextInt(this.salt.length())));
        }
    
        return builder.toString();
    }

    public String toValue() {
        return this.value;
    }
}
