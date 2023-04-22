package javaLesson.lambdas;

@FunctionalInterface
public interface Transformable<T> {
    T transform(T t);
}
