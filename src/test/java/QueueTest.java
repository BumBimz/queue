import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    @Test
    public void isEmptyQueue() {
        Queue queue = new Queue();
        assertTrue("Queue is not Empty", queue.isEmpty());
    }

    @Test
    public void isNotEmptyQueue() {
        Queue queue = new Queue();
        queue.enQueue("A");
        assertFalse("Queue is Empty", queue.isEmpty());
    }
}
