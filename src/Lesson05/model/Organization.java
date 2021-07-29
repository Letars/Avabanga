package Lesson05.model;

public class Organization {

    public static void main(String[] args){
        Employee employee = new Employee("Big Boss","Vasily Krokodilovich", "Head", "krokoko@info.com", 798866635, 100500, 45);


        Employee[] Employee = new Employee[5];
        Employee[0] = new Employee("Employee 1","Albert Vum", "Engineer", "vum@info.com", 892312318, 30000, 30);
        Employee[1] = new Employee("Employee 2","Alena Shtorm", "Secretary", "shtorm@info.com", 892633355, 40000, 25);
        Employee[2] = new Employee("Employee 3","Avaka Kedavra", "Killer", "kedavra@info.com", 894564446, 100000, 48);
        Employee[3] = new Employee("Employee 4","Aka Vakeon", "Manager", "vakeon@info.com", 892312312, 35000, 33);
        Employee[4] = new Employee("Employee 5","Alla Pugacheva", "Accountant", "ivivan@info.com", 892555572, 66000, 54);

        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i].age > 40) {
                    Employee[i].information();

            }
        }
    }
}
