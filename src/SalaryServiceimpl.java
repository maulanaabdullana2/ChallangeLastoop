import hr.*;
import java.util.List;

public class SalaryServiceimpl implements SalaryInterface {
    @Override
    public void generateSalary(List<Permanent> employees, List<Contract> contracts) {
        for (Permanent emp : employees) {
            emp.calculteTotalInsurance();
        }
        for (Contract emp : contracts) {
            emp.calculteTotalInsurance();
        }
    }

    @Override
    public void generateOvertime(List<Permanent> employees, List<Contract> contracts) {
        for (Permanent emp : employees) {
            emp.calculateOvetime();
        }
        for (Contract emp : contracts) {
            emp.calculateOvetime();
        }
    }

    @Override
    public void generateAllowence(List<Magang> interns) {
        for (Magang emp : interns) {
            emp.CalculateAllowence();
        }
    }

    @Override
    public void generateTax(List<Permanent> employees, List<Contract> contracts, List<Freelance> freelances) {
        for (Permanent emp : employees) {
            emp.calculateTax();
        }
        for (Contract emp : contracts) {
            emp.calculateTax();
        }
        for (Freelance emp : freelances) {
            emp.calculateTax();
        }
    }

    @Override
    public void generateTotalSalary(List<Permanent> employees, List<Contract> contracts, List<Magang> interns, List<Freelance> freelances) {
        for (Permanent emp : employees) {
            emp.CalculateTotalsalary();
        }
        for (Contract emp : contracts) {
            emp.CalculateTotalsalary();
        }
        for (Magang emp : interns) {
            emp.CalculateTotalsalary();
        }
        for (Freelance emp : freelances) {
            emp.CalculateTotalsalary();
        }
    }
}
