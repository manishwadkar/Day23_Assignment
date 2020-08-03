
public class EmpWageBuilder{

        public static final int isFullTime=1;
        public static final int isPartTime=2;

        public static int computeEmpWage(String company,int wagePerHour,int noOfWorkingDays,int maxHoursInMonth){
                System.out.println("Welcome to Employee Wage Computation");
                int empHours=0;
                int totalEmpWage=0;
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
                System.out.println("Total Employee Wage for Company: "+company+" is: "+totalEmpWage);
                return totalEmpWage;
        }

        public static void main(String args[]){

                computeEmpWage("Google",20,20,50);
                computeEmpWage("Microsoft",50,15,30);
                computeEmpWage("Facebook",10,4,20);
        }
}
