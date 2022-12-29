package conceptofjava;

public class WatchPriceQuestion {
    

    double getWatchPrice(String watchType, int age, String gender) {
        double tCost = 7999;
        double tProfit = 12.5;
        double tGST = 7.5;
        double rCost = 10999;
        double rProfit = 13.5;
        double rGST = 12.5;

        double senior_dis = 3;
        double gend_dis = 2;

        double price = 0;

        String Watch = watchType;
        int Age = age;
        String Gender = gender;
        if (Watch == "Titan") {
            if (Age > 60 && Gender == "male") {
                price = tCost + (tCost * (tProfit / 100)) + (tCost * (tGST / 100));
                price = price - (price * (senior_dis / 100));

            } else if (Age > 60 && Gender == "female") {
                price = tCost + (tCost * (tProfit / 100)) + (tCost * (tGST / 100));
                price = price - (price * (gend_dis / 100));

            } else if (Gender == "female") {
                price = tCost + (tCost * (tProfit / 100)) + (tCost * (tGST / 100));
                price = price - (price * (gend_dis / 100));
            } else {
                price = tCost + (tCost * (tProfit / 100)) + (tCost * (tGST / 100));
            }
        }

        else {
            if (Age > 60 && Gender == "male") {
                price = rCost + (rCost * (rProfit / 100)) + (rCost * (rGST / 100));
                price = price - (price * (senior_dis / 100));

            } else if (Age > 60 && Gender == "female") {
                price = rCost + (rCost * (rProfit / 100)) + (rCost * (rGST / 100));
                price = price - (price * (gend_dis / 100));

            } else if (Gender == "female") {
                price = rCost + (rCost * (rProfit / 100)) + (rCost * (rGST / 100));
                price = price - (price * (gend_dis / 100));
            } else {
                price = rCost + (rCost * (rProfit / 100)) + (rCost * (rGST / 100));
            }
        }
        return price;

    }

    public class WatchPriceTester {
        public static void main(String args[]) {
            WatchPriceQuestion wcOne = new WatchPriceQuestion();

            // for watch type = Titan, gender = "female", age = 25
            System.out.println(wcOne.getWatchPrice("Titan", 25, "female"));

            // for watch type = Rolex, gender = "male", age = 61
            System.out.println(wcOne.getWatchPrice("Rolex", 61, "male"));

            // for watch type = Rolex, gender = "female", age = 61
            System.out.println(wcOne.getWatchPrice("Rolex", 61, "female"));

            // for watch type = Rolex, gender = "female", age = 61
            System.out.println(wcOne.getWatchPrice("Titan", 25, "male"));
        }
    }



}
