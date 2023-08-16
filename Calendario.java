import java.util.Scanner;
import java.util.Date;

public class Calendario {
		/*Desafío 1, Crear una rama con el nombre feature/desafio-java-1.
		El objetivo es trabajar la sintaxis de java, if/else y funciones, con validaciones sobre
		fechas
		1. Ingresar una fecha por teclado: dd/mm/yyyy (dd int, mm int, yyyy int)
		validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES
		validar que mes >=1 && <=12
		validar que año >=1900 && <= 2099
		Nota: Ojo, si el año es bisiesto, febrero tiene 29 días. Informar por consola si la fecha
		es correcta.	*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Ingrese e número del mes del 1- 12");
		int mes = s.nextInt();
		System.out.println("Ingrese el número del dia ");
		int numeroDias = s.nextInt();
		System.out.println("Ingrese e número del año " );
		int year = s.nextInt();
		
		
		if (mes ==1 || mes ==3 || mes == 5|| mes ==7 || mes ==8 || mes ==10 || mes ==12) {
			numeroDias = 31;
		}else if (mes ==4 || mes == 6 || mes == 9 || mes == 11) {
			numeroDias = 30;
		} else if (mes ==2) {
			if (year%400 == 0 || ((year % 4 ==0) && !(year % 100 == 0))) {
			numeroDias = 29;
			System.out.println("el año NO es bisiesto");
			}else {
			numeroDias = 28;
			System.out.println("el año es bisiesto");
			}
		}

    }
		
		}