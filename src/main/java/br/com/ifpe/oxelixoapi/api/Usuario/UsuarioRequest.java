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
   
   private String cpf;
   
   private String foneCelular;
   
   private String email;

   private String sexo;

   private String senha;

   private String endereco;

   public Usuario build() {

       return Usuario.builder()
               .nome(nome)
               .dataNascimento(dataNascimento)
               .cpf(cpf)
               .sexo(sexo)
               .foneCelular(foneCelular)
               .email(email)
               .senha(senha)
               .endereco(endereco)
               .build();
   }
}
