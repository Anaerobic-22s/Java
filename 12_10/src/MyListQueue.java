public class MyListQueue {
    static class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
    public Node front;
    public Node rear;
    public int usedSize;

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if (rear == null){
            this.front = node;
        }else {
            this.rear.next = node;
        }
        this.rear = node;
        usedSize++;
    }

}
