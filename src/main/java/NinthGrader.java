public class NinthGrader extends Student {

    public NinthGrader(String firstName, String lastName) {
        super(firstName, lastName, 2024);
    }

    public NinthGrader() {
        super("John", "Doe", 2024);
    }

    @Override
    public void doSomething() {
        System.out.println("Hello! I am in 9th grade.");
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", 2024 (Ninth Grader)";
    }
}