import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class AgeCalculator {
    public int calculateAge(String dob) throws InvalidDateFormatException {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Parse the date string using the formatter
            LocalDate dateOfBirth = LocalDate.parse(dob, dateFormatter);

            // Check if the date of birth is in the future
            LocalDate currentDate = LocalDate.now();
            if (dateOfBirth.isAfter(currentDate)) {
                throw new InvalidDateFormatException("Date should not be in future");
            }

            // Calculate the age based on the current date and date of birth
            Period age = Period.between(dateOfBirth, currentDate);
            return age.getYears();
        } catch (java.time.format.DateTimeParseException e) {
            // Parsing failed, indicating an invalid date format
            throw new InvalidDateFormatException("Invalid date format provided");
        }
    }

}

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}


Sample Input
4
2000-10-06
2000/10/06
2000-04-01
2500-05-01

Sample Output
Age is 22
Invalid date format provided
Age is 23
Date should not be in future

Question Link - https://oj.masaischool.com/contest/9242/problem/3 
