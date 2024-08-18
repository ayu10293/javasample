package silver;

public class LambdaMain implements LambdaInter{
	public static void main(String[] args) {
		int result = new LambdaSample().sample(1, 2);
		System.out.println(result);
		
		LambdaInter inter = new LambdaSample();
		int interResult = inter.Inter(1, 2);
		System.out.println(interResult);
		
	}

}
