package ch12.lecture.p06annotation;

public class C07Annotation {

}

class MyClass07 {
	@MyAnnotation07(value = "hello")
	String field1;
	@MyAnnotation07("greeting")
	String field2;
	@MyAnnotation07("hi")
	String field3;
}

@interface MyAnnotation07 {
	String value();
}


