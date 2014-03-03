/* пример # 2 : преобразование типов данных :
Types.java */


public class Types {
	public static void main(String[] args) {
		Float f1 = new Float(10.01); //double в Float
		String s1 = Float.toString(0f); //float в String
		String s2 = String.valueOf(f1); //Float в String
		Byte b = Byte.valueOf("120"); //String в Byte
		double d = b.doubleValue(); //Byte в double
		short s = (short) d; //double в short
		/* Character в int */
		Character ch = new Character('3');
		int i = Character.digit(ch.charValue(), 10);
		System.out.println("s1=" + s1 + ", s2=" + s2);
		System.out.print("b=" + b + ", s=" + s
		+ ", d=" + d + ", i=" + i);
		}
	
	

}
