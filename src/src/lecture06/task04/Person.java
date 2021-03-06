package lecture06.task04;

public class Person {

    String name;
    int age;

    public Person() {
        this("No name");
    }

    public Person(String name) {
        this(name, -1);
    }

    public Person(String name, int age) {

        this.name = name;

        if (0 <= age && age <= 150) {
            this.age = age;
        } else {
            // there is a better way to indicate an error
            // which we will review later on throughout the course
            System.out.println("Age is incorrect.");
            age = -1;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String introduce() {

        if (name.equals("No name") && age == -1) {
            return "I am John Doe.";
        } else if (age == -1) {
            return String.format("Hello, I am %s name.", name);
        } else {
            return String.format("Hello, I am %s name. I am %d years old.", name, age);
        }
    }

}
