package examPractice;

import java.util.ArrayList;

public abstract class Pizza implements Rankable {
    private Integer id;
    private String name;
    private String address;
    private ArrayList<Employee> employees;
    private String phoneNumber;
    private Integer storeRank;

    public Pizza(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getNumberOfEmployees() {
        return this.employees.size();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getStoreRank() {
        return storeRank;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStoreRank(Integer storeRank) {
        this.storeRank = storeRank;
    }

    public Integer calculateEmployeeExpenses(){
        Integer totalEmployeeSalary = 0;
        for(Employee employee : this.employees){
            totalEmployeeSalary += employee.getSalary();
        }
        return totalEmployeeSalary;
    }

    public void hireEmployee(Employee employee){
        if(!this.employees.contains(employee)){
            this.employees.add(employee);
        }
    }

    public void fireEmployee(Employee employee){
        if(this.employees.contains(employee)){
            this.employees.remove(employee);
            employee.setSurprise(null);
        }
    }

    public void giveSuprise(Employee employee, Surprisable surprisable){
        if(this.employees.contains(employee)){
            employee.setSurprise(surprisable);
        }
    }
}
