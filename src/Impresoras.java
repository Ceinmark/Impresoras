import java.util.Scanner;
public class Impresoras {
String marca,interfazConexion;
float velocidadImpresion,peso;
int bufferMemoria;
char color;
Impresoras(){
	Scanner teclado;
	teclado = new Scanner (System.in);
	System.out.print("Introduce la marca de la Impresora: ");
	marca= teclado.nextLine();
	System.out.print("Introduce una velocida de impresion en páginas por minuto: ");
	velocidadImpresion=teclado.nextFloat();
	System.out.print("Introduce el peso de la impresora: ");
	peso=teclado.nextFloat();
	System.out.print("Introduce el color de la impresora: ");
	color=teclado.next().charAt(0);
	System.out.print("Introduce el buffer de memoria de la impresora: ");
	bufferMemoria=teclado.nextInt();
	teclado.nextLine();
	System.out.print("Introduce la interfaz de conexion: ");
	interfazConexion=teclado.nextLine();
}
void colorImpresora(){
	System.out.println("-------------------------------------------");
	switch (color){
	case 'r':
		System.out.println("El color elegido es ROJO");
		break;
	case 'a':
		System.out.println("El color elegido es AZUL");
		break;
	case 'b':
		System.out.println("El color elegido es el BLANCO");
		break;
	case 'n':
		System.out.println("El color elegido es NEGRO");
		break;
	case 'v':
		System.out.println("El color elegido es VIOLETA");
		break;
	case 'R':
		System.out.println("El color elegido es ROJO");
		break;
	case 'A':
		System.out.println("El color elegido es AZUL");
		break;
	case 'B':
		System.out.println("El color elegido es el BLANCO");
		break;
	case 'N':
		System.out.println("El color elegido es NEGRO");
		break;
	case 'V':
		System.out.println("El color elegido es VIOLETA");
		break;
	default:
		System.out.println("Color asignado no disponible, teclee un color correcto ");
	}
}
void mostrarImpresora(){
	System.out.println("-------------------------------------------");
	System.out.println("La marca de la impresora es: " + marca);
	System.out.println("Tiene una velocidad de impresion de " + velocidadImpresion + " paginas por segundo");
	System.out.println("La impresora pesa " + peso + "Kg y tiene como color el " + color );
	System.out.println("Finalmente, tiene un buffer de memoria de " + bufferMemoria + "MB y una interfaz de conexion de tipo: " + interfazConexion);
}
void mostrarMarcaColor(){
	System.out.println("-------------------------------------------");
	System.out.println("La marca de la impresora es: " + marca);
	if (color == 'r'|| color == 'R')
		System.out.println("El color elegido es ROJO");
	else if (color == 'a'|| color == 'A')
		System.out.println("El color elegido es AZUL");
	else if (color == 'b'|| color == 'B')
		System.out.println("El color elegido es BLANCO");
	else if (color == 'n'|| color == 'N')
		System.out.println("El color elegido es NEGRO");
	else if (color == 'v' || color == 'V')
		System.out.println("El color elegido es VIOLETA");
	else
		System.out.println("Color no aceptado, vuelva a introducir un color valido.");
}
void mostrarMarcaColorPeso(){
	System.out.println("-------------------------------------------");
	System.out.println("La marca de la impresora es " + marca);
	System.out.println("El peso de la impresora es " + peso + "Kg");
	switch (color){
	case 'r':
		System.out.println("El color elegido es ROJO");
		break;
	case 'a':
		System.out.println("El color elegido es AZUL");
		break;
	case 'b':
		System.out.println("El color elegido es el BLANCO");
		break;
	case 'n':
		System.out.println("El color elegido es NEGRO");
		break;
	case 'v':
		System.out.println("El color elegido es VIOLETA");
		break;
	case 'R':
		System.out.println("El color elegido es ROJO");
		break;
	case 'A':
		System.out.println("El color elegido es AZUL");
		break;
	case 'B':
		System.out.println("El color elegido es el BLANCO");
		break;
	case 'N':
		System.out.println("El color elegido es NEGRO");
		break;
	case 'V':
		System.out.println("El color elegido es VIOLETA");
		break;
	default:
		System.out.println("Color asignado no disponible, teclee un color correcto ");
	}
	System.out.println("-------------------------------------------");
}
public static void main (String[]args){
	Impresoras impresora1;
	impresora1 = new Impresoras();
	impresora1.colorImpresora();
	impresora1.mostrarImpresora();
	impresora1.mostrarMarcaColor();
	impresora1.mostrarMarcaColorPeso();
	Impresoras impresora2;
	impresora2 = new Impresoras();
	impresora2.colorImpresora();
	impresora2.mostrarImpresora();
	impresora2.mostrarMarcaColor();
	impresora2.mostrarMarcaColorPeso();
}
}
