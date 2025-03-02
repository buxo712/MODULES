package Userdata;
// create class
public class User {
    // instance variable
    String name;
    int age;
    // create constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        }
// create getname method
        public String getName() {
            return name;
        }
// create getname method
        public int getAge() {
            return age;
        }
// create a printing method
        public void user(){
            System.out.println("--------User Details---------");
            System.out.println("name: "+ name+ "\nage:"+ age);
        }
}
