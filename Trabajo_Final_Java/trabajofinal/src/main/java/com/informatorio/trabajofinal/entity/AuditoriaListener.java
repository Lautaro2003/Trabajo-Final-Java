package com.informatorio.trabajofinal.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class AuditoriaListener {

    @PrePersist
    public void prePersist(Auditoria auditoria) {
        auditoria.setFechaCreacion(new Date());
        auditoria.setFechaModificacion(new Date());
    }

    @PreUpdate
    public void preUpdate(Auditoria auditoria) {
        auditoria.setFechaModificacion(new Date());
    }
}
