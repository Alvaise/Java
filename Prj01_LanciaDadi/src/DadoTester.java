
public class DadoTester {

	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		
		int vittorie = 0;
		int LANCI = 100000000                                                                    ;
		
		for(int i=0; i < LANCI;i++) {
			int res1 = d1.lancia();
			int res2 = d2.lancia();
		
		if (res1 == res2) {
			vittorie++;
			System.out.println("Hai Vinto");
		} else {
			System.out.println("Non Hai vinto");
		}
		}
		System.out.println("Ho lanciato "+ LANCI + " volte");
		System.out.println("Ho vinto "+ vittorie + " volte");
	}

}
