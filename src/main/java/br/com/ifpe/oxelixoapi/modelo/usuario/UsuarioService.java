package br.com.ifpe.oxelixoapi.modelo.usuario;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;
 
    @Transactional
    public Usuario save(Usuario usuario) {
 
        usuario.setHabilitado(Boolean.TRUE);
        usuario.setVersao(1L);
        usuario.setDataCriacao(LocalDate.now());
        return repository.save(usuario);
    }
    
    public List<Usuario> findAll() {
   
     return repository.findAll();
 }
 
 public Usuario findById(Long id) {
 
     return repository.findById(id).get();
 }
 
 @Transactional
    public void update(Long id, Usuario usuarioAlterado) {
 
       Usuario usuario = repository.findById(id).get();
       usuario.setNome(usuarioAlterado.getNome());
       usuario.setDataNascimento(usuarioAlterado.getDataNascimento());     
       usuario.setSenha(usuarioAlterado.getSenha());
      

       
       usuario.setVersao(usuario.getVersao() + 1);
       repository.save(usuario);
   }
   @Transactional
   public void delete(Long id) {
 
       Usuario usuario = repository.findById(id).get();
       usuario.setHabilitado(Boolean.FALSE);
       usuario.setVersao(usuario.getVersao() + 1);
 
       repository.save(usuario);
   }
 
 }
 
