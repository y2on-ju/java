package ch12.lecture.p06annotation;

public class C06Annotation {

}

class MyClass06 {
	@MyAnnotation06
	String field1;
	
	@MyAnnotation06(myAttr = 10)
	int field2;
	
	@MyAnnotation06(myAttr = 20)
	boolean field3;
}

@interface MyAnnotation06 {
	int myAttr() default 0;
}
