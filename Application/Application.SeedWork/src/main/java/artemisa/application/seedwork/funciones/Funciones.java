package artemisa.application.seedwork.funciones;

import artemisa.domain.sistema.entities.MensajeSistema;
import artemisa.domain.sistema.entities.Politica;

import java.util.List;

public class Funciones {
    public static String formatearCampo(int numero, String relleno, String cantidad) {
        String cadena = "";
        String formato = "%" + relleno + cantidad + "d";
        cadena = String.format(formato, numero);
        return cadena;
    }


    public static MensajeSistema obtenerMensajeSistema(List<MensajeSistema> listaMensaje, String codigoMensaje) {
        MensajeSistema mensajeSistema = null;
        for(MensajeSistema ms :listaMensaje) {
            if(ms.getCodigoA().equals(codigoMensaje)) {
                mensajeSistema = ms;
                break;
            }
        }
        return mensajeSistema;
    }

    public static Politica obtenerPoliticas(List<Politica> listaPoliticas, String codigoPolitica) {
        Politica politica = null;
        for(Politica pol : listaPoliticas) {
            if(pol.getCodigoA().equals(codigoPolitica)) {
                politica = pol;
                break;
            }
        }
        return politica;
    }
}
