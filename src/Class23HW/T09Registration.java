package Class23HW;


    /*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
 */
    public class T09Registration {
        private String email;
        private String userName;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) this.email = email;
            else System.out.println("Must use Yahoo email");
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            if (userName.length() > 6) this.userName = userName;
            else System.out.println("Username must contain at least 7 characters");
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            if (password.length() > 6 && !password.equals(userName)) this.password = password;
            else System.out.println("Password must be at least 7 characters and cannot be your Username");
        }
    }
    class RegistrationTester {
        public static void main(String[] args) {
            var user1 = new T09Registration();
            user1.setEmail("brett.bond@email.com");
            user1.setUserName("gorilla123");
            user1.setPassword("gorilla123");
            System.out.println(user1.getEmail());
            System.out.println(user1.getUserName());
            System.out.println(user1.getPassword());
        }
    }

