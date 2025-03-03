package Userdata;
public class Report {
    // Instance variables
    private String reportName;
    private String description;
    private int year;
    private User user; // Add a User instance variable

    // Constructor
    public Report(String reportName, String description, int year, User user) {
        this.reportName = reportName;
        this.description = description;
        this.year = year;
        this.user = user; // Associate the user with the report
    }

  

    {
        System.out.println("--------User  Report---------");
        System.out.println("Report name: " + reportName
                + "\nDescription: " + description
                + "\nYear: " + year
                + "\nUser:  " + (user != null ? user.getName() : "No user associated"));
    }
}