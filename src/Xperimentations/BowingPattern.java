package Xperimentations;

public class BowingPattern {

        public static Result balanceBowingPattern(String bowingPattern) {
            int countD = 0;
            int countU = 0;

            // Counting frequency of 'D' and 'U'
            for (char ch : bowingPattern.toCharArray()) {
                if (ch == 'D') countD++;
                else if (ch == 'U') countU++;
            }

            // Checking if it is already balanced
            if (Math.abs(countD - countU) <= 1) {
                return new Result(true, bowingPattern);
            }

            char[] modifiedPattern = bowingPattern.toCharArray();
            int excess;

            // Balancing Down-Bows
            if (countD > countU) {
                excess = countD - countU - 1; // Calculating excess down-bows(D)
                int replacements = excess / 2;
                for (int i = 0; i < modifiedPattern.length && replacements > 0; i += 2) {
                    if (modifiedPattern[i] == 'D') {
                        modifiedPattern[i] = 'U';
                        replacements--;
                    }
                }
            }

            // Balancing Up-Bows
            else {
                excess = countU - countD - 1; // Calculating excess up-bows(U)
                int replacements = excess / 2;
                for (int i = 1; i < modifiedPattern.length && replacements > 0; i += 2) {
                    if (modifiedPattern[i] == 'U') {
                        modifiedPattern[i] = 'D';
                        replacements--;
                    }
                }
            }

            countD = 0;
            countU = 0;
            for (char ch : modifiedPattern) {
                if (ch == 'D') countD++;
                else if (ch == 'U') countU++;
            }

            // Checking if the string is balanced after modifying
            if (Math.abs(countD - countU) <= 1) {
                return new Result(true, new String(modifiedPattern));
            } else {
                return new Result(false, bowingPattern);
            }
        }

        // Result class for holding the output
        static class Result {
            boolean isBalanced;
            String modifiedPattern;

            Result(boolean isBalanced, String modifiedPattern) {
                this.isBalanced = isBalanced;
                this.modifiedPattern = modifiedPattern;
            }
        }


    public static void main(String[] args) {
        //Given inputs
        Result result1 = balanceBowingPattern("DUDUUUUUDUUU");
        Result result2 = balanceBowingPattern("DUDUUDUD");

        System.out.println("(" + result1.isBalanced  + "," + result1.modifiedPattern + ")");
        System.out.println("(" + result2.isBalanced  + "," + result2.modifiedPattern + ")");
    }


}