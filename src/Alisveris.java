import java.util.Scanner;

public class Alisveris {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int choose;
		do {
			System.out.println(
					"Sepete atmak istediginiz urunu seciniz:\n" +
							"1-Sandalye-- 150 TL\n" +
							"2-Masa-- 200 TL\n" +
							"3-Bilgisayar-- 3000 TL\n" +
							"4-Fare-- 10 TL\n" +
							"5-Yazici-- 400 TL\n" +
							"6-Sepet Tutarini Hesaplayin");
			choose = scanner.nextInt();

			switch (choose) {
				case 1:
					adet();
					sandalye();

					break;
				case 2:
					adet();
					masa();
					break;
				case 3:
					adet();
					bilgisayar();
					break;
				case 4:
					adet();
					fare();
					break;
				case 5:
					adet();
					yazici();
					break;
				case 6:
					sepet();
					break;

				default:
					System.out.println("Lutfen dogru deger giriniz !!!");
			}

		} while (choose != 6);

	}

	static int mas, san, far, yaz, bil;

	static void adet() {
		System.out.println("Kac tane istiyorsunuz?");
	}

	static void sandalye() {
		int tane = scanner.nextInt();
		san = tane * 150;

	}

	static void masa() {
		int tane = scanner.nextInt();
		mas = tane * 200;

	}

	static void bilgisayar() {
		int tane = scanner.nextInt();
		bil = tane * 3000;

	}

	static void fare() {
		int tane = scanner.nextInt();
		far = tane * 10;

	}

	static void yazici() {
		int tane = scanner.nextInt();
		yaz = tane * 400;

	}

	static void sepet() {

		if ((mas + san + bil + far + yaz) == 0) {
			System.out.println("Lutfen sepetinize urun  ekleyin.");

		} else {
			System.out.println("Toplam borcunuz : " + (mas + san + bil + far + yaz)
					+ "TL. Nasil odemek istersiniz?\n"
					+ "1-Nakit\n"
					+ "2-Kredi Karti\n");

			int odeme = scanner.nextInt();
			if (odeme == 1) {
				System.out.println("Tesekkurler, iyi gunler");

			} else if (odeme == 2) {
				System.out.println("Sadece kredi karti gecerlidir, iyi gunler");

			} else {
				System.out.println("Lutfen size uygun odemeyi seciniz !!");
			}
		}

	}

}
