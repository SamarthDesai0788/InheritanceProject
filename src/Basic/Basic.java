package Basic;

public class Basic {

    String Ename;
    float Esalary;
    int Eid;

    public Basic(String Ename, float Esalary, int Eid) {
        this.Ename = Ename;
        this.Esalary = Esalary;
        this.Eid = Eid;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee Salary: " + Esalary);
    }

    public static class Development extends Basic {
        public Development(String Ename, float Esalary, int Eid) {
            super(Ename, Esalary, Eid);
        }

        public void calculateIncentive() {
            if (Esalary < 15000) {
                float incentive = Esalary * 0.05f;
                System.out.println("Development Employee Salary including 5% incentive: " + (Esalary + incentive));
            } else if (Esalary >= 15000) {
                float incentive = Esalary * 0.08f;
                System.out.println("Development Employee Salary including 8% incentive: " + (Esalary + incentive));
            } else {
                System.out.println("There is no matching employee in Development");
            }
        }
    }

    public static class Testing extends Basic {
        public Testing(String Ename, float Esalary, int Eid) {
            super(Ename, Esalary, Eid);
        }

        public void calculateIncentive() {
            if (Esalary < 10000) {
                float incentive = Esalary * 0.03f;
                System.out.println("Testing Employee Salary including 3% incentive: " + (Esalary + incentive));
            } else if (Esalary >= 20000) {
                float incentive = Esalary * 0.10f;
                System.out.println("Testing Employee Salary including 10% incentive: " + (Esalary + incentive));
            } else {
                System.out.println("There is no matching employee in Testing");
            }
        }
    }

    public static void main(String[] args) {
  
        
        Development d1 = new Development("Rahul", 12000, 1099);
        Testing t1 = new Testing("Raju", 22000, 1092);

        System.out.println("Development Employee Details:");
        d1.displayDetails();
        d1.calculateIncentive();

        System.out.println("Testing Employee Details:");
        t1.displayDetails();
        t1.calculateIncentive();
    }
}
