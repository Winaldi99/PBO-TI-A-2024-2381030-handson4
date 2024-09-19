public class ContohReturnValue {
    public static void sebutkanNama() {
        System.out.println("Nama saya Winaldi");
    }

    public static int kembalikanAngka() {
        int hasilPerkalian = 20 * 3;
        return hasilPerkalian;
    }

    public static void main(String[] args) {
        System.out.println(kembalikanAngka());
        sebutkanNama();
    }
}
