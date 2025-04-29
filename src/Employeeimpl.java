import Allowence.*;
import hr.*;

import java.time.LocalDate;
import java.util.List;

public class Employeeimpl implements IEmployee {
    @Override
    public List<Employee> initListEmployee() {
        Permanent permanent1 = new Permanent(100.,"Anton",LocalDate.of(2025,1,1), Status.Permanent,20_000_000,
                new Insurence(LocalDate.now(),1,2,2),
                new Overtime(LocalDate.now(),10,50_000),
                new Tax(LocalDate.now(),0.5,0.5,0)
        );

        Permanent permanent2 = new Permanent(101.,"Budi",LocalDate.of(2025,1,1), Status.Permanent,15_000_000,
                new Insurence(LocalDate.now(),1,3,2),
                new Overtime(LocalDate.now(),5,50_000),
                new Tax(LocalDate.now(),0.5,0.5,0)
        );

        Contract contract1 = new Contract(102,"Agus",LocalDate.of(2020,12,12),Status.Contract,15_000_000,
                new Insurence(LocalDate.now(),1,0,2),
                new Overtime(LocalDate.now(),5,45_000),
                new Tax(LocalDate.now(),0.5,0.5,0)
        );

        Contract contract2 = new Contract(103,"Dian",LocalDate.of(2020,12,12),Status.Contract,10_000_000,
                new Insurence(LocalDate.now(),1,0,2),
                new Overtime(LocalDate.now(),6,45_000),
                new Tax(LocalDate.now(),0.5,0.5,0)
        );

        Magang magang1 = new Magang(104,"Gita",LocalDate.of(2024,12,12),Status.Magang,0,
                new Operational(LocalDate.now(),25,30_000,20_000)
        );

        Freelance freelance1 = new Freelance(
                105, "Rima", LocalDate.of(2025, 12, 12), Status.Freelance, 0,
                new PoProject(LocalDate.now(),25_000_000),
                new Tax(LocalDate.now(),0,0,2.5)
        );

        return List.of(permanent1, permanent2, contract1, contract2, magang1, freelance1);
    }

    @Override
    public void displayEmployees(List<Permanent> employees, List<Contract> contracts, List<Magang> interns, List<Freelance> freelances) {
        int totalEmployee = employees.size() + contracts.size() + interns.size() + freelances.size();
        int totalSalary = 0;
        int totalInsurance = 0;
        int totalEndsalary = 0;
        int totalOvertime = 0;
        int totalAllowance = 0;
        int totalTax = 0;

        for (Permanent emp : employees) {
            totalSalary += emp.getSalary();
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalEndsalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            System.out.println(emp);
        }

        for (Contract emp : contracts) {
            totalSalary += emp.getSalary();
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalEndsalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            totalAllowance += emp.getTotalAlawance();
            System.out.println(emp);
        }

        for (Magang emp : interns) {
            totalSalary += emp.getSalary();
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalEndsalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            totalAllowance += emp.getTotalAlawance();
            System.out.println(emp);
        }

        for (Freelance emp : freelances) {
            totalSalary += emp.getSalary();
            totalTax += emp.getTotalTax();
            totalEndsalary += emp.getTotalSalary();
            totalAllowance += emp.getTotalAlawance();
            System.out.println(emp);
        }

        System.out.println("\n===== SUMMARY =======");
        System.out.println("Total Employee     : " + totalEmployee);
        System.out.println("Total Salary       : Rp " + totalSalary);
        System.out.println("Total End Salary   : Rp " + totalEndsalary);
        System.out.println("Total Insurance    : Rp " + totalInsurance);
        System.out.println("Total Overtime     : Rp " + totalOvertime);
        System.out.println("Total Allowance    : Rp " + totalAllowance);
        System.out.println("Total Tax          : Rp " + totalTax);
        System.out.println("=====================");
    }
}
