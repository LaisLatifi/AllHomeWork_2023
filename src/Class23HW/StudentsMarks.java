package Class23HW;

public class StudentsMarks {
    //We have to calculate the average of marks obtained in three subjects
//by student A and by student B. Create class 'Marks' with an abstract
//method 'getPercentage' that will be returning the average percentage
//of marks. Provide implementation of abstract method in classes 'A'
//and 'B'. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its
//parameters for student B. Test your code

        public static void main(String[] args) {
            var studentA = new A(94,88,99);
            var studentB = new B(64,52,71,68);
            System.out.println(studentA.getPercentage());
            System.out.println(studentB.getPercentage());
        }
    }
    abstract class Marks {
        int subjectA;
        int subjectB;
        int subjectC;
        int subjectD;

        public Marks(int subjectA, int subjectB, int subjectC) {
            this.subjectA = subjectA;
            this.subjectB = subjectB;
            this.subjectC = subjectC;
        }

        public Marks(int subjectA, int subjectB, int subjectC, int subjectD) {
            this(subjectA, subjectB, subjectC);
            this.subjectD = subjectD;
        }

        abstract int getPercentage();
    }
    class A extends Marks {

        public A(int subjectA, int subjectB, int subjectC) {
            super(subjectA, subjectB, subjectC);
        }

        @Override
        int getPercentage() {
            return (subjectA + subjectB + subjectC) / 3;
        }
    }
    class B extends Marks {

        public B(int subjectA, int subjectB, int subjectC, int subjectD) {
            super(subjectA, subjectB, subjectC, subjectD);
        }

        @Override
        int getPercentage() {
            return (subjectA + subjectB + subjectC + subjectD) / 4;
        }
    }

