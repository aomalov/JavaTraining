package demo.my.queue;

public class MyQueue<T> {
    private MyQueueNode<T> head;
    private MyQueueNode<T> tail;

    public MyQueue() {
        head=null;
        tail=null;
    }

    public void put(T elem) {
        if(tail==null) {
            head=new MyQueueNode<T>(elem,null);
            tail=head;
        } else {
            tail=tail.addTail(elem);
        }
    }

    public T get() throws Exception {
        if(head==null) throw new Exception("Out of queue bounds");
        T res=head.getElem();
        head=head.getPrev();
        return res;
    }


    public boolean isEmpty() {
        return head==null;
    }
}
