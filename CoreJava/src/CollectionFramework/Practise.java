package CollectionFramework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practise {

	public static void main(String[] args) {

	H h = new H();
	h.m1();
	h.m2();
	}

}

interface f
{
	default void m1()
	{
		System.out.println("from interfaces F");
	}
	void m2();
}

class H implements f
{
	public void m2()
	{
		System.out.println("from interface m2");
	}

}
