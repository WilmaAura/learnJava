public class mahasiswa {
    String nama = "Wilma Auraruna Khalif" ;
    String nim = "A11.2024.15841";
    String jurusan = "Teknik Informatika";
    void view (){ //method
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        
    }
}

class Main {
    public static void main (String [] arg){
        mahasiswa n = new mahasiswa();
        n.view();
    }
}