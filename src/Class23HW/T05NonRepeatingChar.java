package Class23HW;


//TASK#05
    // Find the First Non-Repeating Character in a String: Given a string,
// find and return the first non-repeating character. For example, in the
// string "abracadabra", the first non-repeating character is 'c'.
    public class T05NonRepeatingChar {
        public char findFirstNonRepeat(String str) {
            char c = ' ';
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                    c = str.charAt(i);
                    break;
                }
            }
            return c;
        }

        public static void main(String[] args) {
            var obj = new T05NonRepeatingChar();
            System.out.println(obj.findFirstNonRepeat("abracadabra"));
        }
    }

