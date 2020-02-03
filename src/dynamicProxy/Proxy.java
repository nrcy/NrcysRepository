package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {

	Object zhangsan;

	public Proxy(Object zhangsan) {
		super();
		this.zhangsan = zhangsan;
	}

	@Override
	/**
	 * 
	 * Object proxy :代理对象，如lisi 
	 * Method method :被代理的方法 
	 * Object[] args :被代理方法的形参
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = method.invoke(zhangsan, args);
		System.out.println("方法增强代码块");
		return obj;
	}

	public Object getProxy() {
		/**
		 * 
		 * ClassLoader loader : 被代理对象的类加载器
		 * Class<?>[] interfaces : 被代理对象的实现接口
		 * InvocationHandler h : 代理对象管理器
		 */
		Object lisi = java.lang.reflect.Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(),
				zhangsan.getClass().getInterfaces(), this);
		return lisi;
	}

}
