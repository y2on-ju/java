package ch12.lecture.p06annotation;

public class C05Annotation {

}

class MyClass05 {
	@MyAnnotation05(attr = "hello")
	String field1;
	
	@MyAnnotation05(attr = "greeting")
	int field2;
}

@interface MyAnnotation05 {
	// 속성 (attribute, element)
	String attr();
}



