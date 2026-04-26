class nasabah{
	private String norek; //Attribute
	static String nama;
	private int saldo;
	static String alamat;
	public nasabah (String norek, String nama, int saldo){ //konstruktor
		this.norek = norek;
		this.nama = nama;
		this.saldo = saldo;
	}

	public nasabah(String norek){ //overloading
		this.norek = norek;
	}
	
	public nasabah (String nama, String alamat){
		this.nama = nama;
		this.alamat= alamat;
	}
	public nasabah (int saldo){
		
	}
	public void setNorek(String norek){
		this.norek = norek;
	}

	String getNorek(){
		return norek;
	}

	public void setSaldo(int saldo){
		this.saldo=saldo;
	}

	int getSaldo (){
		return saldo;
	}
	String getNama(){
		return nama;
	}
	String getAlamat(){
		return nama;
	}
	void tampil(){
		System.out.println("No. Rekening	: " + norek);
		System.out.println("Nama Nasabah	: " + nama);
		System.out.println("Saldo		: " + saldo);
	}
}
// mingdep graphic user interface
class nasabahBeraksi{
	public static void main(String[] args){
		// nasabah nas = new nasabah("REK001", "Sunaryo", 100000000);
		nasabah nas2 = new nasabah("REK003");
		nasabah nas4 = new nasabah("Wilma", "Bima 2");
		nasabah nas3 = new nasabah (31111);
		nas3.setSaldo(70000);		// nas.setNorek("REK002");
		// nas.setSaldo(220000);
		System.out.println("No. Rekening	:" + nas2.getNorek());
		System.out.println("Nama		:" + nas4.getNama());
		System.out.println("Alamat		:" + nas4.getAlamat());
		System.out.println("Soldo		:" + nas3.getSaldo());
	}
}
