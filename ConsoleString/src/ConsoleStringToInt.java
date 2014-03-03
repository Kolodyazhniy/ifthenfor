import java.io.*;

/* пример # 8 : преобразование массива строк в массив
целых чисел : ConsoleStringToInt.java */

public class ConsoleStringToInt {
	public static void main(String[] args) {
		//буферизаци€ входного потока
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		//объ€вление массива строк
		String masStr[] = new String[3];
		//объ€вление массива целых чисел
		int masInt[] = new int[3];
		try {
		System.out.println("введите три целых числа,");
		System.out.println("после каждого нажма€ Enter ->");
		for (int i = 0; i < 3; i++) {
		//чтение строки, содержащей целое число
		masStr[i] = br.readLine();
		//преобразование строки в целое число
		masInt[i] = Integer.valueOf(masStr[i]).intValue();
		}
		System.out.print("массив: ");
		for (int i = 0; i < 3; i++) {
		System.out.print(masInt[i] + "; ");
		}
		// обработка ошибки чтени€ с консоли
		} catch (IOException e) {
		System.out.print("ошибка ввода " + e);
		/* обработка ошибки при неправильном формате целого
		числа */
		} catch (NumberFormatException e) {
		System.out.print(
		"неправильный формат числа " + e);
		}
		}
}
