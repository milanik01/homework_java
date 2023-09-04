package homework3;



/**
 * TODO: Доработать в рамках домашнего задания
 *
 * Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов,
 * освоить работу с интерфейсами Comparator, Comparable.
 *
 * Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
 *
 * Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого
 * другого). Метод должен быть один!
 *
 * Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте
 * соответствующее состояние на уровне ваших классов).
 *
 * Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary,age);
        this.status = "Фрилансер";
       // this.age = age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Среднемесячная заработная плата (из расчета 2500 в час) %.2f; Возраст %d",
                status, surName, name, salary, age);
    }
}
