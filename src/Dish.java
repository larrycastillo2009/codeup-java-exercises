public class Dish {
    private static int costInCents;
    private static String nameOfDish;
    private static boolean wouldRecommend;

    public static void printSummary(){
        System.out.printf("Cost: %d\n",costInCents);
        System.out.printf("Name: %s\n", nameOfDish);
        System.out.printf("Recommended: %b\n", wouldRecommend);

    }

    public int getCost(){
        return costInCents;
    }

    public String getName(){
        return nameOfDish;
    }

    public boolean getRecommend(){

        return wouldRecommend;
    }
    public void setCost(int cost){
        Dish.costInCents = cost;
    }
    public void setName(String name){
        Dish.nameOfDish = name;
    }

    public static void setWouldRecommend(boolean wouldRecommend) {
        Dish.wouldRecommend = wouldRecommend;
    }

    public Dish(int cost, String name, boolean wouldRecommend) {
        Dish.costInCents = cost;
        Dish.nameOfDish =  name;
        Dish.wouldRecommend = wouldRecommend;
    }
}
