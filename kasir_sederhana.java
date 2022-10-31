//kasir sederhana dengan JOption Pane
package latihan;
import javax.swing.JOptionPane;

public class kasir_sederhana {  
    public static void main(String[] args) {
        String nama_barang;
        int jumlah_belanja;
        float harga_satuan,harga_total,diskon,harga_setelah_diskon,total_diskon;
        
        try{
            //input nama barang
            nama_barang=JOptionPane.showInputDialog("Masukan Nama Barang : ");
            
            //input jumnlah barang di beli
            jumlah_belanja=Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang di Beli : "));
            
            //input harga barang
            harga_satuan=Float.parseFloat(JOptionPane.showInputDialog("Masukan Harga Barang : "));
            
            //input diskon
            diskon=Float.parseFloat(JOptionPane.showInputDialog("Masukan Diskon: "));
            JOptionPane.showMessageDialog(null,"Diskon : " + diskon);
            
            //menghitung total belanja
            harga_total = harga_satuan*jumlah_belanja;
            //menghitung harga setelah diskon
            
            total_diskon=harga_total*diskon;
            harga_setelah_diskon=harga_total-total_diskon;
            //output di Terminal
            System.out.println("Nama Barang : " +nama_barang);
            System.out.println("Jumlah Barang : " +jumlah_belanja);
            System.out.println("Harga Satuan: " +harga_satuan);
            System.out.println("Total Belanja: " +harga_total);
            System.out.println("============================");
            System.out.println("Diskon Sebesar: " +total_diskon);
            System.out.println("Harga Setelah Diskon: " + harga_setelah_diskon);
                    
        }catch(Exception e){ 
            System.out.print("EROR BRO: "+e.toString());
        }
    }  
}
