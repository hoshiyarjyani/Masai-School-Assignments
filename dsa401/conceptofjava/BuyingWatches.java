// Buying Watches Ended
// Description

// Mr. Ghanshyam & Ms. Richa have decided to purchase watches from ABC corporations such that ABC corporations is used to have different pricing components customer wise.
// The mandatory components are- cost price, profit percentage & GST
// For women citizen they are offering discount of 2% on total bill amount and
// For senior citizen (of 60 years or more) they are offering discount of 3%
// The ABC Corporation has two types of watched with pricing structure as follow Watch Type:
// Titan 
// cost price = 7999 
// profit percentage = 12.5 
// GST = 7.5 
// Watch Type: Rolex 
// cost price = 10999 
// profit percentage = 13.5 
// GST = 12.5
// For example, consider the following examples
// Sample input-1 
// Enter age 25
// Enter gender female 
// Enter watch type (Titan/Rolex): Titan 
// Output 
// The total bill amount is 9406.82 
// Sample input-2 
// Enter age 65 
// Enter gender male 
// Enter watch type (Titan/Rolex): Rolex 
// Output 
// The total bill amount is 13442.98 
// Sample input-3 
// Enter age 61 
// Enter gender female 
// Enter watch type (Titan/Rolex): Rolex 
// Output 
// The total bill amount is 13165.80 
// Sample input-4 
// Enter age 25 
// Enter gender male 
// Enter watch type (Titan/Rolex): Titan 
// Output 
// The total bill amount is 9598.80 

// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement above

// Input
// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement above

// Output
// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement above

// Sample Input 1 

// NA
// Sample Output 1

// NA

public class BuyingWatches {

    double getWatchPrice(String watchType, int age, String gender) {
        double costPrice = 0;
        double profitPercentage = 0;
        double gst = 0;
        if (watchType.equals("Titan")) {
            costPrice = 7999;
            profitPercentage = 12.5;
            gst = 7.5;
        } else if (watchType.equals("Rolex")) {
            costPrice = 10999;
            profitPercentage = 13.5;
            gst = 12.5;
        }

        double profit = costPrice * (profitPercentage / 100);
        double totalCost = costPrice + profit;
        double gstCost = totalCost * (gst / 100);
        double billAmount = totalCost + gstCost;

        if (gender.equals("female")) {
            billAmount = billAmount - (billAmount * 0.02);
        }

        if (age >= 60) {
            billAmount = billAmount - (billAmount * 0.03);
        }
        return (double) Math.round(billAmount * 100d) / 100d;
    }
}
