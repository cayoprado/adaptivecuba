package br.com.adaptive.adptivecuba.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "ADPTIVECUBA_NOTICIA")
@Entity(name = "adptivecuba$Noticia")
public class Noticia extends StandardEntity {
    private static final long serialVersionUID = -7122926444074700886L;

    @NotNull
    @Column(name = "TITULO", nullable = false)
    protected String titulo;

    @NotNull
    @Lob
    @Column(name = "TEXTO", nullable = false)
    protected String texto;

    @NotNull
    @Column(name = "IS_DESTAQUE", nullable = false)
    protected Boolean isDestaque = false;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setIsDestaque(Boolean isDestaque) {
        this.isDestaque = isDestaque;
    }

    public Boolean getIsDestaque() {
        return isDestaque;
    }


}