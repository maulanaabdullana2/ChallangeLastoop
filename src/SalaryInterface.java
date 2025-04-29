import hr.*;
import java.util.List;

public interface SalaryInterface {
    void generateSalary(List<Permanent> employees, List<Contract> contracts);

    void generateOvertime(List<Permanent> employees, List<Contract> contracts);

    void generateAllowence(List<Magang> interns);

    void generateTax(List<Permanent> employees, List<Contract> contracts, List<Freelance> freelances);

    void generateTotalSalary(
            List<Permanent> employees,
            List<Contract> contracts,
            List<Magang> interns,
            List<Freelance> freelances
    );
}
