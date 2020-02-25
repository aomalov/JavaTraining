package demo.my.queue;

public class MyQueueNode<T> {
    private final T elem;
    private MyQueueNode<T> prev;

    public MyQueueNode(T elem, MyQueueNode<T> prev) {
        this.elem = elem;
        this.prev = prev;
    }

    public MyQueueNode<T> addTail(T addElem) {
        this.prev=new MyQueueNode<T>(addElem,null);
        return this.prev;
    }

    public void removeTail() {
        this.prev=null;
    }

    public T getElem() {
        return elem;
    }

    public MyQueueNode<T> getPrev() {
        return prev;
    }

}
