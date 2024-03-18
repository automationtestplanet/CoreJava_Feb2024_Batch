package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ClassAnnotation(val1 = 100, val2 = 200)
public class UseAnnotation {
	
	@FieldAnnotation(field1 = true)
	public boolean flag;
	
	@MethodAnnnotation(param1 = "Hello", param2 = "Java")
	public void addition(String str1, String str2) {
		System.out.println(str1+" "+str2);
	}

	public static void main(String[] args) throws Exception {
		UseAnnotation useAnnotation = new UseAnnotation();
		
		System.out.println("-------------------------Class Annotation----------------------------------");		
		ClassAnnotation clsAnnotation = UseAnnotation.class.getAnnotation(ClassAnnotation.class);		
		System.out.println(clsAnnotation.val1());
		System.out.println(clsAnnotation.val2()); 
		
		System.out.println("-------------------------Method Annotation----------------------------------");			
		Method additionMethod = UseAnnotation.class.getDeclaredMethod("addition", String.class,String.class);		
		MethodAnnnotation methodAnnotation = additionMethod.getAnnotation(MethodAnnnotation.class);
		useAnnotation.addition(methodAnnotation.param1(),methodAnnotation.param2());
		
		System.out.println("-------------------------Field Annotation----------------------------------");
		Field flagField = UseAnnotation.class.getField("flag");
		FieldAnnotation fieldAnnotation = flagField.getAnnotation(FieldAnnotation.class);
		useAnnotation.flag  = fieldAnnotation.field1();
		System.out.println(useAnnotation.flag);

	}

}
