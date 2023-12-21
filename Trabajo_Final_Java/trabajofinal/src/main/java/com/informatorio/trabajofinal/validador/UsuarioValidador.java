package com.informatorio.trabajofinal.validador;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.informatorio.trabajofinal.entity.Usuario;

@Component
public class UsuarioValidador implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Usuario usuario = (Usuario) target;

        if (StringUtils.isBlank(usuario.getNombre())) {
            errors.rejectValue("nombre", "El nombre es obligatorio");
        }

        if (StringUtils.isBlank(usuario.getUsername())) {
            errors.rejectValue("username", "El nombre de usuario es obligatorio");
        }

        
    }
}
