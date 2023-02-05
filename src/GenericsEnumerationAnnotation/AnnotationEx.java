package GenericsEnumerationAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings(value = "111")
@Deprecated
@TestInfo(testedBy="aaaaa",testDate=@DateTime(yymmdd="160101",hhmmss="235959"),testTools= {"java","html","js"})
public class AnnotationEx {

	public static void main(String[] args) {
		Class<AnnotationEx> cls=AnnotationEx.class;
		TestInfo anno=cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy: "+ anno.testedBy());
		System.out.println("anno.testDate().yymmdd(): "+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss(): "+anno.testDate().hhmmss());
		
		
		for(String aa:anno.testTools()) {
			System.out.println("anno.testTools: "+aa);
		}
	
		Annotation [] arrAno=cls.getAnnotations();
		for(Annotation aa: arrAno) {
			System.out.println(aa);
		}
	
	}

}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
	int count() default 1;
	String testedBy() default "aa";
	String[] testTools() default "JUnit";
	TestType[] testType() default {TestType.FIRST, TestType.FINAL};
	DateTime testDate();
}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
	String yymmdd();
	String hhmmss();
}
enum TestType{
	FINAL, FIRST
}