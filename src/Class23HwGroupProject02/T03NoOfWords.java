package Class23HwGroupProject02;

    //Task#03
    // Count the Number of Words in a String: Write a function to count the
//  number of words in a given string. Words are separated by spaces or
//  punctuation. For example, the input "Hello, world!" should return 2.
    public class T03NoOfWords {
        int noOfWords(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') count++;
            }
            return count + 1;
        }

        public static void main(String[] args) {
            var obj = new T03NoOfWords();
            System.out.println(obj.noOfWords("This is a sentence, yo!"));
        }
    }

