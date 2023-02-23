class employee {
    // complete the class as mentioned in the problem statement
    int employee_id;
    String name;
    int salary;
    boolean stock_options;
    int vesting_period;

    employee(int employee_id, String name, int salary, boolean stock_options, int vesting_period) {
        this.employee_id = employee_id;
        this.name = name;
        this.salary = salary;
        this.stock_options = stock_options;
        this.vesting_period = vesting_period;
    }

    int employeeNumber() {
        return employee_id;
    }

    String name() {
        return name;
    }

    int salary() {
        return salary;
    }

    boolean stock_options() {
        return true;
    }

    int vesting_period() {
        return vesting_period;
    }
}

class company {
    // complete the class as mentioned in the problem statement
    int size;
    employee[] arr;

    company(int size, employee[] arr) {
        this.size = size;
        this.arr = arr;
    }

    void sortSalary() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].salary > arr[j].salary) {
                    employee temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sortEmployeeId() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].employee_id > arr[j].employee_id) {
                    employee temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sortVestingPeriod() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].vesting_period < arr[j].vesting_period) {
                    employee temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void stockOrNot(int id) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (id == arr[i].employee_id) {
                flag = true;
                if (arr[i].stock_options == true) {
                    System.out.println("Stock Granted to " + arr[i].name);
                } else {
                    System.out.println("Stock not Granted to " + arr[i].name);
                }
            }
        }
        if (flag == false)
            System.out.println("Invalid Employee ID");
    }

    int size() {
        return arr.length;
    }
}
