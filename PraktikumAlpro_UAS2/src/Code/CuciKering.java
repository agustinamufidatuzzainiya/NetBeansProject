package Code;
public class CuciKering extends Harga_jenis_laundry{
    private String Harga;
    @Override
    public void setHargalaundry(String Harga){
        this.Harga=Harga;
    }
    public String getHargalaundry(){
        return Harga;
    }
}