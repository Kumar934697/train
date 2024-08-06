class RupeeRunner1 {
    public static void main(String[] args) {
        Rupee rupee = new Rupee();
        System.out.println("Starting Rupee in RupeeRunner");

        String size = rupee.coinSize;
        String shape = rupee.coinShape;
        String weight = rupee.coinWeight;

        System.out.println("Coin Size: " + size);
        System.out.println("Coin Shape: " + shape);
        System.out.println("Coin Weight: " + weight);

        System.out.println("Ending Rupee in RupeeRunner");
    }
}