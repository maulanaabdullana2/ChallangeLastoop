import hr.*;

import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEmployee empinf = new Employeeimpl();
        var employees = empinf.initListEmployee();

        SalaryInterface salaryInf = new SalaryServiceimpl();
        var employeess = empinf.initListEmployee();


        List<Permanent> permanents = employees.stream()
                .filter(Permanent.class::isInstance)
                .map(Permanent.class::cast)
                .collect(Collectors.toList());

        List<Contract> contracts = employees.stream()
                .filter(Contract.class::isInstance)
                .map(Contract.class::cast)
                .collect(Collectors.toList());

        List<Magang> magangs = employees.stream()
                .filter(Magang.class::isInstance)
                .map(Magang.class::cast)
                .collect(Collectors.toList());

        List<Freelance> freelances = employees.stream()
                .filter(Freelance.class::isInstance)
                .map(Freelance.class::cast)
                .collect(Collectors.toList());

        salaryInf.generateSalary(permanents,contracts);
        salaryInf.generateOvertime(permanents,contracts);
        salaryInf.generateTax(permanents,contracts,freelances);
        salaryInf.generateTotalSalary(permanents,contracts,magangs,freelances);
        salaryInf.generateAllowence(magangs);
        empinf.displayEmployees(permanents,contracts,magangs,freelances);
    }
}