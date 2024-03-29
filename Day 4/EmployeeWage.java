import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

         final int wagePerHour = 20;
         final int fullDayHour = 8;
         final int partTimeHour = 4;

         int totalDays = 0;
         int totalHours = 0;
         int totalWage = 0;
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM\n");

        Random random = new Random();

        while (totalDays < 20 && totalHours < 100) {
            totalDays++;
            int rand = random.nextInt(2);
            switch (rand) {
                case 0:             // 0 for Present
                    totalWage += wagePerHour * fullDayHour;
                    totalHours += fullDayHour;
                    break;
                
                case 1:             // 1 for Part Time
                    totalWage += wagePerHour * partTimeHour;
                    totalHours += partTimeHour;
                    break; 

                default:
                    totalWage = 0;
            }
        }

        System.out.println("Total Monthly Wage: $" + totalWage);
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);

    }
}
