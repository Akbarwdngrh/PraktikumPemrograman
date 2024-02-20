import java.util.Calendar;

public class Tanggal{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Waktu sekarang: " + calendar.getTime());

        int tahun = calendar.get(Calendar.YEAR);
        int bulan = calendar.get(Calendar.MONTH) + 1; 
        int tanggal = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Tanggal: " + tanggal + "/" + bulan + "/" + tahun);

        int jam = calendar.get(Calendar.HOUR_OF_DAY);
        int menit = calendar.get(Calendar.MINUTE);
        int detik = calendar.get(Calendar.SECOND);

        System.out.println("Waktu: " + jam + ":" + menit + ":" + detik);

        calendar.add(Calendar.MONTH, 1);
        System.out.println("Tanggal setelah ditambah 1 bulan: " + calendar.getTime());
    }
}
