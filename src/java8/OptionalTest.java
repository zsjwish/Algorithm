package java8;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * created by zsj in 16:21 2018/6/26
 * description:
 **/
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.ofNullable(1);
        Optional<Integer> optional2 = Optional.ofNullable(null);
        System.out.println(optional1.isPresent());
        System.out.println(optional2.isPresent());
        System.out.println(optional1.get());
        optional1.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("the value is " + optional1.get() +"  integer  "+integer);
            }
        });
    }
}
