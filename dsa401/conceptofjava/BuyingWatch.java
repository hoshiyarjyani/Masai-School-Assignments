// Buying Watches 
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

class WatchPriceCalculator {
    double getWatchPrice(String watchType, int age, String gender) {
        int discount = 0;
        if (age >= 60) {
            discount += 3;
        }
        if (gender == "female") {
            discount += 2;
        }

        if (watchType == "Rolex") {
            double amt = 10999 * 1.26;
            double fp = ((double) (100 - discount) / 100) * amt;
            return Math.round(fp * 100.0) / 100.0;
        } else {
            double amt = 7999 * 1.2;
            double fp = ((double) (100 - discount) / 100) * amt;
            return Math.round(fp * 100.0) / 100.0;
        }
    }
}
// ============================When return wants in String Format=============================

class WatchPriceCalculator {
    String getWatchPrice(String watchType, int age, String gender) {
        int discount = 0;
        if (age >= 60) {
            discount += 3;
        }
        if (gender == "female") {
            discount += 2;
        }

        if (watchType == "Rolex") {
            double amt = 10999 * 1.26;
            double fp = ((double) (100 - discount) / 100) * amt;
            return "The total bill amount is " + String.format("%.2f", fp);
        } else {
            double amt = 7999 * 1.2;
            double fp = ((double) (100 - discount) / 100) * amt;
            return "The total bill amount is " + String.format("%.2f", fp);
        }
    }
}
