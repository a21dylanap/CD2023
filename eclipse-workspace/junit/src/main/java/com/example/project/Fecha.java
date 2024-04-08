package com.example.project;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public boolean valida() {
		return calcularAños();

	}

	private boolean calcularAños() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;

		int diasMes = 0;

		switch (mes) {

		case 1, 3, 5, 7, 8, 10, 12:
			diasMes = 31;
			break;

		case 4, 6, 9, 11:
			diasMes = 30;
			break;

		case 2:

			if (calcularAñoBisiesto())

				diasMes = 29;

			else
				diasMes = 28;

			break;

		}

		return diasMes >= dia;
	}

	private boolean calcularAñoBisiesto() {
		return (anio % 400 == 0) ||

				((anio % 4 == 0) && (anio % 100 != 0));
	}

}
