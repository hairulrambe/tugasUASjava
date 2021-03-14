import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class projekuasjava{
	public static void main(String[]args){
        login();}
        static void login (){
		String data[]={"HAIRUL","hairul12345"};
		String nama,sandi;
		System.out.println("=====================================================");
		System.out.println("||              KUMPULAN PROGRAM JAVA              ||");
		System.out.println("||                 POLITEKNIK KAMPAR               ||");
		System.out.println("||	       Kec. BANGKINANG, Kab. RIAU          ||");
		System.out.println("=====================================================");
		Scanner apa=new Scanner(System.in);
		System.out.print("USERNAME	 : ");
		nama=apa.nextLine();
		System.out.print("PASSWORD	 : ");
		sandi=apa.nextLine();
        System.out.println();
        /**
		 * Percabangan untuk mengecek keberadaan 
		 * data
		 */
		if(nama.equals(data[0])&&sandi.equals(data[1])){
            System.out.println("\t----------------------------------------");
			System.out.println("\t\t\tSELAMAT DATANG");
            System.out.println("\t----------------------------------------");
            System.out.println();
			menu();
		}else{
			System.out.println("Maaf Nama Pengguna Atau Sandi Tidak Tersedia");
            login();
		}
        }
    static void menu(){
        System.out.println("====================================");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("==== PROGRAM PEMBELAJARAN JAVA =====");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("====================================");
        System.out.println();
        System.out.println("CONTOH PROGRAM MENGGUNAKAN JAVA : ");
        int listterima;
		System.out.println("1. Menghitung Luas Bangun Datar");
        System.out.println("2. Menghitung Volume Bangun Ruang");
		System.out.println("3. Kasir Polkam Mart");
		System.out.println("4. Keluar");
		Scanner apa=new Scanner(System.in);
		int menu;
		System.out.print("Silahkan Masukkan Nomor List Program : ");
		menu=apa.nextInt();
        if(menu==1){
            bangun();
        }
		else if(menu==2){
			volume();
		}
        else if(menu==3){
            jualan();
        }
        else{
			System.exit(0);
		}

	}
    static void bangun(){
    System.out.println("==============================");
        System.out.println("==== PROGRAM PERCABANGAN =====");
        System.out.println("==============================");
        System.out.println();
        System.out.println("LIST BANGUN : ");
        int listterima;

        Scanner input=new Scanner(System.in);
        String bangundatar[]={"Luas Lingkaran","Luas Persegi","Keluar"};
        System.out.println("1. "+bangundatar[0]);
        System.out.println("2. "+bangundatar[1]);
        System.out.println("3. "+bangundatar[2]);

        System.out.println("Silahkan Masukan Nomor List yang akan dilakukan Perhitungan");
        listterima=input.nextInt();

        //percabangan

        switch(listterima){
            case 1:
                //menghitung luas lingkaran
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println("===============================");
                System.out.print("Masukan Jari-jari=>");
                double jari2,luas,pi=3.14;
                Scanner terimaL=new Scanner(System.in);
                jari2=terimaL.nextDouble();
                luas=pi*jari2*jari2;
                System.out.println("Luas Lingkaran = "+luas);

System.out.println("=======================================================");
            System.out.println("Proses Melakukan Perhitungan Telah Selesai");  
        break;
            case 2:
                //Menghitung Luas persegi 
                int panjang,lebar;
                Scanner terimaP=new Scanner(System.in);
                System.out.println("Menghitung Luas Persegi");
                System.out.println("=============================");
                System.out.print("Masukan Panjang=> ");
                panjang=terimaP.nextInt();

                System.out.print("Masukan Lebar=> ");
                lebar=terimaP.nextInt();
                luas=lebar*panjang;
                System.out.println("Luas Lingkaran : "+luas);

System.out.println("=======================================================");
                System.out.println("Proses Melakukan Perhitungan Telah Selesai");
                
            
            case 3:
            //jika Masukan 3
                System.out.print("Proses Telah Selesai Keluar");
                System.exit(0);

            default :
            //jika masukan salah
                System.out.print("Maaf Tidak ada kode"+listterima+"Systm akan keluar");
                System.exit(0);
                System.out.println("1. Kembali ke Menu");
		System.out.println("2. Keluar");
		Scanner apa=new Scanner(System.in);
		int kondisi;
		System.out.print("Apakan Anda masih ingin program lain : ");
		kondisi=apa.nextInt();
		if(kondisi==1){
			menu();
		}else{
			System.exit(0);
		}
        }
    }
static void volume(){
double volume,p,l;
        int t;
        Scanner oke=new Scanner(System.in);
        System.out.println();
        System.out.println("=^=================^^=============^=");
        System.out.println("MENGHITUNG VOLUME LIMAS SEGI EMPAT");
        System.out.println("=^=================^^=============^=");
        System.out.println();

        System.out.println("--------------------------------------");
        System.out.print("What Length value you want to input: ");//input yang discan nilai panjang
         p=oke.nextInt();
        System.out.println("--------------------------------------");
        System.out.println();

       System.out.println("--------------------------------------");
        System.out.print("What widht value you want to input: ");//input yang discan nilai lebar
         l=oke.nextInt();
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println("--------------------------------------");
        System.out.print("What high value you want to input: ");//input yang discan nilai tinggi
        t=oke.nextInt();
        System.out.println("--------------------------------------");
        System.out.println();

        volume=p*l*t/3;
        //rumus volume sebenarnya yaitu La(luas alas) namun, disini saya masukan la nya yaitu p*l karena rumus la=p*l
        System.out.println("So The Volume Of your Square Pyramid: "+volume);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("");
        System.out.println("1. Kembali ke Menu");
		System.out.println("2. Keluar");
		Scanner apa=new Scanner(System.in);
		int kondisi;
		System.out.print("Apakan Anda masih ingin program lain : ");
		kondisi=apa.nextInt();
		if(kondisi==1){
			menu();
		}else{
			System.exit(0);
		}
    }
static void jualan(){
		Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
         //Deklarasi variabel
         int jum=0, i=0;
         double total_bayar=0;
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("            SELAMAT DATANG DI CAFE TERSERAH ");
        System.out.println("\n");
        System.out.println("           =================================================");
        System.out.println("           ================================================");
        System.out.println("            \n\n");
                System.out.println("                    MAKANAN ADALAH KEBUTUHAN ANDA");
		//        menampilkan menu makanan
        System.out.println("             _________________________________________");
        System.out.println("            |                MENU MAKANAN             |");
        System.out.println("            |_________________________________________|");
        System.out.println("            |       Nama            |       Harga     |");
        System.out.println("            |1. Nasi goreng special |   Rp 15000,00   |");
        System.out.println("            |2. nila bakar terserah |   Rp 18000,00   |");
        System.out.println("            |3. Ayam goreng terserah|   Rp 13000,00   |");
        System.out.println("            |4. Mie tiaw            |   Rp 15000,00   |");
        System.out.println("            |5. Nila Cabe Ijo       |   Rp 13000,00   |");
	    System.out.println("            |6. Nila goreng         |   Rp 14000,00   |");
        System.out.println("            |7. Bebek Cabe IJo      |   Rp 15000,00   |");
        System.out.println("            |8. Bebek Goreng        |   Rp 13000,00   |");
        System.out.println("            |9. Lele kalasan        |   Rp 12000,00   |");
        System.out.println("            |10.Burung Goreng       |   Rp 15000,00   |");
        System.out.println("            |11. Nasi Goreg Kampung |   Rp 14000,00   |");
        System.out.println("            |12. Nasi Goreng Biasa  |   Rp 18000,00   |");
        System.out.println("            |13. Nasi Goreng Seafood|   Rp 23000,00   |");
        System.out.println("            |14. Mie Goreng Aceh    |   Rp 15000,00   |");
        System.out.println("            |15.Mie Goreng Biasa    |   Rp 12000,00   |");
        System.out.println("            |_______________________|_________________|");
        System.out.println("");


         //Deklarasi array
         int [] kode = new int[5];
         int [] item = new int[5];
         int [] harga = new int[5];
         double [] sub_total = new double[5];
         double [] diskon= new double [5];
         String [] barang = new String[5];
         
         System.out.println("            KASIR CAFE TERSERAH");
         
         System.out.print("            Masukan Jumlah Beli : ");
         jum=input.nextInt();
         System.out.println(" ");
         //Memasukan elemen didalam array
         for (i=0; i<jum;i++){
              System.out.print("            Masukan Kode Barang Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("            Masukan item Ke-"+(i+1)+" : ");
              item[i]=input.nextInt();
              //Menentukan barang berdasarkan kode yang dimmasukan
              switch (kode[i]){
                    case 1 : 
                            barang[i]="Nasi Goreng special  ";
                            harga[i]=15000;
                            diskon[i]=0.1;
                            break;
                    case 2 : 
                            barang[i]="Nila Bakar Terserah  ";
                            harga[i]=18000;
                            diskon[i]=0.05;
                            break;
                    case 3 : 
                            barang[i]="Ayam Goreng Terserah";
                            harga[i]=15000;
                            diskon[i]=0;
                            break;
                    case 4 : 
                            barang[i]="Mie tiaw       ";
                            harga[i]=15000;
                            diskon[i]=0.2;
                            break;
                    case 5 : 
                            barang[i]="Nila Cabe Ijo     ";
                            harga[i]=13000;
                            diskon[i]=0.1;
                            break;
                    case 6 : 
                            barang[i]="Nila Goreng  ";
                            harga[i]=14000;
                            diskon[i]=0.1;
                            break;
                    case 7 : 
                            barang[i]="Bebek Cabe Ijo  ";
                            harga[i]=15000;
                            diskon[i]=0.05;
                            break;
                    case 8 : 
                            barang[i]="Bebek Goreng";
                            harga[i]=13000;
                            diskon[i]=0;
                            break;
                    case 9 : 
                            barang[i]="Lele Kalasan        ";
                            harga[i]=12000;
                            diskon[i]=0.2;
                            break;
                    case 10 : 
                            barang[i]="Burung Goreng     ";
                            harga[i]=15000;
                            diskon[i]=0.1;
                            break;
                    case 11 : 
                            barang[i]="Nasi Goreng Kampung     ";
                            harga[i]=14000;
                            diskon[i]=0.1;
                            break;
                    case 12 : 
                            barang[i]="Nasi Goreng Biasa     ";
                            harga[i]=18000;
                            diskon[i]=0.1;
                            break;
                    case 13 : 
                            barang[i]="Nasi Goreng Seafood     ";
                            harga[i]=23000;
                            diskon[i]=0.1;
                            break;
                    case 14 : 
                            barang[i]="Mie Goreng Aceh     ";
                            harga[i]=15000;
                            diskon[i]=0.1;
                            break;
                    case 15 : 
                            barang[i]="Mie Goreng Biasa     ";
                            harga[i]=12000;
                            diskon[i]=0.1;
                            break;
                  default : 
                            System.out.println("            Kode Barang Tidak Tersedia");
              }
         }
          //Pengaturan format number
          formatRp.setCurrencySymbol("            Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No        Nama Barang                  Harga                       QTY         Diskon              Sub Total");  
          //Menampilkan seluruh elemen di dalam array
          for (i=0; i<jum;i++){ 
             sub_total[i]=((item[i]*harga[i])-(item[i]*harga[i]*diskon[i]));
             total_bayar+=sub_total[i];
              System.out.println(          +i+1+"       "+barang[i]+"       "+kursIndonesia.format(harga[i])+"              "+item[i]+"              "+(int)(diskon[i]*100)+"%"+"        "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");
          //Menampilkan total bayar
          System.out.println("            Total Bayar       : "+kursIndonesia.format(total_bayar));
          System.out.print  ("            Masukan Uang Anda : Rp.  ");
          int uang;
          Scanner oke=new Scanner(System.in);
          uang=oke.nextInt();
          System.out.println("            Kembalian          :   "+(uang-total_bayar));
          System.out.println("1. Kembali ke Menu");
		System.out.println("2. Keluar");
		Scanner apa=new Scanner(System.in);
		int kondisi;
		System.out.print("Apakan Anda masih ingin program lain : ");
		kondisi=apa.nextInt();
		if(kondisi==1){
			menu();
		}else{
			System.exit(0);
		}
    }
}
