package dynamicProxy;

public class PersonImp implements Person {

	@Override
	public void say() {
		System.out.println("说话");
	}

	@Override
	public void eat() {
		System.out.println("吃饭");
	}

}
