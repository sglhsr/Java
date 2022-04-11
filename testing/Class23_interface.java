

public class Class23_interface {
//interface - class可套用的樣板 用implements導入 
	public static void main(String[] args) {
		//interface- a template that can be applied to a class
		//           similar to inheritance, but specifies what a class has/must do.
		//           classes can apply more than one interface, inheritance is limiited to a super
		Class23_Rabbit rabbit=new Class23_Rabbit();
		rabbit.flee();
		Class23_Hawt hawt=new Class23_Hawt();
		hawt.hunt();
		Class23_Fish fish = new Class23_Fish();
		fish.hunt();
		fish.flee();
	}

}
