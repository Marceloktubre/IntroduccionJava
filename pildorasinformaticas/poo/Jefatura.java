package poo;

import pildorasinformaticas.poo.Jefes;
import pildorasinformaticas.poo.Trabajadores;

 public class Jefatura extends Empleadoss implements Jefes{// creo una clase Jefatura y hereda de la clase Empleadoss y la interfaz jefes

    private double incentivo;// una variable de tipo double

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {//constructor

        super(nom, sue, agno, mes, dia);

    }

    public void estableceIncentivo(double b) {//metodo setter 
        
        incentivo = b;
    }
    
    @Override
    public double dameSueldo(){//metodo Getter
        
        double sueldoJefe= super.dameSueldo();//super. llamamos al metodo dameSueldo de la clase padre
   
        return sueldoJefe + incentivo;//
    }

    @Override
    public String tomar_decisiones(String decision) {//implementamos el metodo de la interfaz Jefes
          
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }

    @Override
    public double establece_bonus(double gratificacion) {//implementamos el metodo de la interfaz Trabajadores
        double prima=2000;    
        return Trabajadores.bonus_base+gratificacion+prima ; 
    }
    
    
    
    

}
