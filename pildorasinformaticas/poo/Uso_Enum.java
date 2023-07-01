package pildorasinformaticas.poo;
import java.util.*;

public class Uso_Enum {
    
//    enum Talla{MINI,MEDIANO,GRANDE, MUY_GRANDE};//DECLARAMOS UN TIPO ENUM-DECLARAMOS UNA INSTACIA PERTENECIENTE A LA CLASE ENUM

    enum Talla{
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");//DECLARAMOS LOS VALORES QUE ADMITE ENUM
        
        private Talla(String abreviatura){//CONSTRUCTOR RECIBE UNA VARIABLE DE TIPO STRING
            this.abreviatura=abreviatura;
        }
        
        public String dameAbreviatura(){//metodo 
            return abreviatura;
        }
        
        private String abreviatura;//variable encapsulada
    }
    
    public static void main(String[] args) {
        
//        Talla s= Talla.MINI;//ESTO ES UNA VARIABLE OBJETO
//        
//        Talla m= Talla.MEDIANO;
//        
//        Talla l= Talla.GRANDE;
//        
//        Talla xl= Talla.MUY_GRANDE;
        
           Scanner entrada= new Scanner(System.in);
           
           System.out.println("Escribe una talla:  MINI, MEDIANO, GRANDE Y MUY GRANDE");           
           
           String entradaDatos=entrada.next().toUpperCase();//toUpperCase pasa a mayuscula lo que pedimos en consola
           
           Talla laTalla=Enum.valueOf(Talla.class, entradaDatos);//UTILIZAMOS EL METODO VALUEOF QUE NOS DEVUELVE NOMBRE DE LA CONSTANTE ENUMERADA QUE PERTENCE ENTRDA DATOS
        
           System.out.println("Talla= " + laTalla);
           
           System.out.println("Abreviatura= " + laTalla.dameAbreviatura());
       
      
    }
    
}
