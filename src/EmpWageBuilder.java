public class EmpWageBuilder{

        public static void main(String args[]){
                System.out.println("Welcome to Employee Wage Computation");
                int isFullTime=1;
                int wagePerHour=20;
                int empHours=0;
                int empWage=0;

                int empCheck=(int)Math.floor(Math.random() * 10) % 2;
                System.out.println(empCheck);
                if(empCheck == isFullTime)
                        empHours=8;
                else
                        empHours=0;
                empWage=empHours*wagePerHour;
                System.out.println("Employee Wage: "+empWage);
        }
}
