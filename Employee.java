package examPractice;

import java.time.LocalDate;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private Integer salary;
    private Integer rank;
    private LocalDate rankDate;
    private Surprisable surprise;

    public Employee(Integer id, String firstName, String lastName, String address, Integer salary, Integer rank, LocalDate rankDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.rank = rank;
        this.rankDate = rankDate;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getRank() {
        return rank;
    }

    public LocalDate getRankDate() {
        return rankDate;
    }

    public Surprisable getSurprise() {
        return surprise;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setRank() {
        this.rank = (Integer) (int)(Math.random() * 100);
        this.rankDate = LocalDate.now();
    }

    public void setRankDate(LocalDate rankDate) {
        this.rankDate = rankDate;
    }

    public void setSurprise(Surprisable surprise) {
        this.surprise = surprise;
    }
}
