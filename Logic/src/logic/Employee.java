package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int totalEmployee;
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private double salary;

    public Employee(String firstName, String lastName, String address, String phone, double salary) {
        this.id = totalEmployee;
        this.firstName = capitalize(firstName);
        this.lastName = capitalize(lastName);
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        totalEmployee++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = capitalize(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = capitalize(lastName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void saveEmpCount() {
        try {
            FileWriter fw = new FileWriter("src/FileManager/Data/empCount.txt");
            fw.write(String.valueOf(totalEmployee));
            fw.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public static void loadEmpCount() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/FileManager/Data/empCount.txt"));
            totalEmployee = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            totalEmployee = 1;
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    private String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
