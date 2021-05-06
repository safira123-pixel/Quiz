
public class Node {
    String Nim, Nama, Jurusan, Prodi;
    double Ipk;
    Node prev, next;
    Node right, left;
    
public Node(Node prev, String Nim, String Nama, String Jurusan, String Prodi, double Ipk, Node next) {
    this.prev = prev;
    this.Nim = Nim;
    this.Nama = Nama;
    this.Jurusan = Jurusan;
    this.Prodi = Prodi;
    this.Ipk = Ipk;
    this.next = next;
    right = left = null;
    }
}
