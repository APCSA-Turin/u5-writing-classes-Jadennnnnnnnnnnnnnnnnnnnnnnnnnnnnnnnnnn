public class Person {
    private String name;
    private boolean vaccine = false;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean isVaccinated() {
        return vaccine;
    }

    public void setVaccinated(Boolean now) {
        vaccine = now;
    }
}
