package Class2HW;

public class Hw02 {
    public static void main(String[] args) {
        //Step 1
            /*
            Different type variables creation (both variable declaration and value initialization)
            for students' information
            */
        String name="Mike";
        String lastName="Ken";
        String grade="C";
        String city="Washington";
        String state="DC";
        String phone_number="+1-202-45964355";
        //Step 2
        //Change of students' city, state, phone number, and grade
        city="New York City";
        state="New York";
        grade="B";
        phone_number="+1-646-6543454";
        //Step 3
        //Print variable values
        System.out.println("My name is "+name+" and my last name is "+lastName+".");
        System.out.println("I am now a "+grade+" grade student.");
        System.out.println("I recently moved to "+city+"; "+state+".");
        System.out.println("My phone number is also changed to ".concat(phone_number)+".");
        //End
    }
}


