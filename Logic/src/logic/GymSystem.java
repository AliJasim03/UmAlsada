package Logic;

import FileManager.FileManager;
import java.io.IOException;
import java.util.ArrayList;

public class GymSystem {
    public static ArrayList<Member> members = new ArrayList<>(); // List to store members of the gym
    public static ArrayList<Employee> employees = new ArrayList<>(); // List to store employees of the gym
    
    public static boolean addMember(Member member) {
        return members.add(member); // Add a member to the members list and return true if successful
    }
    
    public static void initializeSystem() {
        try {
            FileManager.getInstance().readEmployees(); // Read employee data from a file
            FileManager.getInstance().readMembers(); // Read member data from a file
            Employee.loadEmpCount(); // Load the total employee count from a file
            Member.loadEmpCount(); // Load the total member count from a file
            FileManager.getInstance().loadStartupFile(); // Load additional startup data from a file
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions here or throw them further
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
    }

    public static boolean editMember(Member member) {
        int index = members.indexOf(member); // Find the index of the member in the members list

        if (index != -1) { // If the member is found in the list
            members.set(index, member); // Update the member at the specified index
            return true; // Return true to indicate successful edit
        }

        return false; // Return false if the member is not found
    }

    public static boolean removeMember(Member member) {
        return members.remove(member); // Remove the specified member from the members list and return true if successful
    }

    public static boolean editEmployee(Employee employee) {
        int index = employees.indexOf(employee); // Find the index of the employee in the employees list

        if (index != -1) { // If the employee is found in the list
            employees.set(index, employee); // Update the employee at the specified index
            return true; // Return true to indicate successful edit
        }

        return false; // Return false if the employee is not found
    }

    public static boolean removeEmployee(Employee employee) {
        return employees.remove(employee); // Remove the specified employee from the employees list and return true if successful
    }

    public static boolean assignMemberToTrainer(Member member, PersonalTrainer trainer) {
        if (!trainer.getMembers().contains(member)) { // If the trainer does not already have the member assigned
            trainer.getMembers().add(member); // Add the member to the trainer's member list
            return true; // Return true to indicate successful assignment
        }

        return false; // Return false if the member is already assigned to the trainer
    }

    public static boolean removeMemberFromTrainer(Member member, PersonalTrainer trainer) {
        return trainer.getMembers().remove(member); // Remove the specified member from the trainer's member list and return true if successful
    }

    public static ArrayList<Member> getMembersByTrainer(PersonalTrainer trainer) {
        ArrayList<Member> trainerMemberList = new ArrayList<>(); // List to store members assigned to the trainer

        for (Member member : members) { // Iterate through all members
            if (trainer.getMembers().contains(member)) { // If the trainer has the member assigned
                trainerMemberList.add(member); // Add the member to the trainerMemberList
            }
        }

        return trainerMemberList; // Return the list of members assigned to the trainer
    }

    public static void generateMarketingReport() {
        // TODO: Implement the logic to generate a marketing report
    }

    public static void loadInitialData() {
        // TODO: Implement the logic to load initial data into the system
    }

    public static void saveData() {
        // TODO: Implement the logic to save data to files
    }

    public static void exitProgram() {
        // TODO: Implement the logic to exit the program gracefully
    }
}
