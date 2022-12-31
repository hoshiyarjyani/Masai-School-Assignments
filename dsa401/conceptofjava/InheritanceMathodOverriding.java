package conceptofjava;

public class InheritanceMathodOverriding {
    // write code here
    double price;
    double tax;

    InheritanceMathodOverriding(double price, double tax) {
        this.price = price;
        this.tax = tax;
    }

    public double getTotalFee() {
        double totel = price + (price * tax / 100);
        return totel;
    }
}

class FeeWithCess extends InheritanceMathodOverriding {
    // write code here
    double gst;

    FeeWithCess(double price, double tax, double gst) {
        super(price, tax);
        this.gst = gst;
    }

    @Override
    public double getTotalFee() {
        return super.getTotalFee() + (price * gst / 100);
    }
}

class Main {

    public static void main(String args[]) {
        InheritanceMathodOverriding fe = new InheritanceMathodOverriding(45000.0, 10.0);
        System.out.println("Total fee is " + fe.getTotalFee());
        FeeWithCess fc = new FeeWithCess(50000.0, 11.5, 2.5);
        System.out.println("Total fee is " + fc.getTotalFee());
    }
}
// Output
// Total fee is 49500.0
// Total fee is 57000.0
