package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 2L; // The version UID for serialization
    private static int totalMember; // The total count of members

    static void loadEmpCount() {
        throw new UnsupportedOperationException("Not supported yet."); // This method is not implemented and throws an exception
    }

    private int id; // The ID of the member
    private String firstName; // The first name of the member
    private String lastName; // The last name of the member
    private String address; // The address of the member
    private String phone; // The phone number of the member
    private String gender; // The gender of the member
    private String birthDate; // The birth date of the member

    public Member() {
        // Default constructor
    }

    public Member(String firstName, String lastName, String address, String phone, String gender, String birthDate) {
        this.id = totalMember; // Assign the member ID based on the total member count
        this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1); // Capitalize the first letter of the first name
        this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1); // Capitalize the first letter of the last name
        this.address = address; // Set the address
        this.phone = phone; // Set the phone number
        this.gender = gender; // Set the gender
        this.birthDate = birthDate; // Set the birth date
        totalMember++; // Increment the total member count
        saveMemberCount(); // Save the member count to a file
    }

    // Getters and setters
    public int getId() {
        return id; // Return the member ID
    }

    public void setId(int id) {
        this.id = id; // Set the member ID
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName(); // Return the full name of the member by combining the first name and last name
    }

    public String getFirstName() {
        return firstName; // Return the first name of the member
    }

    public void setFirstName(String firstName) {
        this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1); // Set the first name and capitalize the first letter
    }

    public String getLastName() {
        return lastName; // Return the last name of the member
    }

    public void setLastName(String lastName) {
        this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1); // Set the last name and capitalize the first letter
    }

    public String getAddress() {
        return address; // Return the address of the member
    }

    public void setAddress(String address) {
        this.address = address; // Set the address of the member
    }

    public String getPhone() {
        return phone; // Return the phone number of the member
    }

    public void setPhone(String phone) {
        this.phone = phone; // Set the phone number of the member
    }

    public String getGender() {
        return gender; // Return the gender of the member
    }

    public void setGender(String gender) {
        this.gender = gender; // Set the gender of the member
    }

    public String getBirthDate() {
        return birthDate; // Return the birth date of the member
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate; // Set the birth date of the member
    }

    public static void saveMemberCount() {
        try {
            FileWriter fw = new FileWriter("src/Data/memberCount.txt"); // Create a file writer to write the member count to a file
            fw.write(String.valueOf(totalMember)); // Write the total member count as a string
            fw.close(); // Close the file writer
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage()); // Print an error message if an exception occurs during file writing
        }
    }

    public static void loadMemberCount() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Data/memberCount.txt")); // Create a buffered reader to read the member count from a file
            totalMember = Integer.parseInt(br.readLine()); // Read the member count as a string and convert it to an integer
            br.close(); // Close the buffered reader
        } catch (IOException e) {
            totalMember = 1; // Set the total member count to 1 if an exception occurs during file reading
            System.out.println("Error occurred: " + e.getMessage()); // Print an error message if an exception occurs during file reading
        }
    }
}
