package FirstTask;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Класс для описания сотрудника
 * @author Developer Name
 * @version 1.0
 */
public class Employee {
    private String name;
    private final Date dob;
    private int baseSalary;

    /**
     * Конструктор класса
     *
     * @param name       Имя сотрудинка
     * @param dob        Дата приема на работу
     * @param baseSalary Базова ставка заработной платы
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

     public String getName(){
        return this.name;
     }

     public void setName(String name){
        this.name = name;
     }

     public Data getBob(){
        return (Data) this.dob;
     }

     public Integer getBaseSalary(){
        return this.baseSalary;
     }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
