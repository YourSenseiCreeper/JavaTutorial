package pl.gastherr.cw4_klasy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class ClassTester {

	private boolean strict;
	private String className;
	private MethodTemplate[] methods; 
	private FieldTemplate[] fields;
	private FieldTemplate[][] constructors;
	
	public ClassTester(String className, FieldTemplate[] fields, MethodTemplate[] methods,
			FieldTemplate[][] constructors, boolean strict) {
		this.className = className;
		this.methods = methods;
		this.fields = fields;
		this.constructors = constructors;
		this.strict = strict;
	}
	
	public TestResult test(Object input) {
		Class<?> classObject = input.getClass();
		TestResult result = new TestResult();
		String packagePath = this.getClass().getPackage().getName();
		String answerClassName = classObject.getName().replace(packagePath, "").replace(".", "");
		if (className != null && !answerClassName.equals(className)) {
			result.setClassNameCorrect(false);
		}
		
		// METHODS
		if (methods != null) {
			ArrayList<MethodTemplate> actualMethods = new ArrayList<>();
			String typeReplacement;
			for(Method element : classObject.getMethods()) {
				typeReplacement = element.getReturnType().getTypeName().replace("java.lang.", "");
				actualMethods.add(new MethodTemplate(element.getName(), typeReplacement, element.getParameters()));
			}
			// Amount of methods differs if strict
			if (strict && methods.length != actualMethods.size()) {
				result.setMethodsCorrect(false);
			} else {
				// Actual method check
				for(MethodTemplate template : methods) {
					boolean methodExist = actualMethods.stream().anyMatch(x ->
						x.getName().equals(template.getName()) && 
						x.getReturnType().equals(template.getReturnType()) &&
						(template.getParameters() == null || x.getParameters().equals(template.getParameters()))
					);
					if (!methodExist) {
						System.out.println("Brakuje: "+template.getName()+" ["+template.getReturnType()+"]");
						result.setMethodsCorrect(false);
						result.setMethodsReturnTypesCorrect(false);
						break;
					}
				}
			}
		}
		
		// FIELDS
		if (fields != null) {
			ArrayList<FieldTemplate> actualFields = new ArrayList<>();
			for(Field element : classObject.getDeclaredFields()) {
				// genericType is not sure
				actualFields.add(new FieldTemplate(element.getName(), element.getGenericType().toString()));
			}
			// Amount of methods differs if strict
			if (strict && fields.length != actualFields.size()) {
				result.setFieldsCorrect(false);
			} else {
				// Actual field check
				for(FieldTemplate template : fields) {
					boolean fieldExist = actualFields.stream().anyMatch(x ->
						x.getName().equals(template.getName()) && 
						x.getType().equals(template.getType())
					);
					if (!fieldExist) {
						result.setFieldsCorrect(false);
						result.setFieldsTypesCorrect(false);
						break;
					}
				}
			}
		}
		
		// CONSTRUCTORS
		if (constructors != null) {
			ArrayList<ArrayList<FieldTemplate>> actualConstructors = new ArrayList<>();
			ArrayList<FieldTemplate> oneConstructorFields;
			
			for(Constructor<?> element : classObject.getConstructors()) {
				oneConstructorFields = new ArrayList<>();
				// iterate through constructors' parameters
				for(int i = 0; i<element.getParameterCount(); i++) {
					oneConstructorFields.add(new FieldTemplate(
							element.getParameters()[i].getName(), 
							element.getParameterTypes()[i].getTypeName()
					));
				}
				actualConstructors.add(oneConstructorFields);
			}
			// Amount of constructors differs if strict
			if (strict && constructors.length != actualConstructors.size()) {
				result.setConstructorsCorrect(false);
			} else {
				// Actual constructors field check
				for(int i = 0; i < constructors.length; i++) {
					for(int j = 0; j < constructors[i].length; j++) {
						FieldTemplate field = constructors[i][j];
						boolean fieldExist = actualConstructors.get(i).stream().anyMatch(x ->
							x.getName().equals(field.getName()) && 
							x.getType().equals(field.getType())
						);
						if (!fieldExist) {
							result.setConstructorsCorrect(false);
							break;
						}
					}
				}
			}
		}
		
		return result;
	}
}

class MethodTemplate{
	private String name;
	private String returnType;
	private Parameter[] parameters;
	
	public MethodTemplate(String name, String returnType, Parameter[] parameters) {
		this.name = name;
		this.returnType = returnType;
		this.parameters = parameters;
	}
	
	public String getName() { return name; }
	public String getReturnType() { return returnType; }
	public Parameter[] getParameters() { return parameters; }
}

class FieldTemplate {
	private String name;
	private String type;
	
	public FieldTemplate(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() { return name; }
	public String getType() { return type; }
}

class TestResult {
	private boolean classNameCorrect;
	private boolean fieldsCorrect;
	private boolean fieldsTypesCorrect;
	private boolean methodsCorrect;
	private boolean methodsReturnTypesCorrect;
	private boolean methodsArgumentsCorrect;
	private boolean constructorsCorrect;
	
	public TestResult() {
		classNameCorrect = true;
		fieldsCorrect = true;
		fieldsTypesCorrect = true;
		methodsCorrect = true;
		methodsReturnTypesCorrect = true;
		methodsArgumentsCorrect = true;
		constructorsCorrect = true;
	}
	
	public boolean isClassNameCorrect() { return classNameCorrect; }
	public void setClassNameCorrect(boolean value) { classNameCorrect = value; }
	
	public boolean isFieldsCorrect() { return fieldsCorrect; }
	public void setFieldsCorrect(boolean fieldsCorrect) { this.fieldsCorrect = fieldsCorrect; }
	
	public boolean isFieldsTypesCorrect() { return fieldsTypesCorrect; }
	public void setFieldsTypesCorrect(boolean fieldsTypesCorrect) { this.fieldsTypesCorrect = fieldsTypesCorrect; }
	
	public boolean isMethodsCorrect() { return methodsCorrect; }
	public void setMethodsCorrect(boolean methodsCorrect) { this.methodsCorrect = methodsCorrect; }
	
	public boolean isMethodsReturnTypesCorrect() { return methodsReturnTypesCorrect; }
	public void setMethodsReturnTypesCorrect(boolean methodsReturnTypesCorrect) { this.methodsReturnTypesCorrect = methodsReturnTypesCorrect; }
	
	public boolean isMethodsArgumentsCorrect() { return methodsArgumentsCorrect; }
	public void setMethodsArgumentsCorrect(boolean methodsArgumentsCorrect) { this.methodsArgumentsCorrect = methodsArgumentsCorrect; }
	
	public boolean isConstructorsCorrect() { return constructorsCorrect; }
	public void setConstructorsCorrect(boolean constructorsCorrect) { this.constructorsCorrect = constructorsCorrect; }
}
