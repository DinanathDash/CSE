#include <iostream>
#include <iomanip>
using namespace std;

class Employee {
private:
    string name, designation, officeAddress, pan;
    int age;
    double grossSalary, taxableIncome, totalTax;

public:
    Employee(string n, string d, string addr, int a, string p, double salary)
        : name(n), designation(d), officeAddress(addr), age(a), pan(p), grossSalary(salary), totalTax(0.0) {}

    void calculateTax() {
        double standardDeduction = 50000.0;
        taxableIncome = grossSalary - standardDeduction;
        totalTax = 0.0;

        if (taxableIncome <= 300000) {
            totalTax = 0.0;
        } else if (taxableIncome <= 700000) {
            totalTax = 0.05 * (taxableIncome - 300000);
        } else if (taxableIncome <= 1000000) {
            totalTax = 20000 + 0.10 * (taxableIncome - 700000);
        } else if (taxableIncome <= 1200000) {
            totalTax = 50000 + 0.15 * (taxableIncome - 1000000);
        } else if (taxableIncome <= 1500000) {
            totalTax = 80000 + 0.20 * (taxableIncome - 1200000);
        } else {
            totalTax = 140000 + 0.30 * (taxableIncome - 1500000);
        }

        totalTax += 0.04 * totalTax;
    }

    void displayTaxDetails() {
        cout << setprecision(2) << fixed;
        cout << "------------------------------------------------------\n";
        cout << "Name in Full: " << name << endl;
        cout << "Designation: " << designation << endl;
        cout << "Office Address: " << officeAddress << endl;
        cout << "AGE: " << age << "\t\tPAN: " << pan << endl;
        cout << "For the Financial Year 2024-25 (A.Y. 2025-26)\n";
        cout << "------------------------------------------------------\n";
        cout << "Gross Salary (Pay+GP+DA+HRA+ALLOWANCES):\tRs. " << grossSalary << endl;
        cout << "Less: Standard Deduction u/s 16(ia):\t-Rs. 50000.00" << endl;
        cout << "Total Income / Taxable Income:\t\tRs. " << taxableIncome << endl;
        cout << "------------------------------------------------------\n";
        cout << "Calculation of Income Tax\n";
        cout << "Income <= 300000.00\t\t\t: NIL\n";
        cout << "300000.00 <= Income < 700000.00\t: 5% of income exceeding 300000.00\n";
        cout << "700000.00 <= Income < 1000000.00\t: Rs. 20000.00 + 10% of income exceeding 700000.00\n";
        cout << "1000000.00 <= Income < 1200000.00\t: Rs. 50000.00 + 15% of income exceeding 1000000.00\n";
        cout << "1200000.00 <= Income < 1500000.00\t: Rs. 80000.00 + 20% of income exceeding 1200000.00\n";
        cout << "Income > 1500000.00\t\t\t: Rs. 140000.00 + 30% of income exceeding 1500000.00\n";
        cout << "------------------------------------------------------\n";
        cout << "Total Tax:\t\t\t\tRs. " << (totalTax - 0.04 * totalTax) << endl;
        cout << "Education & Health Cess @ 4%:\t\tRs. " << (0.04 * totalTax) << endl;
        cout << "Total Tax Payable:\t\t\tRs. " << totalTax << endl;
        cout << "------------------------------------------------------\n";
    }
};

int main() {
    Employee emp("Satya Brata Rout", "Asst. Prof.", "Office Address", 36, "XA08450A", 1275000);
    emp.calculateTax();
    emp.displayTaxDetails();
    return 0;
}
