package domain;
/**
 * Клас "менеджер", який розширює клас "співробітник"
 * @author Посашков Влад
 */
public class Manager extends Employee {

    /**
     * Конструктор класу менеджер
     * @param employees массив співробітників
     * @param name ім'я співробітника
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Метод для форматування інформації про співробітника
     * @return рядок з детальною інформацією
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор класу "менеджер"
     * @param employees массив співробітників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор класу "менеджер" за замовчуванням 
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Массив співробітників
     */
    private Employee[] employees;

    /**
     * Метод який повертає рядом співробітників
     * @return рядок співробітників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод який встановлює співробітників
     * @param employees масив співробітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Метод який повертає список співробітників
     * @return список співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
