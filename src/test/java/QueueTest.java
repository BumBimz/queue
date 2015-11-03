import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueueTest {
    @Test
    public void isEmptyQueue() {
        Queue queue = new Queue();
        assertTrue("Queue is not Empty", queue.isEmpty());
    }
}
