package com.predios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "predios")
public class Predio {

    @Id
    @Column(name = "idpredio")
    private String idPredio;

    @Column(name = "numpredialanti")
    private String numPredialAnti;

    private String nupre;

    @Column(name = "idmunicipiopredios")
    private String idMunicipio;

    @Column(name = "numpredialnal")
    private String numPredialNal;

    @Column(name = "numfolio")
    private String numFolio;

    private String vereda;

    private String corregimiento;

    @Column(name = "centropoblado")
    private String centroPoblado;

    private String direccion;

    private String nombre;

    private Boolean pertenencia;

    @Column(name = "nombrepertenece")
    private String nombrePertenece;

    @Column(name = "areaprediosolicitud")
    private int areaPredioSolicitud;

    @Column(name = "tieneconflictos")
    private Boolean tieneConflictos;

    private String conflictos;


    public Predio() {
    }

    public Predio(String idPredio, String numPredialAnti, String nupre, String idMunicipio, String numPredialNal, String numFolio, String vereda, String corregimiento, String centroPoblado, String direccion, String nombre, Boolean pertenencia, String nombrePertenece, int areaPredioSolicitud, Boolean tieneConflictos, String conflictos) {
        this.idPredio = idPredio;
        this.numPredialAnti = numPredialAnti;
        this.nupre = nupre;
        this.idMunicipio = idMunicipio;
        this.numPredialNal = numPredialNal;
        this.numFolio = numFolio;
        this.vereda = vereda;
        this.corregimiento = corregimiento;
        this.centroPoblado = centroPoblado;
        this.direccion = direccion;
        this.nombre = nombre;
        this.pertenencia = pertenencia;
        this.nombrePertenece = nombrePertenece;
        this.areaPredioSolicitud = areaPredioSolicitud;
        this.tieneConflictos = tieneConflictos;
        this.conflictos = conflictos;
    }

    public String getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(String idPredio) {
        this.idPredio = idPredio;
    }

    public String getNumPredialAnti() {
        return numPredialAnti;
    }

    public void setNumPredialAnti(String numPredialAnti) {
        this.numPredialAnti = numPredialAnti;
    }

    public String getNupre() {
        return nupre;
    }

    public void setNupre(String nupre) {
        this.nupre = nupre;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNumPredialNal() {
        return numPredialNal;
    }

    public void setNumPredialNal(String numPredialNal) {
        this.numPredialNal = numPredialNal;
    }

    public String getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(String numFolio) {
        this.numFolio = numFolio;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }

    public String getCorregimiento() {
        return corregimiento;
    }

    public void setCorregimiento(String corregimiento) {
        this.corregimiento = corregimiento;
    }

    public String getCentroPoblado() {
        return centroPoblado;
    }

    public void setCentroPoblado(String centroPoblado) {
        this.centroPoblado = centroPoblado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(Boolean pertenencia) {
        this.pertenencia = pertenencia;
    }

    public String getNombrePertenece() {
        return nombrePertenece;
    }

    public void setNombrePertenece(String nombrePertenece) {
        this.nombrePertenece = nombrePertenece;
    }

    public int getAreaPredioSolicitud() {
        return areaPredioSolicitud;
    }

    public void setAreaPredioSolicitud(int areaPredioSolicitud) {
        this.areaPredioSolicitud = areaPredioSolicitud;
    }

    public Boolean getTieneConflictos() {
        return tieneConflictos;
    }

    public void setTieneConflictos(Boolean tieneConflictos) {
        this.tieneConflictos = tieneConflictos;
    }

    public String getConflictos() {
        return conflictos;
    }

    public void setConflictos(String conflictos) {
        this.conflictos = conflictos;
    }
}
