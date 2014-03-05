package claassIntuit;

public class Test {
	// пример вызовет ошибку компил€ции
	
	   int get() {
	      return 5;
	   }
	   Point get() {
	      return new Point(3,5);
	   }

	   void print(int x) {
	      System.out.println("it's int! "+x);
	   }
	   void print(Point p) {
	      System.out.println("it's Point! "+p.x+
	                         ", "+p.y);
	   }

	   public static void main (String s[]) {
	      Test t = new Test();
	      t.print(t.get());   
	   }
	}
	
	
	

}
