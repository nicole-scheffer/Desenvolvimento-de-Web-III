package pagamento;

public class Forma {
	public float aVista(float valor) {
		return valor - (valor * 0.1f);
	}
	public float aPrazo30(float valor) {
		return valor + (valor * 0.03f);
	}
	public float aPrazoParcelado(float valor) {
		return valor + (valor * 0.015f);
	}
}
