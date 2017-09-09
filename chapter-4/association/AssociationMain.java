
public class AssociationMain {
    public static void main(String[] args) {
        // One association
        Association<String, Integer> person = new Association<String, Integer>("John Doe", 18);
        System.out.println(person.toString());

        // Many associations
        Association[] people = new Association[2];

        Association<String, Integer> personOne = new Association<String, Integer>("John Doe", 18);
        Association<String, Integer> personTwo = new Association<String, Integer>("Jane Doe", 19);
        people[0] = personOne;
        people[1] = personTwo;

        // Change the key (name)
        person.setKey("Jane Doe");
        System.out.println(person.toString());

        // Change the value (age)
        person.setValue(19);
        System.out.println(person.toString());

        // Print the people association list
        System.out.println("People:\n----------------------");
        for (Association a : people) {
            System.out.println(a.toString());
        }
    }
}