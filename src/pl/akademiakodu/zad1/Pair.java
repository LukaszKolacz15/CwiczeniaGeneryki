package pl.akademiakodu.zad1;

/**
 * Created by Lukasz Kolacz on 18.03.2017.
 */
public class Pair<T, X>{

    private T first;
    private X last;

    public Pair(T first, X last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public X getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(X last) {
        this.last = last;
    }


}
