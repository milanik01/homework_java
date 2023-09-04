package homework3;


import java.util.*;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     * @return
     */
    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        Random random1 = new Random();
        int r = random1.nextInt(0,2);
        //System.out.println("random1 "+r);
        if(r==0){
            int salaryIndex = random.nextInt(200, 500);

            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, random1.nextInt(18,99));
             }
        else{
            int salaryIndex = random.nextInt(20, 50)*2500;

            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 30 * salaryIndex, random1.nextInt(18,99));

        }
        }

    public static Employee[] generateEmployeers(int count){
        Employee[] employeers = new Employee[count];
        for (int i = 0; i < count; i++){
            employeers[i] = generateEmployee();
        }
        return employeers;
    }

    public static void main(String[] args) {

        Employee[] employeers = generateEmployeers(12);

        for (Employee employee: employeers) {
            System.out.println(employee);
        }

      //  Arrays.sort(employeers/*, new SalaryComparator()*/);

        Comparator agecomparator = new AgeComporator();
        Arrays.sort(employeers, agecomparator);


        System.out.println();

        for (Employee employee: employeers) {
            System.out.println(employee);
        }

    }

}
