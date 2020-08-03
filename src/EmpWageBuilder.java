public class EmpWageBuilder{

        public static final int isFullTime=1;
        public static final int isPartTime=2;
        public static final int wagePerHour=20;
        public static final int noOfWorkingDays=20;
        public static final int maxHoursInMonth=50;

        public static void main(String args[]){
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
                System.out.println("Total Employee Wage: "+totalEmpWage);
        }
}

