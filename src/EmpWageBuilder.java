import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements EmpWageInterface {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;

	List<CompanyEmpWage> companyEmpWageList;

	int i = 0;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}

	@Override
	public void computeEmpWage() {

		System.out.println("Welcome to Employee Wage Computation");

		for (int i = 0; i < companyEmpWageList.size(); i++) {
			int empHours = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;

			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);

			while (totalEmpHrs <= companyEmpWage.maxHoursInMonth
					&& totalWorkingDays <= companyEmpWage.noOfWorkingDays) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				System.out.println(empCheck);

				switch (empCheck) {

				case isFullTime:
					empHours = 8;
					break;
				case isPartTime:
					empHours = 4;
					break;
				default:
					empHours = 0;
				}
				totalEmpHrs += empHours;
				System.out.println("Day: " + totalWorkingDays + "EmpHrs: " + empHours);
			}
			System.out.println("Total Emp hours: " + totalEmpHrs);
			companyEmpWage.setTotalEmpWage(totalEmpHrs * companyEmpWage.wagePerHour);
			System.out.println(companyEmpWage);
		}

	}

	@Override
	public void addCompanyWage(String company, int wagePerHour, int noOfWorkingDays, int maxHoursInMonth) {

		companyEmpWageList.add(new CompanyEmpWage(company, wagePerHour, noOfWorkingDays, maxHoursInMonth));

	}

	public static void main(String args[]) {

		EmpWageBuilder empWageBuilder = new EmpWageBuilder();

		empWageBuilder.addCompanyWage("Google", 20, 20, 50);
		empWageBuilder.addCompanyWage("Microsoft", 50, 15, 30);

		empWageBuilder.computeEmpWage();

	}
}
