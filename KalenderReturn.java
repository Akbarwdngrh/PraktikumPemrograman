import java.util.Calendar;

public class KalenderReturn {
    public static void main(String[] args) {
        String waktuSekarang = getWaktuSekarang();
        System.out.println("Waktu sekarang: " + waktuSekarang);

        String tanggalSekarang = getTanggalSekarang();
        System.out.println("Tanggal: " + tanggalSekarang);

        String waktuSekarangDetail = getWaktuSekarangDetail();
        System.out.println("Waktu: " + waktuSekarangDetail);

        String tanggalSetelahSatuBulan = getTanggalSetelahSatuBulan();
        System.out.println("Tanggal setelah ditambah 1 bulan: " + tanggalSetelahSatuBulan);
    }

    private static String getWaktuSekarang() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime().toString();
    }

    private static String getTanggalSekarang() {
        Calendar calendar = Calendar.getInstance();
        int tahun = calendar.get(Calendar.YEAR);
        int bulan = calendar.get(Calendar.MONTH) + 1;
        int tanggal = calendar.get(Calendar.DAY_OF_MONTH);
        return tanggal + "/" + bulan + "/" + tahun;
    }

    private static String getWaktuSekarangDetail() {
        Calendar calendar = Calendar.getInstance();
        int jam = calendar.get(Calendar.HOUR_OF_DAY);
        int menit = calendar.get(Calendar.MINUTE);
        int detik = calendar.get(Calendar.SECOND);
        return jam + ":" + menit + ":" + detik;
    }

    private static String getTanggalSetelahSatuBulan() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime().toString();
    }
}
