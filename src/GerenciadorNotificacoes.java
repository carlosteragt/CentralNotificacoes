import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarPreferencia(Usuario usuario, Notificacao notificacao) {
        if (usuarios.contains(usuario)) {
            usuario.adicionarPreferencia(notificacao);
        }
    }

    public void enviarNotificacao(Usuario usuario, String mensagem) {
        if (usuarios.contains(usuario)) {
            List<Notificacao> preferenciasUsuario = usuario.getPreferencias();
            for (Notificacao notificacao : preferenciasUsuario) {
                notificacao.imprimir(mensagem);
            }
        }
    }
    




}
