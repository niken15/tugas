
package nim;


import javax.swing.JOptionPane;

public class NIM
{
        public static void main(String args[]) 
        {
            String  tahunmasuk;
            String jurusan;
            String jenjang;
            String fakultas;
            String jeniskelamin;
            String nomorurutmahasiswa;
            String cetak;
                    
            String nama = JOptionPane.showInputDialog("Masukkan Nama Anda :");
            String nim = JOptionPane.showInputDialog("Masukkan NIM Anda   :");
        
             tahunmasuk = nim.substring(0,2);
             tahunmasuk = "20" + tahunmasuk;
             
             jurusan =  nim.substring(2,3);
             if (jurusan .equals("1") )
             jurusan = " Tekhnik Informatika";
             else if (jurusan .equals("2") )
             jurusan = " Teknik Industri";
             else if (jurusan .equals("3") )
             jurusan = " Sistem Informasi";
             else if (jurusan .equals("4") )
             jurusan = " Matematika";
             else if (jurusan .equals("5") )
             jurusan = " Teknik Elektro";
             
             jenjang =  nim.substring(0,1);
             if (jenjang.equals("1"))
             jenjang = " S1 (Sarjana)";
             else if (jenjang.equals("2"))
             jenjang = " S2 (Master)";
             else if (jenjang.equals("3"))
             jenjang = " S3 (Doktor)";
             
             fakultas =  nim.substring(4,5);
             if (fakultas .equals("1") )
             fakultas = " Tabriyah dan Keguruan";
             else if (fakultas .equals("2") )
             fakultas = " Syariah dan Hukum";
             else if (fakultas .equals("3") )
             fakultas = " Ushuluddin";
             else if (fakultas .equals("4") )
             fakultas = " Dakwah dan Komunikasi";
             else if (fakultas .equals("5") )
             fakultas = " Sains dan Teknologi";
             else if (fakultas .equals("6") )
             fakultas = " Psikologi";
             else if (fakultas .equals("7") )
             fakultas = " Ekonomi dan Ilmu Sosial";
             else if (fakultas .equals("8") )
             fakultas = " Pertanian dan Perternakan";
             
             jeniskelamin =  nim.substring(5,6);
             if (jeniskelamin.equals("1"))
             jeniskelamin = " Laki-Laki ";
             else if (jeniskelamin.equals("2"))
             jeniskelamin = " Perempuan ";
             
            nomorurutmahasiswa =  nim.substring(6,7);
             if (nomorurutmahasiswa .equals("1") )
             nomorurutmahasiswa = " 1";
             else if (nomorurutmahasiswa .equals("2") )
             nomorurutmahasiswa = " 2";
             else if (nomorurutmahasiswa .equals("3") )
             nomorurutmahasiswa = " 3";
             else if (nomorurutmahasiswa .equals("4") )
             nomorurutmahasiswa = " 4";
             else if (nomorurutmahasiswa .equals("5") )
             nomorurutmahasiswa = " 5";
             else if (nomorurutmahasiswa .equals("6") )
             nomorurutmahasiswa = " 6";
             else if (nomorurutmahasiswa .equals("7") )
             nomorurutmahasiswa = " 7";
             else if (nomorurutmahasiswa .equals("8") )
             nomorurutmahasiswa = " 8";
             else if (nomorurutmahasiswa .equals("9") )
             nomorurutmahasiswa = " 9";

                 
        JOptionPane.showMessageDialog( null,"Nim :"+nim +"\n"+ "Nama :"+ nama +"\n" +"tahun masuk :"+tahunmasuk +"\n"+ "jurusan :"+ jurusan +"\n"+ "Jenjang :"+ jenjang +"\n"+"Fakultas :"+ fakultas +"\n"+"Jenis Kelamin :"+jeniskelamin +"\n"+"Nomor Urut Mahasiswa : "+nomorurutmahasiswa,"Hasil",JOptionPane.INFORMATION_MESSAGE ); 
            
        }
}