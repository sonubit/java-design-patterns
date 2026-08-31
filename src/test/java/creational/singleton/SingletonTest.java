package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

    @Test
    void shouldReturnSameInstance() {

        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        assertSame(first, second);
    }
}
