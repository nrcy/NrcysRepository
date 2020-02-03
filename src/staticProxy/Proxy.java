package staticProxy;

import dynamicProxy.Person;
import dynamicProxy.PersonImp;

public class Proxy implements Person{
	
	PersonImp zhangsan;

	public Proxy(PersonImp zhangsan) {
		super();
		this.zhangsan = zhangsan;
	}
	
	@Override
	public void say() {
		zhangsan.say();
		System.out.println("话");
	}

	@Override
	public void eat() {
		zhangsan.eat();
		System.out.println("饭");
	}

}
