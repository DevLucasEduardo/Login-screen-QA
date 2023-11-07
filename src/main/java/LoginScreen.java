

import java.util.HashMap;
import java.util.Map;

/**
 * A classe LoginScreen é responsável por fazer a autenticação e adição de usuários.
 * @author Lucas Eduardo Pereira
 * @version 1.1
 * @since 07-11-2023
 */
public class LoginScreen {

    private Map<String, String> userDataBase;


    /**
     * o Construtor da classe inicializa os dados dentro de um HashMap.
     */
    public LoginScreen() {
        userDataBase = new HashMap<>();
        userDataBase.put("john", "password123");
        userDataBase.put("alice", "securepass");
    }

    /**
     * O método login faz a autenticação de um usuário através do nome de usuário e senha.
     *
     * @param username O nome de usuário a ser autenticado.
     * @param password A senha do usuário a ser autenticado.
     * @return true se os dados inseridos estiverem de acordo com os dados do hashmap, caso contrário é false.
     */
    public boolean login(String username, String password) {

        if (userDataBase.containsKey(username)) {
            String storedPassword = userDataBase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo usuário ao hashmap.
     *
     * @param username O nome do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDataBase.put(username, password);
    }
}