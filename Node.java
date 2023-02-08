class Node {
    private String value;
    private Node next;
    Node() {
        this.setVal("");
        this.setNext(null);
    }
    Node(String value) {
        this.setVal(value);
        this.setNext(null);
    }
    String getVal() {
        return this.value;
    }
    Node getNext() {
        return this.next;
    }
    void setVal(String val) {
        this.value = val;
    }
    void setNext(Node next) {
        this.next = next;
    }
}