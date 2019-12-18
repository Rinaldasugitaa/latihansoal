import java.util.Scanner;

public class programhitungluas{
    public static void main(String[] args) {
               boolean runApp = true;
        try{
            while(runApp==true){
                Scanner input = new Scanner(System.in);
                System.out.println("1. Menghitung Luas Segitiga");
                System.out.println("2. Menghitung Volume Balok");
                System.out.println("3. Menghitung Volume Persegi");
                System.out.println("4. Menghitung Keliling Lingkaran");
                System.out.println("5. Untuk Keluar Program");
                System.out.print("Pilihan anda: "); int x = input.nextInt();
                switch(x){
                    case 1:
                    System.out.print("Alas: ");int alas=input.nextInt();
                    System.out.print("Tinggi: ");int tinggi=input.nextInt();
                    System.out.println(HitungLuasSegitiga(alas,tinggi)) ;
                    break;

                    case 2:
                    System.out.print("Panjang: ");int panjang=input.nextInt();
                    System.out.print("Lebar: ");int lebar=input.nextInt();
                    System.out.print("Tinggi: ");int tinggi2=input.nextInt();
                    System.out.println(HitungVolumeBalok(panjang,lebar,tinggi2));
                    break;

                    case 3:
                    System.out.print("sisi: ");int sisi=input.nextInt();
                    System.out.print("sisi: ");int sisi2=input.nextInt();
                    System.out.print("sisi: ");int sisi3=input.nextInt();
                    System.out.println(HitungVolumePersegi(sisi,sisi2,sisi3));
                    break;

                    case 4:
                    System.out.print("diameter: ");int diameter=input.nextInt();
                    System.out.println(HitungKelilingLingkaran(diameter)) ;
                    break;
                    
                    default:
                    runApp=false;
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Data Harus Integer");
        }        
    }

    public static double HitungLuasSegitiga(int alas, int tinggi){
        double luas = alas*tinggi*0.5;
        return luas;   
    }

    public static double HitungVolumeBalok(int panjang, int lebar, int tinggi){
        double volume = panjang*lebar*tinggi;
        return volume;
    }

    public static double HitungVolumePersegi(int sisi, int sisi2, int sisi3){
        double volume = sisi*sisi*sisi;
        return volume;
    }

    public static double HitungKelilingLingkaran(int diameter){
        double phi = 3.14;
        double Keliling = phi * diameter;
        return Keliling;
    }    
}
