package dynamicProxy;

public class Test {
	public static void main(String[] args) {
		
		PersonImp zhangsan = new PersonImp();
		
		Proxy proxy = new Proxy(zhangsan);
		
		Person lisi = (Person) proxy.getProxy();
		
		lisi.eat();
		
		lisi.say();
		
	}
}
