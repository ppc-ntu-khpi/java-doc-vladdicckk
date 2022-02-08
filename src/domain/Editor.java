package domain;

/**
 * Клас "редактор" який наслідується від класу "артист"
 * @author Посашков Влад
 */
public class Editor extends Artist {

    /**
     * Конструктор класу "редактор"
     * @param electronicEditing чи редагує електронно
     * @param skiils навички
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу "редактор"
     * @param electronicEditing чи редагує електронно
     * @param skiils навички
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу "редактор"
     * @param electronicEditing чи редагує електронно
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор класу "редактор" за замовчуванням
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Метод для форматування інформації про артиста
     * @return рядок з детальною інформацією
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
    }

    /**
     * Чи редагує електронно
     */
    private boolean electronicEditing;

    /**
     * Метод для отримання типу редагування
     * @return чи редагує електронно
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Метод для встановлення типу редагування
     * @param electronic чи редагує електронно
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
