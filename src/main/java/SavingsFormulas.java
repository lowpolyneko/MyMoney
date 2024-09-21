public class SavingsFormulas {
    public static double futureValueLumpSum(double cash, double interest, int years) {
        return cash*Math.pow(1+interest, years);
    }

    public static double futureValueLS_VariableInterest(double cash, double values[]) {
        return futureValueLS_VariableInterest(cash, values, 0);
    }

    private static double futureValueLS_VariableInterest(double cash, double values[], int index) {
        if (index >= values.length)
            return cash;

        return futureValueLS_VariableInterest(cash*(1 + values[index]), values, index + 1);
    }

    public static double compoundSavingsConstant(double cash, double interest, int years) {
        return cash*(Math.pow(1+interest, years) - 1)/interest;
    }

    public static double compoundSavingsVariable(double values[], double interest) {
        return compoundSavingsVariable(values, interest, values[0], 1);
    }

    private static double compoundSavingsVariable(double values[], double interest, double year, int index) {
        if (index >= values.length)
            return year;

        return compoundSavingsVariable(values, interest, year*(1+interest) + values[index], index + 1);
    }
}
