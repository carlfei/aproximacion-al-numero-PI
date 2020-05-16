package pi_cuartos;

public class PiCuartos {

	public double metodo_dividir(double nn, int t) {
		double nn2 = 0;
		String numer = Double.toString(nn);

		if (t == 1) {
			String decimales = "1";

			for (int y = 0; y < numer.length() - 2; y++) {
				decimales = decimales + "0";
			}
			nn2 = Double.valueOf(decimales);
		}

		if (t == 0) {
			if (numer.length() >= 6) {
				numer = numer.substring(0, numer.length() - 5);
			} else {
				numer = numer.substring(0, numer.length());
			}
			nn2 = Double.valueOf(numer);
		}
		return nn2;
	}

	public static void main(String[] args) {

		PiCuartos mi_division = new PiCuartos();
		double x = 1, y = 1, z, delta_x, delta_y = 0, ro, arco = 0, mi_pi_cuartos = 0;
		double mi_alfa = 0;
		z = x;
		double particion_intervalo = 88888888;
		double div = mi_division.metodo_dividir(particion_intervalo, 1);
		double resto = div / particion_intervalo;
		resto = mi_division.metodo_dividir(resto, 0);
		delta_x = (1 / div) * resto;
		ro = 2 - (z + delta_x);
		int ciclos = (int) particion_intervalo;

		for (int i = 0; i < ciclos; i++) {
			mi_alfa = 4 - (ro * ro) - ((x + delta_x) * (x + delta_x));
			mi_alfa = Math.sqrt(mi_alfa / 2);
			delta_y = y - mi_alfa;
			y = mi_alfa;
			x = x + delta_x;
			arco = Math.sqrt((delta_x * delta_x) + (delta_y * delta_y));
			mi_pi_cuartos = mi_pi_cuartos + arco;
			z = x;
			ro = 2 - (z + delta_x);
		}

		System.out.println("  y: " + y);
		System.out.println("  x: " + x);
		System.out.println(" pi:  " + mi_pi_cuartos * 2);

	}
}