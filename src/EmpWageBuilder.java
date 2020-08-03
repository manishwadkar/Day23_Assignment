
public class EmpWageBuilder{

        public static final int isFullTime=1;
        public static final int isPartTime=2;

        private final String company;
        private final int wagePerHour;
        private final int noOfWorkingDays;
        private final int maxHoursInMonth;
        private int totalEmpWage;
        
        public EmpWageBuilder(String company,int wagePerHour,int noOfWorkingDays,int maxHoursInMonth) {
        	this.company=company;
        	this.wagePerHour=wagePerHour;
        	this.noOfWorkingDays=noOfWorkingDays;
        	this.maxHoursInMonth=maxHoursInMonth;
        }
        
        public void computeEmpWage(){
                System.out.println("Welcome to Employee Wage Computation");
                int empHours=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=maxHoursInMonth && totalWorkingDays<=noOfWorkingDays){
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random() * 10) % 3;
                        System.out.println(empCheck);

                        switch (empCheck){

                        case isFullTime:
                                empHours=8;
                                break;
                        case isPartTime:
                                empHours=4;
                                break;
                        default:
                                empHours=0;
                        }
                        totalEmpHrs+=empHours;
                        System.out.println("Day: "+totalWorkingDays+"EmpHrs: "+empHours);
                }
                totalEmpWage=totalEmpHrs*wagePerHour;
        }

        public String toString() {
        	return "Total Employee Wage for Company: "+company+" is: "+totalEmpWage;
        }
        public static void main(String args[]){

        	EmpWageBuilder g=new EmpWageBuilder("Google", 20, 20, 50);
        	EmpWageBuilder m=new EmpWageBuilder("Microsoft", 50, 15, 30);
        	g.computeEmpWage();
        	System.out.println(g);
        	m.computeEmpWage();
        	System.out.println(m);
        }
}
