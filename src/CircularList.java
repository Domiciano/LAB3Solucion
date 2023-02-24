public class CircularList {

    private Node head;

    public void addNode(Node node){
        if(head == null){
            head = node;
            head.setNext(head);
            head.setPrevious(head);
        }else{
            Node tail = head.getPrevious();
            node.setNext(head);
            head.setPrevious(node);
            tail.setNext(node);
            node.setPrevious(tail);
        }
    }

    public void print(){
        if(head == null){
            System.out.println("Lista vacia");
        }else{
            print(head);
        }
    }

    private void print(Node current){
        if(current == head.getPrevious()){
            System.out.println(current.getNum());
            return;
        }
        System.out.println(current.getNum());
        print(current.getNext());
    }

    public void delete(int goal){
        if(head == null){
            System.out.println("Lista vacia");
        }else if(head == head.getNext()){
            head = null;
        }else{
            delete(head, goal);
        }
    }

    private void delete(Node current, int goal){
        if(current.getNum() == goal){
            if(current == head){
                head.getPrevious().setNext(head.getNext());
                head.getNext().setPrevious(head.getPrevious());
                head = head.getNext();
            }else{
                Node prev = current.getPrevious();
                Node next = current.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
            }
            return;
        }
        if(current.getNext() == head){
            return;
        }
        delete(current.getNext(), goal);

    }



}
