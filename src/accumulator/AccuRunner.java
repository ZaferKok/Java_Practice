package accumulator;

public class AccuRunner {

	public static void main(String[] args) {
		AccumulatorMachine accu1 = new AccumulatorMachine(22);
		System.out.println(accu1.getSum());
		System.out.println(accu1.add(11));
		System.out.println(accu1.remove(1));
		System.out.println(accu1.toString());
		
		
	}
	
}
