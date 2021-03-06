public class inter_polimo {
	public static void main(String args[]) {
		Police police[] = new Police[2];
		police[0] = new Policeman();
		police[1] = new Policedog();

		for (int i = 0; i < police.length; i++){
			police[i].investigate();
		}
		for (int i = 0; i < police.length; i++){
			if (police[i] instanceof Policeman)
				System.out.println("警察官です");
			else
				System.out.println("警察官ではありません");
		}
	}
}

interface Police {
	void investigate();
}

class Policeman implements Police {
	public void investigate() {
		System.out.println("人間は聞き込みをする");
	}
}

class Policedog implements Police {
	public void investigate() {
		System.out.println("犬は匂いを辿る");
	}
}
