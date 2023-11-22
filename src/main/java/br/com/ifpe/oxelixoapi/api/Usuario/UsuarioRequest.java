package br.com.ifpe.oxelixoapi.api.Usuario;

import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxelixoapi.modelo.usuario.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {
    
    private String nome;
    
   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;
     
   private String email;

   private String senha;
 
   public Usuario build() {

       return Usuario.builder()
               .nome(nome)
               .dataNascimento(dataNascimento)           
               .email(email)
               .senha(senha)             
               .build();
   }
}
