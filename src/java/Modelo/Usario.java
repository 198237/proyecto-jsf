/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estiven
 */
@Entity
@Table(name = "usario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usario.findAll", query = "SELECT u FROM Usario u"),
    @NamedQuery(name = "Usario.findByIdUsuario", query = "SELECT u FROM Usario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usario.findByNombreUsuario", query = "SELECT u FROM Usario u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usario.findByCorreoUsuario", query = "SELECT u FROM Usario u WHERE u.correoUsuario = :correoUsuario"),
    @NamedQuery(name = "Usario.findByContrasena", query = "SELECT u FROM Usario u WHERE u.contrasena = :contrasena")})
public class Usario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Size(max = 45)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Size(max = 45)
    @Column(name = "correoUsuario")
    private String correoUsuario;
    @Size(max = 45)
    @Column(name = "contrasena")
    private String contrasena;
    @JoinColumn(name = "rol_idRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Rol rolidRol;

    public Usario() {
    }

    public Usario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(Rol rolidRol) {
        this.rolidRol = rolidRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usario)) {
            return false;
        }
        Usario other = (Usario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Usario[ idUsuario=" + idUsuario + " ]";
    }
    
}
