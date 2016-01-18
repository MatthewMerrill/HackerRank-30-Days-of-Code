
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-4-boolean-operators-class-vs-instance/submissions/code/4681932

public class Person {
  
    private int age;	
	public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("This person is not valid, setting age to 0.");
            initialAge = 0;
        }
        age = initialAge;
	}

	public void amIOld() {
        if (age > 17)
            System.out.println("You are old.");
        else if (age > 12)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are young.");
	}

	public void yearPasses() {
        ++age;
	}

