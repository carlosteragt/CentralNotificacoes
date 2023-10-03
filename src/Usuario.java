import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private int numeroTelefone;
    private List<Notificacao> preferencias = new ArrayList<>();

    public Usuario(String nome, String email, int numeroTelefone) {
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void adicionarPreferencia(Notificacao notificacao) {
        preferencias.add(notificacao);
    }

    public List<Notificacao> getPreferencias() {
        return preferencias;
    }

}