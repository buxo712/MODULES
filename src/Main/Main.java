package Main;

import UserMgt.Management;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the UserReportManager
        Management manager = new Management();
        Management manager2 = new Management();

        // Adding users through the manager
        manager.addUser ("bwenge", 32);
        manager.addUser ("buxo", 19);

        // Adding reports through the manager, associating them with users
       manager.addReport("Buying a phone", "Latest model of iPhone", 2024, "Bwenge");
       manager.addReport("Selling a laptop", "Latest model Hp Laptop", 2024, "Buxo");

        // Displaying all users
        manager.displayUsers();

        // Displaying all reports
        manager.displayReports();
    }
}