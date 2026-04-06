class nasabah{
	String norek; //Attribute
	String nama;
	int saldo;
	public nasabah (String norek, String nama, int saldo){ //konstruktor
		this.norek = norek;
		this.nama = nama;
		this.saldo = saldo;
	}
	void tampil(){
		System.out.println("No. Rekening	: " + norek);
		System.out.println("Nama Nasabah	: " + nama);
		System.out.println("Saldo		: " + saldo);
	}
}

class nasabahBeraksi{
	public static void main(String[] args){
		nasabah nas = new nasabah("REK001", "Sunaryo", 100000000);
		nas.tampil();
	}
}
