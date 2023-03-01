package house;

public class LivingRoom {
    public static void main(String[] args) {
        // squareMeters
        int squareMeters;
        // pricePerSquareMeter
        double pricePerSquareMeter;
        // address
        String address;

        squareMeters = 500;
        pricePerSquareMeter = 10.5;
        address = "Hill Street 17";

        //Print out the cost of the house (squareMeters * pricePerSquareMeter) at (address).
        System.out.println("The price of the house at " + address + " is: " + squareMeters * pricePerSquareMeter);

        double squareMetersDouble = 13.2;
        squareMetersDouble = squareMeters;
        pricePerSquareMeter = 9.8;
        address = "Hill Street 17";

        double price = squareMetersDouble * pricePerSquareMeter;

        //Print out the cost of the house (squareMeters * pricePerSquareMeter) at (address).
        System.out.println("The price of the house at " + address + " is: " + squareMeters * pricePerSquareMeter);
    }
}
