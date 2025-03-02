package Main;

import Itemmanagement.Item;
import Userdata.User;
public class Main {
    public static void main(String[] args) {
        // Create an instance of the user class
        User user = new User("bwenge", 32);
        // create the second instance of the use class
        User user1 = new User("rakuten",19);
        // Create an instance of the Item class
        Item item= new Item("iphone13",1200,2024);

        //calling all method
        user.user();
        user1.user();
        item.item();

    }
}
