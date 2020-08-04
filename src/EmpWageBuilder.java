import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpWageBuilder implements EmpWageInterface {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;

	List<CompanyEmpWage> companyEmpWageList;
	Map<String, Integer> companyTotalEmpWageMap;

	int i = 0;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		companyTotalEmpWageMap = new HashMap<String, Integer>();
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

				companyEmpWage.setDailyWage(empHours * companyEmpWage.wagePerHour);
				System.out.println("Day: " + totalWorkingDays + "EmpHrs: " + empHours);
				System.out.println("DailyWage: " + companyEmpWage.getDailyWage());
			}
			System.out.println("Total Emp hours: " + totalEmpHrs);
			companyEmpWage.setTotalEmpWage(totalEmpHrs * companyEmpWage.wagePerHour);
			
			System.out.println("Total Emp Wage: " + companyEmpWage.getTotalEmpWage());
			companyTotalEmpWageMap.put(companyEmpWage.company, companyEmpWage.getTotalEmpWage());
		}

	}

	@Override
	public int getTotalEmpWage(String company) {
		return companyTotalEmpWageMap.get(company);
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

		System.out.println("Total Employee Wage for Google is: "+empWageBuilder.getTotalEmpWage("Google"));
		System.out.println("Total Employee Wage for Microsoft is: "+empWageBuilder.getTotalEmpWage("Microsoft"));

	}
}
