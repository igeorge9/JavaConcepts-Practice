package day1.basicprograms;

import day3.corejavaprograms.ProtectedExample;

public class AccessModifiers extends ProtectedExample {

	public static void main(String[] args) {
		
		ProtectedExample example= new ProtectedExample();
		System.out.println(example.value);
		example.publicMethod();
//		example.defaultMethod();
//		System.out.println(example.value3);
//		System.out.println(example.value1); //private method
//		example.privateMethod();
		AccessModifiers example1= new AccessModifiers();
		example1.protectedMethod();
		System.out.println(example1.value4);
	}

}
