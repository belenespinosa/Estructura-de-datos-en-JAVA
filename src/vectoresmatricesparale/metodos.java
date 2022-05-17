
package vectoresmatricesparale;
import java.util.Scanner;

public class metodos {
    private Scanner entrada;
    private String[] estudiantes;
    private int [][] notas;
    public void cargar(){
        entrada=new Scanner(System.in);
        estudiantes=new String[1];
        notas=new int[1][3];
        for(int f=0 ;f<estudiantes.length; f++){
            System.out.println("Ingrese el NOMBRE del estudiante: "+(f+1));
            estudiantes[f]=entrada.next();
            for (int c = 0; c <notas[f].length; c++) {
                System.out.print("Ingrese la nota de la "+(c+1)+" asignatura: ");
                notas[f][c]=entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        System.out.println("NOTAS DE LOS ESTUDIANTES ");
        System.out.println("ESTUDIANTES\tED\t\tPOO\t\tISC");
        for(int f = 0; f<estudiantes.length; f++) {
            System.out.print("\n"+estudiantes[f]);
            for (int c = 0; c <notas[f].length; c++) {
                System.out.print("\t\t"+notas[f][c]);
                
            }
        }
    
        System.out.println("");
}
}
