public class Dish {
    public static int costInCents;
    public static String nameOfDish;
    public static boolean wouldRecommend;

    public static void printSummary(){
        System.out.printf("Cost: %d\n",costInCents);
        System.out.printf("Name: %s\n", nameOfDish);
        System.out.printf("Recommended: %b\n", wouldRecommend);

    }
}
