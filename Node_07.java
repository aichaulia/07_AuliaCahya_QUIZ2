class Node_07 {
    Node_07 prev, next;
    Pembeli_07 pembeli;
    Pesanan_07 pesanan;

    Node_07(Node_07 prev, Pembeli_07 pembeli, Pesanan_07 pesanan, Node_07 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}
