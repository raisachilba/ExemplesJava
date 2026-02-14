package EstructuresDades;

import processing.core.PApplet;

public class LlistaNodes {

    Node head, tail;
    int numNodes;

    public LlistaNodes(){
        head = null;
        tail = null;
        numNodes = 0;
    }

    public boolean isEmpty(){
        return this.head == null && this.tail == null;
    }

    public void prepend(int v){
        if(isEmpty()) {
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else{
            Node n = new Node(v, head);
            head = n;
        }
        numNodes++;
    }

    public void append(int v){
        if(isEmpty()) {
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else{
            Node n = new Node(v, null);
            tail.seg = n;
            tail = n;
        }
        numNodes++;
    }

    public int numElement(){
        int sum = 0;
        Node x = head;
        while (x!=null){
            x = x.seg;
            sum++;
        }
        return sum;
    }

    public int numElements2(){ return numNodes; }

    public int getFirst(){ return head.valor; }

    public int getLast(){ return tail.valor; }

    public int getElementAt(int i){
        if(i<numNodes){
            int k = 0;
            Node n = head;
            while (k<i){
                n = n.seg;
                k++;
            }
            return n.valor;
        }
        else {
            return -1;
        }
    }

    public void insertAt(int i, int v){
        if(i == 0) {
            prepend(v);
        }
        else if(i == numNodes-1){
            append(v);
        }
        else if(i<numNodes){
            int k = 0;
            Node nAnt = head;
            while (k<i-1){
                nAnt = nAnt.seg;
                k++;
            }
            Node nSeg = nAnt.seg;
            Node nouNode = new Node(v, nSeg);
            nAnt.seg = nouNode;
            numNodes++;
        }
    }

    public int removeFirst(){
        if(!isEmpty()){
            int v = head.valor;
            head = head.seg;
            return v;
        }
        else{
            return -1;
        }
    }

    public int removeLast(){
        if(!isEmpty()){
            int k = 0;
            Node nAnt = head;
            while(k<numNodes-1){
                nAnt = nAnt.seg;
                k++;
            }
            int v = nAnt.seg.valor;
            nAnt.seg = null;
            return v;
        }
        else{
            return -1;
        }
    }

    public int removeAt(int p){
        if(!isEmpty() && p<numNodes){
            //Ens situa al node anterior del que volem borrar
            int k = 0;
            Node nodeAnt = head;
            while (k < p-1){
                nodeAnt = nodeAnt.seg;
                k++;
            }
            int v = -1;
            if(numNodes > 1){
                Node n = nodeAnt.seg;
                v = n.valor;
            }
            else {
                v = nodeAnt.valor;
                tail = null;
                head = null;
            }
            numNodes--;
            return v;
        }
        else{
            return -1;
        }
    }

    void display(PApplet p5, int x, int y, int wn) {

        if (!isEmpty()) {

            Node n = head;
            int i = 0;
            do {
                n.display(p5,x + 2*i*wn, y, wn);
                n = n.seg;
                i++;
            } while (n!=null);
        }

        p5.fill(0);
        p5.textAlign(p5.CENTER);
        p5.text("HEAD", x + wn/2, y -50);
        p5.line(x + wn/2, y - wn, x + wn/2, y);
    }
}
