public class DishTest {
    public static void main(String[] args){
        Dish dish1 = new Dish(25,"Lucy",true);
//        dish1.setCost(25);
//        dish1.setName("Lucy");
//        dish1.setWouldRecommend(true);
        dish1.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        System.out.println(DishTools.flipRecommendation(dish1));


    }
}
