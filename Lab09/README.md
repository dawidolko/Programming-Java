# Lab09 - Zastosowanie typów generycznych

## **Zadanie 0.**

Napisz klasę generyczną `Pojemnik` przechowującą element dowolnego typu. Utwórz metody:
pobierającą, ustawiającą oraz wyświetlającą element.

## **Zadanie 1.**

Zaimplementuj i przetestuj klasę Pair w formie generycznej. Zobacz w tym celu slajd 10 z wykładu.
Utwórz różne typy par i przetestuj.

## **Zadanie 2.**

Zaimplementuj klasy krotek `TupleTwo`, `TupleThree`, `TupleFour` odpowiednio przechowujące dwie,
trzy, cztery wartości. Krotka `TupleFour` dziedziczy po `TupleThree`, a `TupleThree` dziedziczy po
`TupleTwo`. Klasę `TupleTwo` można utworzyć na bazie klasy Pair z zadania 1, lub zaimplementować
od nowa. Przetestuj działanie różnych typów krotek z różnymi parametrami.

## **Zadanie 3.**

Dany jest kod programu implementujący tablicę dynamiczną przechowującą wartości typu `int` w
oparciu o zwykłe tablice. Przerób kod tak aby miał on postać generyczną i mógł przechowywać
dowolne typy referencyjne.

<br>![cmd_gcc](images/picture1.png)

<br>![cmd_gcc](images/picture2.png)

## **Zadanie 4.**

Przetestuj programy ze slajdów 37 i 38 z wykładu. Dodaj inne typy klas z owocami.
