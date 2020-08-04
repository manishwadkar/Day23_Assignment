
public class CompanyEmpWage {

	public final String company;
	public final int wagePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursInMonth;
	private int totalEmpWage;
	private int dailyWage;

	public CompanyEmpWage(String company, int wagePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}

}
