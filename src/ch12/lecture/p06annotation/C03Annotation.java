package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	
}

//@MyAnnotation03
class MyClass03 {

	@MyAnnotation03
	String field;
	
//	@MyAnnotation03
	MyClass03() {
		
	}
	
//	@MyAnnotation03
	void method1() {
		
	}
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}


