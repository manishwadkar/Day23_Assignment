
public interface EmpWageInterface {

	void computeEmpWage();

	void addCompanyWage(String company, int wagePerHour, int noOfWorkingDays, int maxHoursInMonth);

	int getTotalEmpWage(String company);
}
