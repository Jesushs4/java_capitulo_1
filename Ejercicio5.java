/**
 * Ejercicio 5: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asigna-
 * tura de un color diferentes.
 * @author Jesús Herrera Sánchez
 */
public class Ejercicio5 {
    public static void main (String args[]) {
        System.out.println("┌────────┬──────────┬────────────┬────────────┬────────────┬────────────┐");
        System.out.println("│  Hora  │  Lunes   │   Martes   │  Miercoles │   Jueves   │   Viernes  │");
        System.out.println("├────────┼──────────┼────────────┼────────────┼────────────┼────────────┤");
        System.out.println("|  8:15  | \033[32m Program.\033[37m|\033[31mSist.Inform.\033[37m|\033[34mEnt. de des.\033[37m|  \033[32mProgram.\033[37m  |     \033[33mFOL    \033[37m|");
        System.out.println("|  9:15  \033[37m| \033[32mProgram. \033[37m|\033[31mSist.Inform.\033[37m|\033[34mEnt. de des.\033[37m|  \033[32mProgram.  \033[37m|     \033[33mFOL    \033[37m|");
        System.out.println("|  10:15 \033[37m|\033[36mLeng.Marc.\033[37m|\033[31mSist.Inform.\033[37m|  \033[32mProgram.  \033[37m| \033[36mLeng.Marc. \033[37m|     \033[33mFOL    \033[37m|");
        System.out.println("|  11:15 \033[37m|  Recreo  \033[37m|   Recreo   \033[37m|   Recreo   \033[37m|   Recreo   \033[37m|   Recreo   \033[37m|");
        System.out.println("|  11:45 \033[37m|\033[36mLeng.Marc.\033[37m|  \033[32mProgram.  \033[37m|  \033[32mProgram.  \033[37m| \033[36mLeng.Marc. \033[37m|\033[31mSist.Inform.\033[37m|");
        System.out.println("|  12:45 \033[37m|   \033[35mBBDD   \033[37m|  \033[32mProgram.  \033[37m|    \033[35mBBDD    \033[37m|    \033[35mBBDD    \033[37m|\033[31mSist.Inform.\033[37m|");
        System.out.println("|  13:45 \033[37m|   \033[35mBBDD   \033[37m|\033[34mEnt. de des.\033[37m|    \033[35mBBDD    \033[37m|    \033[35mBBDD    \033[37m|\033[31mSist.Inform.\033[37m|");
        System.out.println("└────────┴──────────┴────────────┴────────────┴────────────┴────────────┘");
    }
}
