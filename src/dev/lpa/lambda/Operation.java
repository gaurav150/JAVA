package dev.lpa.lambda;


@FunctionalInterface
public interface Operation<T> {

    T operate(T value1 ,T value2); // this  is called functional interface

}
