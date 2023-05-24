package Logic;

import java.util.ArrayList;

public class GymSystem {
    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static boolean addMember(Member member) {
        return members.add(member);
    }

    public static boolean editMember(Member member) {
        int index = members.indexOf(member);

        if (index != -1) {
            members.set(index, member);
            return true;
        }

        return false;
    }

    public static boolean removeMember(Member member) {
        return members.remove(member);
    }

    public static boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public static boolean editEmployee(Employee employee) {
        int index = employees.indexOf(employee);

        if (index != -1) {
            employees.set(index, employee);
            return true;
        }

        return false;
    }

    public static boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    public static boolean assignMemberToTrainer(Member member, PersonalTrainer trainer) {
        if (!trainer.getMembers().contains(member)) {
            trainer.getMembers().add(member);
            return true;
        }

        return false;
    }

    public static boolean removeMemberFromTrainer(Member member, PersonalTrainer trainer) {
        return trainer.getMembers().remove(member);
    }

    public static ArrayList<Member> getMembersByTrainer(PersonalTrainer trainer) {
        ArrayList<Member> trainerMemberList = new ArrayList<>();

        for (Member member : members) {
            if (trainer.getMembers().contains(member)) {
                trainerMemberList.add(member);
            }
        }

        return trainerMemberList;
    }

    public static void generateMarketingReport() {
    }

    public static void loadInitialData() {
    }

    public static void saveData() {
    }

    public static void exitProgram() {
    }
}