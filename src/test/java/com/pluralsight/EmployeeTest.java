package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_should_store_time_punched_in() {
        // arrange
        Employee employeeTest1 = new Employee(4120, "Adrian", "Front desk", 18.00, 0);

        //act
        employeeTest1.punchIn(9);

        //assert
        assertEquals(9 , employeeTest1.getPunchIn());
    }

    @Test
    public void punchOut_should_calculate_hours_worked_correctly() {
        // arrange
        Employee employeeTest1 = new Employee(4120, "Adrian", "Front desk", 18.00, 0);
        employeeTest1.punchIn(9);

        //act
        employeeTest1.punchOut(17);

        //assert
        assertEquals(8 , employeeTest1.getHoursWorked());
    }


}