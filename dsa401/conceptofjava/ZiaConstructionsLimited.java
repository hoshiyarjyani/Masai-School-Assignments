package conceptofjava;

class ZiaConstructionsLimited {
    double Labour = 250;
    double Material = 350;
    double price = 0;

    double getTotalCost(double totalArea, double labourCharges) {
        // return the total bill cost up to two decimal places
        price = (totalArea * Material) + (labourCharges * totalArea);
        return price;
    }

    double getTotalCost(double totalArea, double labourCharges, double materialCharges) {
        // return the total bill cost up to two decimal places
        price = (totalArea * Material) + (labourCharges * totalArea) + (Material * materialCharges);
        return price;
    }
}

class ZiaConstructionsLimitedTester {
    public static void main(String args[]) {
        ZiaConstructionsLimited zcl = new ZiaConstructionsLimited();
        System.out.println(zcl.getTotalCost(1500, 250));
        System.out.println(zcl.getTotalCost(1500, 250, 350));
    }
}
