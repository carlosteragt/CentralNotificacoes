public class main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Carlos", "Carlos@gmail.com", 123456789);
        Notificacao notificacaoEmail = new Email();
        Notificacao notificacaoSms = new Sms();
        Notificacao notificacaoPush = new Push();
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

        gerenciador.adicionarUsuario(usuario);
        gerenciador.registrarPreferencia(usuario, notificacaoEmail);

        Usuario usuario2 = new Usuario("Henrique", "Henrique@gmail.com", 987654321);
        gerenciador.adicionarUsuario(usuario2);
        gerenciador.registrarPreferencia(usuario2, notificacaoSms);

        Usuario usuario3 = new Usuario("Silva", "Silva@gmail.com", 112233445);
        gerenciador.adicionarUsuario(usuario3);
        gerenciador.registrarPreferencia(usuario3, notificacaoPush);

        gerenciador.enviarNotificacao(usuario, "Hello World! " + "Nome: " + usuario.getNome() + ", " + "Email: " + usuario.getEmail());
        gerenciador.enviarNotificacao(usuario2, "Hello World! " + "Nome: " + usuario2.getNome() + ", " + "Telefone: " + usuario2.getNumeroTelefone());
        gerenciador.enviarNotificacao(usuario3, "Hello World! " + "Nome: " + usuario3.getNome());
    }
}