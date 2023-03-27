package ch12.lecture.p06annotation;

public class C08Anntation {

}

class MyClass08{
	@MyAnnotation08
	int f1;
	@MyAnnotation08(100)
	int f2;
	@MyAnnotation08(value=100)
	int f3;
	@MyAnnotation08(value=100, name = "lee")
	int f4;
}

@interface MyAnnotation08{
	int value() default 0;
	String name() default "kim";
	int age() default 0;
	
}
