package com.ipn.mx.clases;
// Generated 5/01/2016 03:54:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Genero generated by hbm2java
 */
@Entity
@Table(name="genero"
    ,catalog="proyecto"
)
public class Genero  implements java.io.Serializable {


     private Integer idGenero;
     private String nombreGenero;

    public Genero() {
    }

	
    public Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idGenero", unique=true, nullable=false)
    public Integer getIdGenero() {
        return this.idGenero;
    }
    
    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    
    @Column(name="nombreGenero", nullable=false, length=45)
    public String getNombreGenero() {
        return this.nombreGenero;
    }
    
    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

}


