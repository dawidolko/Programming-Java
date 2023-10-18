// Zad. 3 Wykonaj poniższe polecenia:
// 		1. Uruchomić i zapoznać się z kodem plików znajdujących się w rozpakowanym pliku.
// 		   Dołącz wszytki do nowego projektu.
//		2. W programie głównym utworzyć reprezentację każdej klasy, która jest w projekcie i zaproponuj uruchomienie
//	       przykładowych trzech funkcji.
//		3. Zamienić klasę Figura na klasę abstrakcyjną.
//		4. Dodaj do klasy Figura metodę abstrakcyjną String opis(), zwracającą informację o obiekcie,
//		   np.: „Obiekt klasy Prostokat”.
//		5. Zmodyfikować pozostałe klasy, tak, aby program kompilował się poprawnie.
//		6. W programie głównym utworzyć tablicę o nazwie tablicaFigur o rozmiarze 10 typu Figura.
//		   Do każdego elementu tablicy utworzyć nowy obiekt, lub przypisać istniejący.
//		7. Dla każdego obiektu tablicy wywołać metodę opis(). Z której klasy została wywołana metoda opis() i dlaczego?
//		8. W klasie Figura zdefiniować dodatkowe metody abstrakcyjne i zaimplementuj je w klasach potomnych:
// 			a) void skaluj(float skala) //skaluje wielkość figury;
//		9. Zdefiniuj interfejs o nazwie IFigury, zawierający następujące metody:
//			b) float getPowierzchnia();
//			c) boolean wPolu(Punkt p);
//		10. Zaimplementuj interfejs IFigury we wszystkich klasach Prostokat, Trojkat, Kwadrat.
//		11. W programie głównym zadeklaruj listę obiektów typu IFigury, następnie przypisz do niej różne figury:
//		    Prostokat, Kwadrat, Trojkat.
//		12. Dla każdego obiektu tablicy IFigur wywołaj metodę getPowierzchnia() i w_polu().
//
// 		Kolejno:
//		1. Utwórz klasę Okrag dziedziczącą po klasie Figura.
//		2. Zdefiniuj interfejs o nazwie RuchFigury, zawierający następującą metodę: void przesun(int x, int y).
//		3. Zaimplementuj interfejs RuchFigury w klasie Okrąg.
//		4. Sprawdź działanie interfejsu.

package Figury;

public class Main
{
	public static void main(String[] args)
	{
		Run run = new Run();
		run.Runs();
	}
}
