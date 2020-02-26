package com.Generics;

class Test<T> {
	private T obj;
	public T get()
	{
		return obj;
	}
	public void set(T ob)
	{
		this.obj=ob;
	}
}
class Consumer
{
	public static void main(String[] args) {
		Test<Integer> t= new Test<>();
		t.set(5);
		int i = (int)t.get();
		System.out.println(i);
	}
}
