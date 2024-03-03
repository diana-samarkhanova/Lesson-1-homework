/* An application to record company employees.
Information about the employee: first name, last name, patronymic, age, city.
Create variables and initialize them with values. Change the employee's age.
 */

public class Task3 {
    public static void main(String[] args){
        String firstname = "Alan"; //defining a variable for employee's name
        String lastname = "Issayev"; //defining a variable for employee's surname
        String patronymic = "Timuruly"; //defining a variable for employee's patronymic name
        int age = 25; //defining a variable for employee's age
        String city = "Astana"; //defining a variable for employee's living city

        age = 26; //changing the age of the employee
        System.out.println(firstname + "\n"+ lastname + "\n" + patronymic + "\n" + age + "\n" + city);
    }
}
