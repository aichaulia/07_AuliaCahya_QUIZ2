class DoubleLinkedList_07 {
    Node_07 head;
    int size;

    public DoubleLinkedList_07(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Pembeli_07 beli, Pesanan_07 pesan){
        if (isEmpty()){
            head = new Node_07(null, beli, pesan, null);
        }else{
            Node_07 newNode = new Node_07(null, beli, pesan, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pembeli_07 beli, Pesanan_07 pesan){
        if (isEmpty()){
            addFirst(beli, pesan);
        }else{
            Node_07 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_07 newNode = new Node_07(current, beli, pesan, null);
            current.next = newNode;
            size++;
        }
    }
    public  void removeFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("Link List Masih Kosong, Tidak Dapat Dihapus");
        }else if(size == 1){
            head = null;
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void print(){
        if (isEmpty()){
            Node_07 tmp = head;
            while (tmp != null){
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        }else{
            System.out.println("Antrean Kosong!");
        }
    }
}
