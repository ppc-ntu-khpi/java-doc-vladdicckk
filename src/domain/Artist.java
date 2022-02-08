package domain;

/**
 * Клас "артист" який наслідується від класу "співробітник"
 * @author Посашков Влад
 */
public class Artist extends Employee {

    /**
     * Конструктор класу "артист"
     * @param skiils навички
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор класу "артист"
     * @param skiils
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Конструктор класу "артист" за замовчуванням
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Метод для форматування інформації про артиста
     * @return рядок з детальною інформацією
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Навички
     */
    private String[] skiils;

    /**
     * Метод для отримання навичок
     * @return навички
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод для встановлення навичок
     * @param skills навички
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Метод для отримання списку навичок
     * @return список навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
