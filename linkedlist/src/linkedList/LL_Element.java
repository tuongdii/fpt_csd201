
package linkedList;

/**
 *
 * @author DELL
 */
public class LL_Element {
    Comparable data;
    LL_Element next;
    LL_Element previous;

    public LL_Element(Comparable data) {
        this.data = data;
        next = previous = null;
    }

    public Comparable getData() {
        return data;
    }

    public LL_Element getNext() {
        return next;
    }

    public LL_Element getPrevious() {
        return previous;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public void setNext(LL_Element next) {
        this.next = next;
    }

    public void setPrevious(LL_Element previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
    
}
