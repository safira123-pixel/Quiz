
public class DoubleLinkedList {
    Node head;
    int size;
    
public DoubleLinkedList() {
    head = null;
    size = 0;
    }

public boolean isEmpty() {
    return head == null;
    }

public void addFirst(String Nim, String Nama, String Jurusan, String Prodi, double Ipk) {
    if (isEmpty()) {
    head = new Node(null, Nim, Nama, Jurusan, Prodi, Ipk, null);
    } else { 
    Node newNode = new Node(null, Nim, Nama, Jurusan, Prodi, Ipk, head);
    head.prev = newNode;
    head = newNode;
    }
    size++;
    }

public void addLast(String Nim, String Nama, String Jurusan, String Prodi, double Ipk) {
    if (isEmpty()) {
    addFirst(Nim, Nama, Jurusan, Prodi, Ipk);
    } else {
    Node current = head;
    while (current.next != null) {
    current = current.next;
    }
    Node newNode = new Node(current, Nim, Nama, Jurusan, Prodi, Ipk, null);
    current.next = newNode;
    size++;
    }
}

public void add(String Nim, String Nama, String Jurusan, String Prodi, double Ipk, int index) {
    if (isEmpty()) {
    addFirst(Nim, Nama, Jurusan, Prodi, Ipk);
    } else if (index < 0 || index > size) {
    System.out.println("Nilai index diluar batas");
    } else {
    Node current = head;
    for (int i = 0; i < index; i++) {
    current = current.next;
    }
    if (current.prev == null) {
    Node newNode = new Node(null, Nim, Nama, Jurusan, Prodi, Ipk, current);
    current.prev = newNode;
    newNode = head;
    } else {
    Node newNode = new Node(current.prev, Nim, Nama, Jurusan, Prodi, Ipk, current);
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;
    }
}
    size++;
}

public void removeFirst() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else if (size == 1) {
    removeLast();
    } else {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + head.Nim);
    System.out.println("Nama: " + head.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + head.Ipk);
    head = head.next;
    head.prev = null;
    size--;
    }
}
public void removeLast() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else if (head.next == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + head.Nim);
    System.out.println("Nama: " + head.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + head.Ipk);
    head = null;
    size--;
    return;
    }
    Node current = head;
    while (current.next.next != null) {
    current = current.next;
    }
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("IDENTITAS:");
    System.out.println("NIM : " + current.next.Nim);
    System.out.println("Nama: " + current.next.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + current.next.Ipk);
    current.next = null;
    size--;
}

public void remove(int index) {
    if (index < 0 || index > size) {
    System.out.println("nilai indeks di luar batas");
    } else if (index == 0) {
    removeFirst();
    } else {
    Node current = head;
    for (int i = 0; i < index; i++) {
    current = current.next;
    }
    if (current.next == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.Nim);
    System.out.println("Nama: " + current.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + current.Ipk);
    current.prev.next = null;
    } else if (current.prev == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.Nim);
    System.out.println("Nama: " + current.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + current.Ipk);
    current = current.next;
    current.prev = null;
    head = current;
    } else {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.Nim);
    System.out.println("Nama: " + current.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + current.Ipk);
    current.prev.next = current.next;
    current.next.prev = current.prev;
    }
    size--;
    }
}

public void print() {
    if (!isEmpty()) {
    Node tmp = head;
    while (tmp != null) {
    System.out.println("NIM : " + tmp.Nim);
    System.out.println("Nama: " + tmp.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + tmp.Ipk);
    tmp = tmp.next;
    }
    } else {
    System.out.println("Linked List Kosong");
    }
}

public void seqSearch(String cari) {
    int idx = -1;
    Node current = head;
    for (int i = 0; i < size; i++) {
    if (current.Nim.equals(cari)) {
    idx = i;
    } else {
    current = current.next;
    }
    }
    if (idx != -1) {
    System.out.println("Data " + cari + " berada di node ke-" + idx);
    System.out.println("NIM : " + current.Nim);
    System.out.println("Nama: " + current.Nama);
    System.out.println("Jurusan : " + head.Jurusan);
    System.out.println("Prodi: " + head.Prodi);
    System.out.println("IPK : " + current.Ipk);
    } else {
    System.out.println("Data yang anda cari tidak ditemukan");
    }
}

public Node middle(Node start, Node last){ 
    if (start == null) 
        return null; 
    Node slow = start; 
    Node fast = start.next; 
    while (fast != last) 
    { 
        fast = fast.next; 
        if (fast != last) 
        { 
            slow = slow.next; 
            fast = fast.next; 
        } 
    } 
    return slow; 
}

public Node FindBinarySearch(Node nilai){
      Node pos1 = null, pos2;
    double mid = size/2;
    for(int a= 0; a <= mid; a++){
        pos1 = pos1.next;
    }
    pos2 = pos1.next;
    Node tmp = head;
    while( tmp != null){
        if(mid == 0){
            System.out.println("Data berada di awalan");
        } else if (pos2 == nilai){
            System.out.println("Data ditemukan pada posis ke -"+mid);
        } else if(nilai < pos2){
            for(int a = 0; a < mid; a++ ){
                if(nilai == tmp.Ipk){
                    System.out.println("Data ditemukan pada posisi ke - "+a+1);
                    return null;
                } else {
                    tmp = tmp.next;
                }
            }
        } else if (nilai > pos2){
            for(int a = 0; a < mid; a++){
                tmp = tmp.next;
            }
            for(double a = mid; a <= size; a++){
                if(nilai == tmp.Ipk){
                    System.out.println("Data ditemukan pada posisi ke - "+a+1);
                    return null;
                }
                else {
                    tmp = tmp.next;
                }
            }
        }
    }
  }

public void selectionShort(){
Node pos1, pos2, min;
double tmp;
if(head != null){
    pos1 = head;
    while(pos1.next != null){
        pos2 = pos1;
        min = pos1;
        while(pos2 != null){
            if(pos2.Ipk < min.Ipk){
                min = pos2;
            }
            pos2 = pos2.next;
        }
        if(pos1.Ipk > min.Ipk){
            tmp = pos1.Ipk;
            pos1.Ipk = min.Ipk;
            min.Ipk = tmp;
        }
        pos1 = pos1.next;
    }
}
else {
    System.out.println("Linked list kosong");
}
}
}
