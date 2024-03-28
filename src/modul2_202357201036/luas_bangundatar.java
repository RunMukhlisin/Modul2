package modul2_202357201036;
import javax.swing.JOptionPane;
public class luas_bangundatar {
    public static double luasPersegi(double sisi){
        return sisi * sisi;
    }
    public static double luasPersegiPanjang(double panjang , double lebar){
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }    
    public static double luaslingkaran(double diameter){
        double jari2 = diameter / 2.0;
        return Math.PI * Math.pow(jari2, 2);
    }

    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Pilih bangun : \n1. Persegi \n2. Persegi panjang \n3. Segitiga \n4. Lingkaran");
        int pilihan = Integer.parseInt(input);
        double luas = 0;
        
        if (pilihan == 1){
            double sisiPersegi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang sisi"));
            luas = luasPersegi(sisiPersegi);
        } else if  (pilihan == 2){
            double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang"));
            double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar"));
            luas = luasPersegiPanjang(panjang, lebar);
        } else if  (pilihan == 3){
            double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas"));
            double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi"));
            luas = luasSegitiga(alas, tinggi);
        } else if  (pilihan == 4){
            double diameter = Double.parseDouble(JOptionPane.showInputDialog("Masukkan diameter"));
            luas = luaslingkaran(diameter);
        } else {
            JOptionPane.showMessageDialog(null, "pilihan tidak ada!");
            System.exit(0);
        }    
            JOptionPane.showMessageDialog(null, "Luas bangun tersebut adalah " +luas);

    }
}
