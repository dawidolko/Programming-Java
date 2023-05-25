package Task0;

public class Pojemnik<T> {

    private T element;

    public Pojemnik() {
        this.element = null;
    }

    public T pobierz() {
        return this.element;
    }

    public void ustaw(T element) {
        this.element = element;
    }

    public void wyswietl() {
        System.out.println(this.element);
    }
}
