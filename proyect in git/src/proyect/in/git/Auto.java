package proyect.in.git;

import java.util.*;

/**
 *
 * @author lalo
 */
public class Auto {
    private String codigoUnico;
    private int year;
    private String type;
    private String marca;
    private String modelo;
    private String version;
    private int puertas;
    private String combustible;
    private String transmision;
    private long precioPatente;    //precio patente (permiso de circulación)
    private long tasacionFiscal;   //precio vehiculo

    public Auto() {
    }

    public Auto(String codigoUnico, int year, String type, String marca, String modelo, String version, int puertas, String combustible, String transmision, long precioPatente, long tasacionFiscal) {
        this.codigoUnico = codigoUnico;
        this.year = year;
        this.type = type;
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.puertas = puertas;
        this.combustible = combustible;
        this.transmision = transmision;
        this.precioPatente = precioPatente;
        this.tasacionFiscal = tasacionFiscal;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVersion() {
        return version;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public long getPrecioPatente() {
        return precioPatente;
    }

    public long getTasacionFiscal() {
        return tasacionFiscal;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setPrecioPatente(long precioPatente) {
        this.precioPatente = precioPatente;
    }

    public void setTasacionFiscal(long tasacionFiscal) {
        this.tasacionFiscal = tasacionFiscal;
    }

    

}