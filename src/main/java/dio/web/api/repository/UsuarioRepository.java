package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null)
            System.out.println("SAVE - Recebndo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);

    }
        public List<Usuario> findAll(){
            System.out.println("List - Listando os usuários do sistema ");
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("jackson", "password"));
            usuarios.add(new Usuario("Fran", "masterpass"));
            return usuarios;
        }
        public Usuario findById(Integer id){
            System.out.println(String.format("findById - Recebendo o id: %d para buscar um usuário", id));
            return new Usuario("jackson", "password");
        }
        public Usuario findByUsername(String username){
            System.out.println(String.format("findByUsername - Recebendo o username: %s para buscar um usuário", username));
            return new Usuario("jackson", "password");
        }

}
