package proyect.in.git;

import java.util.*;

/**
 *
 * @author lalo
 */
public class Auto {
    //Wena
    private String codigoUnico;
    private int year;
    private String type;
    private String marca;
    private String modelo;
    private String version;
    private int puertas;
    private String combustible;
    private String transmision;
    private long precioP;    //precio patente (permiso de circulación)
    private long precioV;   //precio vehiculo
    private ArrayList listaConcesionarios;

    public Auto() {
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public long getPrecioP() {
        return precioP;
    }

    public void setPrecioP(long precioP) {
        this.precioP = precioP;
    }

    public long getPrecioV() {
        return precioV;
    }

    public void setPrecioV(long precioV) {
        this.precioV = precioV;
    }

    public ArrayList getListaConcesionarios() {
        return listaConcesionarios;
    }

    public void setListaConcesionarios(ArrayList listaConcesionarios) {
        this.listaConcesionarios = listaConcesionarios;
    }
    
    public void deleteListaConcesionarios(){
            
    }    
    
}
