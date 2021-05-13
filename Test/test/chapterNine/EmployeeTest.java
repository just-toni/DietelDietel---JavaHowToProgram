package chapterNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Yolanda", "Emmans", "AE124");
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void testThatFirstNameCanBeCollected(){
        assertEquals("Yolanda", employee.getFirstName());
    }

    @Test
    void testThatLastNameCanBeCollected(){
        assertEquals("Emmans", employee.getLastName());
    }

    @Test
    void testThatSocialSecurityNumberCanBeCollected(){
        assertEquals("AE124", employee.getSocialSecurityNumber());
    }

    @Test
    void testToDisplayEmployeeDetails(){
        assertEquals("""
                First name: Yolanda
                Last name: Emmans
                Social Security Number: AE124""", employee.toString());
    }

    @Test
    void testThatCommissionEmployeeInheritsFromEmployee(){
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jeffery", "Jackson", "BT231", 976.98, 0.32);
        commissionEmployee.getFirstName();
        commissionEmployee.getLastName();
        commissionEmployee.getSocialSecurityNumber();
        commissionEmployee.setCommissionRate(0.4);
        commissionEmployee.getCommissionRate();
        commissionEmployee.setGrossSales(1002.3);
        commissionEmployee.getGrossSales();
        assertEquals("""
                First name: Jeffery
                Last name: Jackson
                Social Security Number: BT231
                Gross sales: 1002.3
                Commission rates: 0.4""", commissionEmployee.toString());
    }

    @Test
    void testThatCommissionEmployeeHasEarnings(){
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jeffery", "Jackson", "BT231", 976.98, 0.32);
        assertEquals(312.6336, commissionEmployee.calculateEarnings());
    }

    @Test
    void testThatBaseCommissionEmployeeInheritsFromEmployee(){
        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee("Jeffery", "Jackson", "BT231", 976.98, 0.32, 234.99);
        baseCommissionEmployee.getFirstName();
        baseCommissionEmployee.getLastName();
        baseCommissionEmployee.getSocialSecurityNumber();
        baseCommissionEmployee.setCommissionRate(0.4);
        baseCommissionEmployee.getCommissionRate();
        baseCommissionEmployee.setGrossSales(1002.3);
        baseCommissionEmployee.getGrossSales();
        baseCommissionEmployee.setBaseSalary(456.98);
        baseCommissionEmployee.getBaseSalary();
        assertEquals("""
                BaseCommission Employee
                First name: Jeffery
                Last name: Jackson
                Social Security Number: BT231
                Gross sales: 1002.3
                Commission rates: 0.4
                Base salary: 456.98""", baseCommissionEmployee.toString());
    }

    @Test
    void testThatBaseCommissionEmployeeHasEarnings(){
        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee("Jeffery", "Jackson", "BT231", 976.98, 0.32, 234.99);
        assertEquals(547.6236, baseCommissionEmployee.calculateEarnings());
    }
}