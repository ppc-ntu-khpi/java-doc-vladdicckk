package domain;

/**
 * Клас "співробітник"
 * @author Посашков Влад
 */
public class Employee {

    /**
     * Метод для форматування інформації про співробітника
     * @return рядок з детальною інформацією
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я співробітника
     */
    private String name;
    /**
     * Посада співробітника
     */
    private String jobTitle;
    /**
     * Ідентифікатор співробітника
     */
    private int ID;
    /**
     * Рівень співробітника
     */
    private int level;
    /**
     * Відділ  співробітника
     */
    private String dept;

   // private static int employeesCount = 0;

   /**
    * Конструктор класу "співробітник"
    * @param name ім'я співорбітника
    * @param jobTitle посада
    * @param level рівень
    * @param dept відділ
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор класу "співробітник" за замовчуванням 
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Метод для встановлення посади
     * @param job посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

     /**
     * Метод для отримання посади
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Метод для отримання ім'я
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для встановлення рівня
     * @param level рівень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Метод для отримання рівня
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Метод для отримання відділу
     * @return відділ
     */
    public String getDept() {
        return dept;
    }

    /**
     * Метод для встановлення відділу
     * @param dept відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Метод для встановлення ім'я
     * @param name ім'я
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
