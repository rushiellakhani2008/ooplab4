package lab4;

public class Emp {
        private String name;
        private int id;
        private double salary;

        public Emp(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public Emp(Emp real) {
            this.name = real.name;
            this.id = real.id;
            this.salary = real.salary;
        }

        public void setSalary(double amount) {
            salary = amount;
        }

        public void display() {

            System.out.println("Name: " + name + ", ID: " + id + ", Salary: Rs. " + salary);
        }

        public static void main(String[] args) {
            Emp emp1 = new Emp("rushell", 3007, 5052);
            Emp emp2 = new Emp(emp1);

            System.out.println("Before:");
            emp1.display();
            emp2.display();

            emp2.setSalary(60000);

            System.out.println("\nAfter:");
            emp1.display();
            emp2.display();
        }
    }
