package accumulator;

public class AccumulatorMachine {

	int sum;

	public AccumulatorMachine(int sum){
            this.sum=sum;

        }

	public int getSum() {
		return sum;
	}

	public int add(int increase) {
		return sum = sum + increase;

	}

	public int remove(int decrease) {
		return sum = sum - decrease;
	}

	//@Override
	public String toString() {
		return "Sum is: " + sum;
	}
}
