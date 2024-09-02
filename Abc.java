import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();


        //membuat obyek
        Siswa adi = new Siswa();
        Siswa lia = new Siswa();

        Siswa ria = new Siswa(10, "Ria", 50);
        Siswa cahya = new Siswa(id,nama,ipk);
        adi.setId(100);
        adi.setNama("Adi");
        adi.setIpk(4);
        System.out.println("Ini Data Adi");
        adi.print();
        System.out.println("Ini Data Lia");
        lia.print();

        ria.print();
        cahya.print();
        System.out.println(ria.print2());


        Siswa ari = new Siswa(id, nama, ipk);
        //Nilai Diatas 75 Lulus 
        if (ari.getIpk() >= 75) {
            System.out.println(ari.getNama()+"Lulus");
        }else {
            System.out.println(ari.getNama() +"tidak Lulus");
        }



        //Nilai Huruf
        if (ari.getIpk() <60) {
            System.out.println("E");
        } else if (ari.getIpk() > 60 && ari.getIpk() <= 70) {
            System.out.println("D");
        } else if(ari.getIpk() > 71 && ari.getIpk() <= 80) {
            System.out.println("C");
        } else if(ari.getIpk() > 81 && ari.getIpk() <= 90) {
            System.out.println("B");
        } else if(ari.getIpk() > 91 && ari.getIpk() <= 100) {
            System.out.println("A");
        }


        in.close();
    }
}
