package examPractice;

import java.time.LocalDate;
import java.util.ArrayList;

public class PizzaHut extends Pizza{

    public PizzaHut(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        super(id, name, address, employees, phoneNumber);
        super.setStoreRank(calculateRank());
    }

    @Override
    public Integer calculateRank() {
        if (super.getNumberOfEmployees() > 0) {
            Integer totalEmployeeRank = 0;
            Integer averageRank = 0;
            for (Employee employee : super.getEmployees()) {
                totalEmployeeRank += employee.getRank();
            }
            averageRank = totalEmployeeRank / super.getNumberOfEmployees();
            return averageRank;

        } else {
            return 0;
        }
    }

    @Override
    public Integer calculateRangedRank(Long range) { // range = 3
        if(super.getNumberOfEmployees() > 0 ){
            LocalDate currentDate = LocalDate.now(); // 29.08
            LocalDate validateDate = currentDate.minusDays(range); // 26.08

            for(Employee employee : super.getEmployees()){
                if(validateDate.isAfter(employee.getRankDate())){ // if (emplaye rank date < 26.08)
                    employee.setRank();
                }
            }
            return calculateRank();
        } else {
            return 0;
        }
    }
}
