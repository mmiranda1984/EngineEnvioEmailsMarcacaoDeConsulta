/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.util;

/**
 *
 * @author mmiranda1984
 */
public class ConstantsUtil {

    private static final String corpoEmailConsulta = 
            "<html><body>Prezado(a) <b><nomepaciente></b>, <br/><br/>" +
            "   Viemos lembrar de sua consulta marcada para o data <dataconsulta> às <horaconsulta>.<br/><br/>"+
            "Esse é apenas um e-mail informativo, favor não respondê-lo. <br/><br/>"+
            "Atenciosamente, <br/>"+
            "Empresa: <nomeempresa> <br>"+
            "Filial: <nomefilial> <br>"+
            "------------------------------"+
            "Marcação de Consultas <br/>"+
            "www.marcacaodeconsultas.com.br</body></html>";
    private static final String tituloEmailConsulta = 
            "Marcação de Consulta - Lembrete de Consulta!!!";

    /**
     * @return the corpoEmailConsulta
     */
    public static String getCorpoEmailConsulta() {
        return corpoEmailConsulta;
    }

    /**
     * @return the tituloEmailConsulta
     */
    public static String getTituloEmailConsulta() {
        return tituloEmailConsulta;
    }
    
    
}
