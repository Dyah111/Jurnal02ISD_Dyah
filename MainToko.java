public class MainToko {
    public static void main(String[] args) {
        array<ATK> listatk = new array<ATK>();
        array<Bag> listbag = new array<Bag>();

        listatk.addData(new ATK("A001", "pulpen", "snowball", 9));
        listatk.addData(new ATK("A002", "pulpen", "snowball", 9));
        listatk.addData(new ATK("A003", "pulpen", "snowball", 9));
        listatk.addData(new ATK("A004", "pulpen", "snowball", 9));
        listatk.addData(new ATK("A005", "pulpen", "snowball", 9));

        listbag.addData(new Bag("C001", "tas", "jlalala", 3));
        listbag.addData(new Bag("C003", "tas", "jlalala", 3));
        listbag.addData(new Bag("C004", "tas", "jlalala", 3));
        listbag.addData(new Bag("C005", "tas", "jlalala", 3));
        listbag.addData(new Bag("C002", "tas", "jlalala", 3));

        listbag.removeData(new Bag("C001", "tas", "jlalala", 3));
        listatk.editData(new ATK("A004", "pulpen", "snowball", 9), new ATK("A008", "pulpen", "snowball", 9));

        listbag.printData();
    }
}