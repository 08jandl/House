public class IfElse {
    public static void main(String[] args) {
        // On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSenior = false;
        boolean isDog = false;
        boolean isStudent = false;

//        checkIfDiscount(isSenior, isStudent, isDog);
//        checkIfDiscount(true, false, true);
//        checkIfDiscount(false, false, true);
//        checkIfDiscount(false, true, true);
//        checkIfDiscount(false, false, false);


        // In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.

        int fiction = 13;
        int nonFiction = -1;

        String result = checkIfBookDiscount(fiction, nonFiction);
        System.out.println("Gets " + result);

        System.out.println(checkIfBookDiscount(5, 12));
    }

    public static void checkIfDiscount(boolean isSenior, boolean isStudent, boolean isDog) {
        if (isSenior) {
            System.out.println("Discount!");
        } else if (isDog) {
            System.out.println("Discount!");
        } else if (isStudent) {
            System.out.println("Discount!");
        } else {
            System.out.println("No discount");
        }
    }

    public static String checkIfBookDiscount(int fiction, int nonFiction) {
        String discount = "Discount!";
        String noDiscount = "no discount";

        if (fiction > 0 && nonFiction >= 3) {
            return discount;
        } else {
            return noDiscount;
        }
    }


}
