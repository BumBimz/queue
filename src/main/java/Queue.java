
public class Queue {
    private int count;

    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    public void enQueue(String customer) {
        count++;
    }

    public int countQueue() {
        return 1;
    }
}
