package homework_22_02;

public class Start {
    public static void main(String[] args) {
        Salary fixedSalaryEmployee1 = new FixedSalaryEmployee("Mark", "Mark", 44, 12240);
        Salary fixedSalaryEmployee2 = new FixedSalaryEmployee("Mark", "Mark", 33, 1890);
        Salary hourlySalaryEmployee1 = new FixedSalaryEmployee("Mark", "Mark", 24, 130, 80);

        FinancialService finSer = new FinancialService();
        Salary[] employees = {fixedSalaryEmployee1, fixedSalaryEmployee2, hourlySalaryEmployee1};

        for (Salary employee : employees) {
            finSer.pay(employee);
        }
        

    }


}
