import java.util.Scanner;

public class parkiran{
    public static void main(String[] args) {
       
        Scanner input_masuk = new Scanner(System.in);
        int tarif_Parkir = 0;
        int  total_jam;
        Double jumlah_bayar;
        Double kembalian;

        System.out.println("WELCOME");  
        System.out.println("TO MY APPLICATION");  
        System.out.println();  
        System.out.println("Masukan No Polisi");  
        String No_Polisi = input_masuk.next();
        System.out.println("Masukan Jam Masuk");
        int Jam_Masuk = input_masuk.nextInt();
        System.out.println("Masukan Jam Keluar");
        int Jam_Keluar = input_masuk.nextInt();
        int out = Jam_Keluar;
        System.out.println();
        System.out.println("Kode Kendaraan");
        System.out.println();
        System.out.println("1.Mobil");
        System.out.println("2.Motor");
        System.out.println();
        System.out.println("Masukan Kode Kendaraan");
        System.out.println();
        int tipe = input_masuk.nextInt();
        if(Jam_Masuk > Jam_Keluar){
            Jam_Keluar+=24;
        }    

        int total_Jam_Parkir = Jam_Keluar - Jam_Masuk; //0
        if(total_Jam_Parkir == 0){
            total_Jam_Parkir = 1; //1
        }
        int total_Jam_Parkir_Berikutnya  = total_Jam_Parkir - 1; //1-1 = 0
        switch (tipe) {
            case 1:
            tarif_Parkir = 5000 + (total_Jam_Parkir_Berikutnya*3000); //5000 + (0*3000)
            
            break;

            default:
            tarif_Parkir = 3000 + total_Jam_Parkir_Berikutnya*1500;
            break;
        }

        System.out.println("Bayar Parkir");
        System.out.println();
        
        if(tipe==1){
            System.out.println("Jenis Kendaraan Mobil");
        }
        else if(tipe==2){
            System.out.println("Jenis Kendaraan Motor");

        }
        else{
            System.out.println("Jenis Kendaraan Tidak Terdaftar");
        }

        System.out.println("No Polisi : " + No_Polisi);
        System.out.println("Jam Masuk : " + Jam_Masuk+ "WIB");
        System.out.println("Jam Keluar : "+ Jam_Keluar+ "WIB");
        System.out.println("Lama parkir : "+ total_Jam_Parkir + "Jam");
        System.out.println("Tarif Parkir = RP."+ tarif_Parkir);
    }
}         