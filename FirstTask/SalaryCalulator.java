package FirstTask;

/**
 * Класс для описания калькулятора заработной платы
 * @author Developer Name
 * @version 1.0
 */
public class SalaryCalulator {
    private double rate;
    private Integer baseSalary;

    /**
     * Конструктор класса
     * @param baseSalary Базова ставка заработной платы
     * @param rate Коэффициент налоговых отчислений
     */
    public SalaryCalulator(Integer baseSalary, double rate){
        this.baseSalary = baseSalary;
        this.rate = rate;
    }

    /**
     * метод расчета итоговой суммы заработной платы
     * @return сумма выплаты
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * rate);
        return baseSalary - tax;
    }

    public double getRate(){
        return this.rate;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
