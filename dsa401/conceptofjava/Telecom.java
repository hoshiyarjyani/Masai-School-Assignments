package conceptofjava;

public class Telecom {

    double Call = 300;
    double Data = 125;
    double service = 50;

    double getBillAmount(boolean usingCallService, boolean usingDataService, boolean usingSMSService) {
        // write code to return bill amount up to two decimal places
        double price = 0;
        if (usingCallService) {
            price += Call;
        }
        if (usingDataService) {
            price += Data;
        }
        if (usingSMSService) {
            price += service;
        }
        return price;
    }
}

class JoyInfocomTester {
    public static void main(String args[]) {
        Telecom joy = new Telecom();
        System.out.println(joy.getBillAmount(true, true, false));
        System.out.println(joy.getBillAmount(true, false, false));
        System.out.println(joy.getBillAmount(true, true, true));
    }
}
