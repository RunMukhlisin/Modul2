package modul2_202357201036;

public class methodx {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public static void main(String[] args) {
        methodx mt = new methodx();
        System.out.print(mt.luas_lingkaran(20));
        System.exit(0);
    }
        
}
