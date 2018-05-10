package basic;

public interface MyData {
	
	default void print(String str){
		if(!isNull(str))
			System.out.println("My data print::" +str);
	}

	static boolean isNull(String str){
		System.out.println("Interface Null Check");
		return str==null? true : "".equals(str)?true:false;
	}

}


