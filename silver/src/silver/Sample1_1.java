package silver;

public class Sample1_1 {
	private int num;

	public Sample1_1(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Sample1_1 sample1_1 = (Sample1_1) obj;
		return num == sample1_1.num;
	}

}
