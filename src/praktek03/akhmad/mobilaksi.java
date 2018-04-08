
package praktek03.akhmad;


public class mobilaksi {
    public static void main(String[] args) {
        mobil r = new mobil();
        r.setMerk("Toyota");
        r.setJenis("Yaris");
        r.setHarga(5000);
        
        r.cetakInfo();
        
         System.out.print("Merknya \t: ");
         System.out.println(r.getMerk());
         System.out.print("Jenisnya \t: ");
        System.out.println(r.getJenis());
        System.out.print("Harganya \t: ");
        System.out.println(r.getHarga());
        
        mobilluarnegeri kw = new mobilluarnegeri();
        
        kw.setMerk("Honda");
        kw.setJenis("Jazz");
        kw.setHarga(6000);
        kw.setNegara("Jepang");
        kw.cetakInfo();
        
        System.out.println("Negara Pembuatnya adalah \t:"+kw.getNegara());
        kw.throttle();
        }
    
}
