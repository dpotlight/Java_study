
public class Operator 
{

	public static void main(String[] args) {
		
		//연산의 결과가 어떤 타입인지 파악하기 위해
		//int double String char간의 연산관계
		// + - * / %
		
		//int&int
		System.out.println(1 + 1);
	    System.out.println(3 - 1);
	    System.out.println(4 * 6);
	    System.out.println(25 / 5);
	    System.out.println(27 % 6);
	    
	    
	    //int&double
	    System.out.println(3 + 1.0);
	    System.out.println(8 - 2.3);
	    System.out.println(9 * 3.5);
	    System.out.println(18 / 5.0);
	    System.out.println(34 % 3.9);
	    
	    
	    //int&char
	    System.out.println(3 + 'a');
	    System.out.println(143 - 'a');
	    System.out.println(5 * 'a');
	    System.out.println(393 / 'a');
	    System.out.println(104 % 'a');
	    
	    
	    //int&String
	    System.out.println(3 + "hello");
	    //System.out.println(140 - "hello"); : 컴파일오류    
	    //System.out.println(2 * "hello");   : 컴파일오류    
	    //System.out.println(444 / "hello"); : 컴파일오류    
	    //System.out.println(534 % "hello"); : 컴파일오류  
	    
		
	    //double&double
	    System.out.println(3.0 + 4.2);
	    System.out.println(7.5 - 3.2);
	    System.out.println(4.532 * 3.23);
	    System.out.println(9.0 / 3.0);
	    System.out.println(124.0 % 5.0);
	    
	    
	    //double&char
	    System.out.println(1.5 + 'a');
	    System.out.println(232.5 - 'v');
	    System.out.println(12.7 * 'c');
	    System.out.println(333.3 / 'p');
	    System.out.println(7868.0 % 'd');
	    
	    
	    //double&String
	    System.out.println(2.0 + "samsung");
	    //System.out.println(3.5 - "apple");   : 컴파일오류
	    //System.out.println(5.3 * "debate");  : 컴파일오류    
	    //System.out.println(5.2 / "charger"); : 컴파일오류 
	    //System.out.println(9.2 % "desktop"); : 컴파일오류    
	    
	    
	    //char&char
	    System.out.println('a' + 'd');
	    System.out.println('b' - 'u');
	    System.out.println('i' * 'p');
	    System.out.println('q' / 'a');
	    System.out.println('z' % 'a');
	    
	    
	    //char&String
	    System.out.println('a' + "pple");
	    //System.out.println("baseball" - 'l');  : 컴파일오류       
	    //System.out.println('o' * "foods");     : 컴파일오류
	    //System.out.println('p' / "phone");     : 컴파일오류   
	    //System.out.println('x' % "redjunpyo"); : 컴파일오류
	    
	    
	    //String&String
	    System.out.println("todayis" + "Monday");
	    //System.out.println("Idonthavemoneyyyy" - "yyy"); :컴파일오류      
	    //System.out.println("triple" * "homerun");        :컴파일오류      
	    //System.out.println("sharing" - "data");          :컴파일오류        
	    //System.out.println("move" % "away");             :컴파일오류        
	}
}
