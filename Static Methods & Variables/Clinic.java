public class Clinic {
    private static int totalClinics = 0;
    private static int totalVaccinated = 0;
    private int vaccinated = 0;
    private Person recent;

    public Clinic() {
        totalClinics++;
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotALAmountVaccinated() {
        return totalVaccinated;
    }

    public int getAmountVaccinated() {
        return vaccinated;
    }

    public Person recentlyVaccinated() {
        return recent;
    }

    public boolean vaccinate(Person person) {
        if (!person.isVaccinated()) {
            person.setVaccinated(true);
            totalVaccinated++;
            vaccinated++;
            recent = person;
            return true;
        } else return false;
    }
}
