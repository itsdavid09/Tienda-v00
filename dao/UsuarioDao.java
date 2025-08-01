package com.tienda.dao; 

 

import com.tienda.domain.Usuario; 
import org.springframework.data.jpa.repository.JpaRepository; 

 

public interface UsuarioDao extends JpaRepository<Usuario, Long> { 
    Usuario ﬁndByUsername(String username); 
     
    Usuario ﬁndByUsernameAndPassword(String username, String Password); 

 

    Usuario ﬁndByUsernameOrCorreo(String username, String correo); 

 

    boolean existsByUsernameOrCorreo(String username, String correo); 
} 