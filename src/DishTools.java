public class DishTools {
static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;
    public static void shoutDishName(Dish d1){
        System.out.println(d1.getName().toUpperCase());
    }
    public static void analyzeDishCost(Dish d1){
        if(d1.getCost() > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        }else{
            System.out.println("less expensive than average");
        }
    }
    public static boolean flipRecommendation(Dish d1){
        return !d1.getRecommend();
    }
}
