package taxas;

public class Taxa {
	public float natalidade(float criancasNascidas, float habitantes) {
		return criancasNascidas * 1000 / habitantes;
	}
	public float mortalidade(float obitos, float habitantes) {
		return obitos * 1000 / habitantes;
	}
}
