package liu.proxy.cglib.case_1;

public class Hello {
	public String sayHello(boolean throwException) throws Exception {
		System.out.println("hello everyone!");
		if(throwException)
			throw new Exception("test exception");
		return "123";
	}
}

