import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO implements Queue {
    private ArrayList<Object> queue = new ArrayList<Object>();
    private int maxSize = 0;

    public void add(Object o) {
        queue.add(o);
        if(this.queue.size()>maxSize) {
            maxSize = this.queue.size();
        }
    }


    public void removeFirst() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        this.queue.remove(0);
    }


    public Object first() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.queue.get(0);
    }


    public int maxSize() {
        return maxSize;
    }


    public boolean isEmpty() {
        if(queue.size()==0) {
            return true;
        }
        return false;
    }


    public int size() {
        return this.queue.size();
    }

    public boolean equals(Object f) {
        if(f instanceof FIFO) {
            if(((FIFO) f).queue.size() == this.queue.size()) {
                for(int i = 0; i < this.queue.size(); i++) {
                    //if((this.queue.get(i) == null && ((FIFO) f).queue.get(i) == null) || (this.queue.get(i).equals(((FIFO) f).queue.get(i)))){
                      //  continue;
                    //}
                	if((this.queue.get(i) == null) &&  (((FIFO) f).queue.get(i) != null)) {
                		return false;
                	}
             
                	else if ((this.queue.get(i) != null) &&  (((FIFO) f).queue.get(i) == null)) {
                		return false;
                	}
                	else if ((this.queue.get(i) == null) &&  (((FIFO) f).queue.get(i) == null)) {
                		continue;
                	}
                	else if(this.queue.get(i).equals(((FIFO) f).queue.get(i))){
                    	continue;
                    }
                }
                return true;
            }
            return false;
        }
        else {
            throw new ClassCastException();
        }
    }


    //Kanske fel?????????????
    public String toString() {
        String printQueue = "Queue: ";
        for(Object o : queue) {
            printQueue += "(" + o + ") ";
        }
        return printQueue;
    }

}
