package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HRManager is managing employees");
    }

    public void addEmployee(JuniorDeveloper jd) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = jd;
                return;
            }
        }
        System.out.println("JuniorDeveloper array is full");
    }

    public void addEmployee(MidDeveloper md) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = md;
                return;
            }
        }
        System.out.println("MidDeveloper array is full");
    }

    public void addEmployee(SeniorDeveloper sd) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = sd;
                return;
            }
        }
        System.out.println("SeniorDeveloper array is full");
    }
}
