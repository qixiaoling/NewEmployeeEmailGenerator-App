package EmailApp;

import java.util.Random;
import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String department;

    private String password;

    private Integer capacity;
    private String email;
    private String company;
    private char option;

    public Email() {
    }

    void generateEmail(){
        System.out.println("Your email address is: "+ firstName + "." + lastName + "@" + department + "." + company + ".com");
    }
    void generatePassword(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();


        for(int i = 0; i < length; i++ ) {
            int index = random.nextInt(alphabet.length());
            char charToAdd = alphabet.charAt(index);
            sb.append(charToAdd);

        }
        this.password = sb.toString();
        System.out.println("Your initial password is: " + this.password + ", please change this a.s.a.p");


    }

    void changePassword (char agree){
        Scanner scanner = new Scanner(System.in);
        switch (agree) {
            case 'Y' :
                System.out.println("Enter your new password: ");
                String enteredPW = scanner.nextLine();
                setPassword(enteredPW);
                System.out.println("Your password is now changed to: " + this.password);
                break;
            case 'N' :
                System.out.println("Please change your password within 30 days");
                break;
            default:
                System.out.println("Pleae only enter Y or N");
                break;

        }
    }

    void generate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        this.firstName = scanner.nextLine().trim();

        System.out.println("Enter your last name: ");
        this.lastName = scanner.nextLine().trim();

        System.out.println("Enter your company name: ");
        this.company = scanner.nextLine().trim();

        System.out.println("Enter your department name: ");
        this.department = scanner.nextLine().trim();

        this.generateEmail();
        this.generatePassword(9);

        System.out.println("Would you like to change your password? Y/N");
        char toChangePW = scanner.next().charAt(0);
        this.option = Character.toUpperCase(toChangePW);

        this.changePassword(option);






    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
