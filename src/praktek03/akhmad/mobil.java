
package praktek03.akhmad;


public class mobil {
    private String merk;
    private String jenis;
    private double harga;
    
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Jenis \t: "+jenis+"\n"+
                "Harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
