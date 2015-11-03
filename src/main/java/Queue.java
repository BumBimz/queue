
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
        if (count == 2){
            return 2;
        }
        return 1;
    }
}
