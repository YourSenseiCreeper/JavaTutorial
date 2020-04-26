package pl.gastherr.cw4_klasy;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class KlasyTest {

	@Test
	void zadanie1() {
		
		Object answer = Klasy.zadanie1();
//		ClassTester tester = new ClassTester("Telefon", 
//				new ArrayList<FieldTemplate>(Arrays.asList(
//						new FieldTemplate("model", "String"),
//						new FieldTemplate("marka", "String"))),
//				new ArrayList<MethodTemplate>(Arrays.asList(
//						new MethodTemplate("getModel", "String", null),
//						new MethodTemplate("getMarka", "String", null))),
//				null);
		Class<?> answerRaw = answer.getClass();
		System.out.println(answerRaw.getName());
		String typeReplacement;
		for(Method element : answerRaw.getMethods()) {
			typeReplacement = element.getReturnType().getTypeName().replace("java.lang.", "");
			System.out.println(element.getName() + ", "+typeReplacement);
		}
		for(Field element : answerRaw.getDeclaredFields()) {
			typeReplacement = element.getGenericType().getTypeName().replace("java.lang.", "");
			System.out.println(element.getName() + ", "+typeReplacement);
		}
		ClassTester tester2 = new ClassTester("Telefon", 
				new FieldTemplate[] { 
						new FieldTemplate("model", "String"), 
						new FieldTemplate("marka", "String")
				}, new MethodTemplate[] { 
						new MethodTemplate("getModel", "String", null),
						new MethodTemplate("getMarka", "String", null)
				}, null, false);
		TestResult results = tester2.test(answer);
		
		assertNotEquals(null, answer);
		assertTrue(results.isClassNameCorrect(), "Nazwa klasy jest niepoprawna!");
		assertTrue(results.isFieldsCorrect(), "Brakuje jednego z pól lub nazwa jest niepoprawna");
		assertTrue(results.isFieldsTypesCorrect(), "Niepoprawne typy pól");
		assertTrue(results.isMethodsCorrect(), "Brak jednej z metod lub niepoprawna nazwa");
		assertTrue(results.isMethodsArgumentsCorrect(), "B³êdne argumenty w metodzie");
		assertTrue(results.isConstructorsCorrect(), "B³êdne parametry w konstruktorze");
	}

}
