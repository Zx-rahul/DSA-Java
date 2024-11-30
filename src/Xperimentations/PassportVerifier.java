package Xperimentations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PassportVerifier {

    //Given Nationality codes
    private static final Set<String> validNationalityCodes = new HashSet<>();
    static {
        validNationalityCodes.add("USA");
        validNationalityCodes.add("IND");
        validNationalityCodes.add("GBR");
        validNationalityCodes.add("CAN");

    }

    public static boolean hasSpecialCharacter(String passport) {
        for (char c : passport.toCharArray()) {
            int ascii = (int) c;
            // Check if the character is a special character
            if ((ascii >= 33 && ascii <= 47) || (ascii >= 58 && ascii <= 64) ||
                    (ascii >= 91 && ascii <= 96) || (ascii >= 123 && ascii <= 126)) {
                return true; //Found a special character
            }
        }
        return false; //No special character found
    }

    public static boolean Verifier(String passport, LocalDate today) {

        //1--> Length Check
        if (passport.length()<10){
            return false;
        }

        //2--> Nationality Check
        String nationalityCode = passport.substring(0,3).toUpperCase();
        //checking that the passport contains valid Nationality Code eg--> IND
        if (!validNationalityCodes.contains(nationalityCode)){
            return false;
        }

        //3--> Passport Number Check
        if (passport.length()<12){
            return false;
        }
        String passportNumber= passport.substring(3,12);
        //checking that the nine-digit code JUST CONTAINS numbers exactly 0 to 9
        boolean isValidPassportNumber = passportNumber.chars().allMatch(Character::isDigit);
        if (!isValidPassportNumber){
            return false;
        }

        //4--> Expiry Date Check
        String expirationDateStr = passport.substring(12, 22);

        // Creates a DateTimeFormatter with the pattern "yyyy-MM-dd" to match the expected expiration date format.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //to store the parsed expiration date.
        LocalDate expiryDate;
        //exception handling for initialization inside it will be assigned
        try {

            expiryDate = LocalDate.parse(expirationDateStr, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }

        //checking is the expiry date has crossed today's date
        if (expiryDate.isBefore(today)) {
            return false;
        }

        //5--> Special Character Check with ASCII code
        if (!hasSpecialCharacter(passport)) {
            return false;
        }

        // 6--> No Spaces Allowed
        if (passport.contains(" ")) {
            return false;
        }

        // 7--> Issuing Authority Check
        if (!(passport.contains("GOV") || passport.contains("EMB") || passport.contains("CONS"))) {
            return false;
        }

        // If all checks crossed
        return true;
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();//today's date
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your passport String: ");
        String passport= sc.nextLine().trim();//removed extra space
        if (Verifier(passport,today)){
            System.out.println("Valid Passport");
        }else {
            System.out.println("Invalid Passport");
        }
    }
}
