// Mutable class Employee
class Employee {
  private String name;
  private double salary;
 
  Employee(String empName, double empSalary) {
    this.name = empName;
    this.salary = empSalary;
  }
 
  public void setEmployeeName(String empName) {
    this.name = empName;
  }
 
  public void setSalary(double empSalary) {
    this.salary = empSalary;
  }
 
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Employee)) {
      return false;
    }
 
    Employee emp = (Employee)o;
    return emp.name.equals(name);
  }
 
  public int hashCode() {/* ... */}
 
}
 
// Client code
Map<Employee, Calendar> map =
  new ConcurrentHashMap<Employee, Calendar>();
// ...
