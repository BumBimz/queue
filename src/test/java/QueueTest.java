import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    Queue queue = new Queue();

    @Test
    public void isEmptyQueue() {
        assertTrue("Queue is not Empty", queue.isEmpty());
    }

    @Test
    public void isNotEmptyQueue() {
        queue.enQueue("A");
        assertFalse("Queue is Empty", queue.isEmpty());
    }

    @Test
    public void whenEnqueueOnceTimeThenCountQueueIsReturnOne() {
        int expected = 1;
        queue.enQueue("A");
        int actual = queue.countQueue();
        assertEquals("Queue is not one", expected, actual);
    }

    @Test
    public void whenEnqueueTwinTimeThenCountQueueIsReturnTwo() {
        int expected = 2;
        queue.enQueue("A");
        queue.enQueue("B");
        int actual = queue.countQueue();
        assertEquals("Queue is not Two", expected, actual);
    }
}
