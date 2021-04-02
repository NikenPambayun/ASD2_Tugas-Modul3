package Tugas3;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        String A[] = {"Galileo,", "Archimedes,", "Alkhawarizmi,", "Aljabar,", "Nama Mahasiswa,", "Tesla"};
        String cari;
        
        //menampilkan data array
        System.out.println("Isi data A adalah : ");
            for(int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari : ");
        cari = scan.nextLine();
        
        System.out.println("");
        
        for(int i = 0; i <= A.length; i++) {
            if(cari.equalsIgnoreCase(A[i])) {
                System.out.print("Data "+ cari +" berada pada indeks ke - "+ i);
                break;    //stop perulangan
            }
        }
                
        System.out.println();
        System.out.println();
        System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
