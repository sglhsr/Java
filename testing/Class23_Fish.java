

public class Class23_Fish implements Interface23_Prey,Interface23_Predator{
//�P�ɮM�J���interface�˪O
	@Override
	public void flee() {
		System.out.println("This fish is hunting smaller fish");
	}

	@Override
	public void hunt() {
		System.out.println("This fish is fleeing from a larger fish");
		
	}

}
