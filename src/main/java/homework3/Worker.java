package homework3;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{
    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary,age);
        this.status = "Рабочий";
        //this.age = age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f; Возраст %d",
                status, surName, name, salary, age);
    }
}
