package employee_oop;

public class SickLeaveWorker extends Worker {

	public double calculateSalary(double workPrice) {
		return (0.8 * educationCoef) * workPrice;
	}
}
