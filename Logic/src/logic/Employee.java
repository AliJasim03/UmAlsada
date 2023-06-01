package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int totalEmployee; // Total number of employees
    private int id; // Employee ID
    private String firstName; // Employee's first name
    private String lastName; // Employee's last name
    private String address; // Employee's address
    private String phone; // Employee's phone number
    private double salary; // Employee's salary

    public Employee(String firstName, String lastName, String address, String phone, double salary) {
        this.id = totalEmployee; // Assign the current totalEmployee value as the employee ID
        this.firstName = capitalize(firstName); // Capitalize and set the first name
        this.lastName = capitalize(lastName); // Capitalize and set the last name
        this.address = address; // Set the address
        this.phone = phone; // Set the phone number
        this.salary = salary; // Set the salary
        totalEmployee++; // Increment the totalEmployee count by 1
        saveEmpCount(); // Save the updated totalEmployee count
    }

    public int getId() {
        return id; // Return the employee ID
    }

    public void setId(int id) {
        this.id = id; // Set the employee ID
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName(); // Return the employee's full name
    }

    public String getFirstName() {
        return firstName; // Return the employee's first name
    }

    public void setFirstName(String firstName) {
        this.firstName = capitalize(firstName); // Capitalize and set the first name
    }

    public String getLastName() {
        return lastName; // Return the employee's last name
    }

    public void setLastName(String lastName) {
        this.lastName = capitalize(lastName); // Capitalize and set the last name
    }

    public String getAddress() {
        return address; // Return the employee's address
    }

    public void setAddress(String address) {
        this.address = address; // Set the employee's address
    }

    public String getPhone() {
        return phone; // Return the employee's phone number
    }

    public void setPhone(String phone) {
        this.phone = phone; // Set the employee's phone number
    }

    public double getSalary() {
        return salary; // Return the employee's salary
    }

    public void setSalary(double salary) {
        this.salary = salary; // Set the employee's salary
    }

    public static void saveEmpCount() {
        try {
            FileWriter fw = new FileWriter("src/Data/empCount.txt"); // Open a FileWriter to save the totalEmployee count
            fw.write(String.valueOf(totalEmployee)); // Write the totalEmployee count to the file
            fw.close(); // Close the FileWriter
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage()); // Print an error message if an exception occurs
        }
    }

    public static void loadEmpCount() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Data/empCount.txt")); // Open a BufferedReader to read the totalEmployee count
            totalEmployee = Integer.parseInt(br.readLine()); // Read the totalEmployee count from the file and parse it as an integer
            br.close(); // Close the BufferedReader
        } catch (IOException e) {
            totalEmployee = 1; // If an exception occurs, set the totalEmployee count to 1 (assuming it is the initial value)
            System.out.println("Error occurred: " + e.getMessage()); // Print an error message if an exception occurs
        }
    }

    private String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1); // Capitalize the first character of a string and return the modified string
    }
}
