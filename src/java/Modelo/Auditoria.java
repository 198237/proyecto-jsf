/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estiven
 */
@Entity
@Table(name = "auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findByIdAuditoria", query = "SELECT a FROM Auditoria a WHERE a.idAuditoria = :idAuditoria"),
    @NamedQuery(name = "Auditoria.findByUsuarioAuditoria", query = "SELECT a FROM Auditoria a WHERE a.usuarioAuditoria = :usuarioAuditoria"),
    @NamedQuery(name = "Auditoria.findByDescripcionAuditoria", query = "SELECT a FROM Auditoria a WHERE a.descripcionAuditoria = :descripcionAuditoria"),
    @NamedQuery(name = "Auditoria.findByFechaAuditoria", query = "SELECT a FROM Auditoria a WHERE a.fechaAuditoria = :fechaAuditoria")})
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAuditoria")
    private Integer idAuditoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuarioAuditoria")
    private String usuarioAuditoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcionAuditoria")
    private String descripcionAuditoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAuditoria")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAuditoria;

    public Auditoria() {
    }

    public Auditoria(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Auditoria(Integer idAuditoria, String usuarioAuditoria, String descripcionAuditoria, Date fechaAuditoria) {
        this.idAuditoria = idAuditoria;
        this.usuarioAuditoria = usuarioAuditoria;
        this.descripcionAuditoria = descripcionAuditoria;
        this.fechaAuditoria = fechaAuditoria;
    }

    public Integer getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getUsuarioAuditoria() {
        return usuarioAuditoria;
    }

    public void setUsuarioAuditoria(String usuarioAuditoria) {
        this.usuarioAuditoria = usuarioAuditoria;
    }

    public String getDescripcionAuditoria() {
        return descripcionAuditoria;
    }

    public void setDescripcionAuditoria(String descripcionAuditoria) {
        this.descripcionAuditoria = descripcionAuditoria;
    }

    public Date getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(Date fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuditoria != null ? idAuditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.idAuditoria == null && other.idAuditoria != null) || (this.idAuditoria != null && !this.idAuditoria.equals(other.idAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Auditoria[ idAuditoria=" + idAuditoria + " ]";
    }
    
}
