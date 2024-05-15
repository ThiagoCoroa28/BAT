package Model;

public class Usuario {

    private String senha; // Correspondente a matricula em Usuario
    private String matricula; // Correspondente a matricula em Usuario
    private String nome;
    private String email;

    // Método construtor vazio
    public Usuario() {

    }

    public Usuario(String email, String senha ) {
        this.senha = senha;
        this.email = email;
    }
   
    // Método construtor com todos os atributos
    public Usuario(String senha, String matricula, String nome, String email) {
        this.senha = senha;
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    // Método construtor com os atributos, exceto a chave primária (id)
    public Usuario(String matricula, String nome, String email) {
        this.senha = matricula; // Usando matricula como senha
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    // Métodos getters e setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representação em texto do objeto
    @Override
    public String toString() {
        return "Senha: " + senha + ", Matrícula: " + matricula + ", Nome: " + nome + ", Email: " + email;
    }
    
    public String toUser() {
        return "Email: " + email + " Senha: " + senha;
    }

    String getMat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMat(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}