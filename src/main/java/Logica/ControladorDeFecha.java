
package Logica;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ControladorDeFecha {
    private Date fechaActual;

    public ControladorDeFecha() {
        Calendar dia = Calendar.getInstance(TimeZone.getTimeZone("America/Chile"));
        this.fechaActual = dia.getTime();
    }

    public Date getFechaActual() {
        return this.fechaActual; 
    }
    
    public boolean validarFechaFutura(int dia, int mes){
        return (getFechaActual().after(crearFecha(dia, mes)));
    }
    public boolean validarFechaPasada(int dia, int mes){
        return (getFechaActual().before(crearFecha(dia, mes)));
    }
    public boolean validarFechaActual(int dia, int mes){
        return (getFechaActual().equals(crearFecha(dia, mes)));
    }
    
    private Date crearFecha(int dia, int mes){
        Calendar auxiliar = Calendar.getInstance();
        auxiliar.set(Calendar.YEAR, 2018);
        auxiliar.set(Calendar.MONTH, mes - 1);
        auxiliar.set(Calendar.DAY_OF_MONTH, dia);
        auxiliar.set(Calendar.HOUR_OF_DAY, 0);
        auxiliar.set(Calendar.MINUTE, 0);
        auxiliar.set(Calendar.SECOND, 0);
        auxiliar.set(Calendar.MILLISECOND, 0);
        return auxiliar.getTime();
    }
}