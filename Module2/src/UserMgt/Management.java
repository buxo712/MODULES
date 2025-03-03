package UserMgt;

import Userdata.Report;
import Userdata.User;

import java.util.ArrayList;
import java.util.List;

public class Management {
    // List to hold users
    private List<User> users;
    // List to hold reports
    private List<Report> reports;

    // Constructor
    public Management() {
        users = new ArrayList<>();
        reports = new ArrayList<>();
    }

    // Method to add a user
    public void addUser (String name, int age) {
        User user = new User(name, age);
        users.add(user);
        System.out.println("User  added: " + user.getName());
    }

    // Method to add a report
    public void addReport(String reportName, String description, int year, String userName) {
        User associatedUser  = null;
        // Find the user by name
        for (User  user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                associatedUser  = user;
                break;
            }
        }

        // Create a new report with the associated user
        if (associatedUser  != null) {
            Report report = new Report(reportName, description, year, associatedUser );
            reports.add(report);
            System.out.println("Report added: " + report.getReportName() + " for user: " + associatedUser .getName());
        } else {
            System.out.println("No user found with the name: " + userName);
        }
    }

    // Method to display all users
    public void displayUsers() {
        System.out.println("--------User  List---------");
        for (User  user : users) {
            user.user();
        }
    }

    // Method to display all reports
    public void displayReports() {
        System.out.println("--------Report List---------");
        for (Report report : reports) {
            report.report(); // Use the correct method name
        }
    }
}