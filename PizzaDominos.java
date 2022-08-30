package examPractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PizzaDominos extends Pizza{

    public PizzaDominos(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        super(id, name, address, employees, phoneNumber);
        super.setStoreRank(calculateRank());
    }

    @Override
    public Integer calculateRank() {
        Integer totalEmployeeRank = 0;
        for(Employee employee : super.getEmployees()){
            totalEmployeeRank += employee.getRank();
        }
        return totalEmployeeRank;
    }

    @Override
    public Integer calculateRangedRank(Long range) {
        if(super.getNumberOfEmployees() > 0 ){
            LocalDate currentDate = LocalDate.now();
            LocalDate validateDate = currentDate.minusDays(range);

            for(Employee employee : super.getEmployees()){
                if(validateDate.isAfter(employee.getRankDate())){
                    employee.setRank();
                }
            }
            return calculateRank();
        } else {
            return 0;
        }
    }
}
