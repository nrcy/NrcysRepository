package staticProxy;

import dynamicProxy.Person;
import dynamicProxy.PersonImp;

public class Test {
	public static void main(String[] args) {
		PersonImp zhangsan = new PersonImp();
		Person lisi = new Proxy(zhangsan);
		lisi.eat();
		lisi.say();
	}
}
