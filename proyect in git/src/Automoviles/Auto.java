package Automoviles;

import java.util.*;

/**
 *
 * @author lalo
 */
public class Auto {
    private String codigoUnico;
    private String year;
    private String type;
    private String marca;
    private String modelo;
    private String version;
    private String puertas;
    private String combustible;
    private String transmision;
    private String precioPatente;    //precio patente (permiso de circulación)
    private String tasacionFiscal;   //precio vehiculo
    
    public Auto() {
    }

    public Auto(String codigoUnico, String year, String type, String marca, String modelo, String version,String puertas, String combustible, String transmision,String precioPatente,String tasacionFiscal) {
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

    public String getYear() {
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

    public String getPuertas() {
        return puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getPrecioPatente() {
        return precioPatente;
    }

    public String getTasacionFiscal() {
        return tasacionFiscal;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setYear(String year) {
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

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setPrecioPatente(String precioPatente) {
        this.precioPatente = precioPatente;
    }

    public void setTasacionFiscal(String tasacionFiscal) {
        this.tasacionFiscal = tasacionFiscal;
    }

    

}