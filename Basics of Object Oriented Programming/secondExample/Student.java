package secondExample;

public class Student {
	String firstName, lastName;
	double firstTestPoints, secondTestPoints, average;

	void setFirstName(String first) {
		firstName = first;
	}
	
	void setLastname(String second) {
		lastName = second;
	}
	
	void setFirstTestPoints(double firstTestResult) {
		firstTestPoints = firstTestResult;
	}
	
	void setPointsTest2(double secondTestResult) {
		secondTestPoints = secondTestResult;
	}
	
	void calcuateAverage() {
		average = ( firstTestPoints + secondTestPoints ) / 2;
	}
	
	void printAverage() {
		System.out.printf("Average points for student %s %s is %f %n" , firstName, lastName, average);
	}
}