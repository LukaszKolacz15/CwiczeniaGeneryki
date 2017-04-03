package pl.akademiakodu.zad3;

/**
 * Created by Lukasz Kolacz on 18.03.2017.
 */
public class GenericArray <T>{

    private T[] someArray;

    public GenericArray(T...someArray){
        this.someArray=someArray;
    }

    public MinMax<T>getMinMax(){
        return new MinMax<>(someArray[0], someArray[someArray.length-1]);
    }

}
