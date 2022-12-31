package conceptofjava;

import java.util.Scanner;

class MotorBoat {
    private String motorBoatNumber;
    private int capacity;

    // write parameterized constructor, getter & setter method
    MotorBoat(String motorBoatNumber) {
        this.motorBoatNumber = motorBoatNumber;
    }

    public String getMotorBoatNumber() {
        return motorBoatNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

class SpeedBoat {
    private String speedBoatNumber;
    private int capacity;

    // write parameterized constructor, getter & setter method
    SpeedBoat(String speedBoatNumber) {
        this.speedBoatNumber = speedBoatNumber;
    }

    public String getSpeedBoatNumber() {
        return speedBoatNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

class Passenger {
    private String passengerId;
    private String name;
     SpeedBoat speedBoat;
     MotorBoat motorBoat;
    private static int passengerCounter;

    static {
        passengerCounter = 1;
    }

    public Passenger(String name) {
        // code to generate passenger is PS001 and onwards...
        passengerId = "PS00" + passengerCounter++;
        // use passengerCounter for the same
        // write code to set name
        this.name = name;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

}

class BoatTicketIssue {
    static boolean issueTicket(Passenger passenger, SpeedBoat speedBoat) {
        // write code to allot speed boat to passenger it has vacant seat
        if (speedBoat.getCapacity() > 0) {
            int a = speedBoat.getCapacity();
            a--;
            speedBoat.setCapacity(a);
            return true;
        } else {
            return false;
        }
        // reduce total capacity of the boat by 1 after allocation
        // if boat allocation it successful then return true; false otherwise
    }

    static boolean issueTicket(Passenger passenger, MotorBoat motorBoat) {
        // write code to allot motor boat to passenger it has vacant seat
        if (motorBoat.getCapacity() > 0) {
            int a = motorBoat.getCapacity();
            a--;
            motorBoat.setCapacity(a);
            return true;
        } else {
            return false;
        }
        // reduce total capacity of the boat by 1 after allocation
        // if boat allocation it successful then return true; false otherwise
    }
}

// Do not change this code
class MainBoat {
    static void printTicketDetails(Passenger ps, MotorBoat mb, SpeedBoat sb) {
        System.out.println("Passenger Id: " + ps.getPassengerId());
        System.out.println("Name: " + ps.getName());
        if (mb != null)
            System.out.println("Motor Boat Number: " + mb.getMotorBoatNumber());
        else
            System.out.println("Speed Boat Number: " + sb.getSpeedBoatNumber());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create object of MotorBoat
        MotorBoat mb = new MotorBoat("MB001");
        // set the capacity to 5
        mb.setCapacity(5);
        // Create object of SpeedBoat
        SpeedBoat sb = new SpeedBoat("SB001");
        // set the capacity to 3
        sb.setCapacity(3);
        // Create 10 objects of passenger class one by one and take input also
        int counter = 1;
        Passenger ps = null;
        do {
            System.out.print("Enter name of passenger ");
            ps = new Passenger(sc.next());
            System.out.print("Enter 1 to take motor boat or 2 for speed boat ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // user has opted for Motor Boat
                boolean isAlloted = BoatTicketIssue.issueTicket(ps, mb);
                if (isAlloted == true) {
                    printTicketDetails(ps, mb, null);
                } else {
                    System.out.println("No motor boat available.. Wait for next round");
                }
            } else if (choice == 2) {
                // user has opted for Speed Boat
                boolean isAlloted = BoatTicketIssue.issueTicket(ps, sb);
                if (isAlloted == true) {
                    printTicketDetails(ps, null, sb);
                } else {
                    System.out.println("No speed boat available.. Wait for next round");
                }
            }
            System.out.println();
        } while (++counter <= 10);
        sc.close();
    }
}
