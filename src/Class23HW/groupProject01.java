package Class23HW;


    // Reverse a String: Write a function to reverse a given string. For
// example, given the input "Hello", the output should be "olleH".
    public class groupProject01 {
        String reverseStr(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0 ; i--) {
                reverse = reverse += str.charAt(i);
            }
            return reverse;
        }

        public static void main(String[] args) {
            var obj = new groupProject01();
            System.out.println(obj.reverseStr("Hello"));
        }
    }

