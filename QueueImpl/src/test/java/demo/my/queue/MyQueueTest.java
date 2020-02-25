package demo.my.queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class MyQueueTest {

    private static MyQueue<Integer> queue;

    @BeforeAll
    static void init() {
        queue=new MyQueue<Integer>();
    }

    @Test
    void firstTest() {
        queue.put(1);
        queue.put(2);
        queue.put(3);
        try {
            assertEquals (queue.get() , 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void secondTest() throws Exception {
        assumeTrue(!queue.isEmpty());
        queue.get();
        assertEquals(3, (int) queue.get());
        Throwable exception = assertThrows(Exception.class, ()-> queue.get());
        assertTrue(exception.getMessage().contains("bounds"));
    }
}
