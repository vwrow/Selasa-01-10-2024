package tesBuAul;
import java.util.Scanner;

public class LatSolB {
        public static void main(String[] args) {
        
            String n1, n2, n3 ,n4 ,n5, choice;
            int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, total =0, h1, h2 ,h3, h4, h5;
            int jT, tT = 0, i=1;

            Scanner j = new Scanner(System.in);

            System.out.println("Sistem Penghitung Total Jumlah Penjualan 1 Minggu Terakhir");

        do {
            System.out.println("Daftar Menu Yang Ingin Diperiksa (5): ");
            System.out.print("1. ");
            n1 = j.next();
            System.out.print(" Rp. ");
            h1 = j.nextInt();
            System.out.print("2. ");
            n2 = j.next();
            System.out.print(" Rp. ");
            h2 = j.nextInt();
            System.out.print("3. ");
            n3 = j.next();
            System.out.print(" Rp. ");
            h3 = j.nextInt();
            System.out.print("4. ");
            n4 = j.next();
            System.out.print(" Rp. ");
            h4 = j.nextInt();
            System.out.print("5. ");
            n5 = j.next();
            System.out.print(" Rp. ");
            h5 = j.nextInt();


            do {
                // System.out.println("== Weekly Selling Report ==");
                // System.out.println("1. Ayam Bakar \n2. Ayam Lada Hitam \n3. Ayam Goreng \n4. Ayam Geprek \n5. Ayam Katsu ");
                System.out.println();
                System.out.println("Data Penjualan Hari ke-" +i);
                System.out.print("Penjualan " +n1 +": ");
                jT = j.nextInt();
                m1 = m1 + jT;
                total = h1*m1;
                System.out.println(" Value: Rp. " +total);
                System.out.print("Penjualan " +n2 +": ");
                jT = j.nextInt();
                m2 = m2 + jT;
                total = h2*m2;
                System.out.println(" Value: Rp. " +total);
                System.out.print("Penjualan " +n3 +": ");
                jT = j.nextInt();
                m3 = m3 + jT;
                total = h3*m3;
                System.out.println(" Value: Rp. " +total);
                System.out.print("Penjualan " +n4 +": ");
                jT = j.nextInt();
                m4 = m4 + jT;
                total = h4*m4;
                System.out.println(" Value: Rp. " +total);
                System.out.print("Penjualan " +n5 +": ");
                jT = j.nextInt();
                m5 = m5 + jT;
                total = h5*m5;
                System.out.println(" Value: Rp. " +total);

                total = (h1*m1) + (h2*m2) + (h3*m3) + (h4*m4) + (h5*m5);
                tT = tT+m1+m2+m3+m4+m5;
                i++;
            } while (i <= 7);

            System.out.println();
            System.out.println("== Weekly Selling Report == \n");
            System.out.println("Total Porsi Yang Terjual Selama 7 Hari Terakhir: " +tT +" Porsi");
            System.out.println("Total Keuntungan Yang Diraih: " +total);
            System.out.println("Rincian Lebih Detailnya: ");
            total = h1*m1;
            System.out.println("1. " + n1 +": "+m1 +" Porsi");
            System.out.println(" Value: Rp. " +total);
            total = h2*m2;
            System.out.println("2. " + n2 +": "+m2 +" Porsi");
            System.out.println(" Value: Rp. " +total);
            total = h3*m3;
            System.out.println("3. " + n3 +": "+m3 +" Porsi");
            System.out.println(" Value: Rp. " +total);
            total = h4*m4;
            System.out.println("4. " + n4 +": "+m4 +" Porsi");
            System.out.println(" Value: Rp. " +total);
            total = h5*m5;
            System.out.println("5. " + n5 +": "+m5 +" Porsi");
            System.out.println(" Value: Rp. " +total);

            System.out.print("\nMasih Ingin Menggunakan Sistem (Masih/ Tidak)? ");
            choice = j.next();
            
        } while (choice.equalsIgnoreCase("Masih"));
        
    j.close();
    }     
}
