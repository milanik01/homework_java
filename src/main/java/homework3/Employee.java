package homework3;


/**
 * Работник
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;
    /**
     * Статус сотрудника
     */
    protected String status;
    /**
     * Возраст сотрудника
     */
    protected int age;

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    public int getAge() {
        return age;
    }

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", surName, name, age);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }

        return surNameRes;

//        int ageRes = age.compareTo(o.age);
//        if(ageRes == 0){
//            return age.compareTo(o.age);
//        }
//        return ageRes;


    }
}
