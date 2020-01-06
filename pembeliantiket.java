import java.util.Scanner;
public class pembeliantiket{
    public static void main(String[] args){

    int total;
    int jumlah_kursi;
    int Harga=0;
    String nama;
    String rute;
    String kelas;
    String fasilitas;
    String rute_bis;

        Scanner input = new Scanner(System.in);

        for (int i=1;i<=2;i++){        
       System.out.println ("Data pemesanan tiket ke-"+i);
            
System.out.println("Jurusan Bus Antar Kota");
        System.out.println("1. Jakarta-Bandung");
        System.out.println("Non AC = 90000");
        System.out.println("AC = 130000");
        System.out.println("2. Bandung-Jakarta");
        System.out.println("Non AC = 70000");
        System.out.println("AC = 150000");
        System.out.println("3. Jakarta-Tasikmalaya");
        System.out.println("Non AC = 50000");
        System.out.println("AC = 70000");
        
       
        System.out.print("Nama Pemesan : ");
        nama=input.nextLine();
        
        System.out.print("rute bis (1/2/3) : ");
        rute_bis=input.nextLine();
        
        System.out.print("kelas (AC/NA) : ");
        fasilitas=input.nextLine();
        
        System.out.print("Jumlah Kursi : ");
        jumlah_kursi=input.nextInt();
        
        switch(rute_bis){
            case "1":
                rute="Jakarta-Bandung";
                if ("NA".equals(fasilitas))
                {
                Harga=90000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                Harga=130000;
                kelas="AC";
                } 
                break;
            case "2": 
                rute="Bandung-Jakarta";
                if ("NA".equals(fasilitas))
                {
                Harga=70000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                Harga=150000;
                kelas="AC";
                } 
                break;
            case "3": 
                rute="Jakarta-Tasikmalaya";
                if ("NA".equals(fasilitas))
                {
                Harga=50000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                Harga=170000;
                kelas="AC";
                } 
                break;
            default:
                rute="Maaf silahkan input ulang";
                break;
        }
      
          
        if (jumlah_kursi>=1 && jumlah_kursi<=2) {
            
            total= Harga*jumlah_kursi;
        
    System.out.println("Terimakasih telah memesan tiket dengan rincian sebagai berikut: ");
            System.out.println("Nama : "+ nama);
            System.out.println("Rute : "+ rute);
            System.out.println("Jumlah kursi : "+jumlah_kursi);
            System.out.println("Kelas : " +fasilitas);
            System.out.println("Harga satuan : " + Harga);
            System.out.println("Total bayar : Rp."+ total);
            System.out.println("silahkan membayar di ALFAMART terdekat");
            System.out.println ("");
            }
        }
    }
}