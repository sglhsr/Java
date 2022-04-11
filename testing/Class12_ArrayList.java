import java.util.ArrayList;

public class Class12_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList = a resizeable array.
		//            Elements can be added and removed after compilation phase
		//            store reference data types
		ArrayList<String> food=new ArrayList<String>();
		food.add("1");
		food.add("2");
		food.add("3");
		food.add("4");
		food.set(1, "8");
		food.remove(3);
		for (int i=0;i<food.size();i++) {
			System.out.print(food.get(i));
		}
		
		//2D ArrayList
		ArrayList<ArrayList<String>> groceryList=new ArrayList();
		ArrayList<String> bakeryList=new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		ArrayList<String> produceList=new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		ArrayList<String> drinkList=new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("coffee");
		drinkList.add("tee");
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		System.out.println("\n"+groceryList);
		System.out.println("\n"+groceryList.get(1));
		System.out.println("\n"+groceryList.get(1).get(1));
	}

}
