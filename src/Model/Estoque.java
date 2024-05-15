package Model;

public class Estoque {
    
    //colocar uma id
    private String nome;
    private int quantidade;
    private String lote;

    public Estoque(String nome, int quantidade, String lote) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.lote = lote;
    }

    public Estoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    // Método toString para representação em texto do objeto
    @Override
    public String toString() {
        return "nome: " + nome + ", Quantidade: " + quantidade + ", Lote: " + lote;
    }
}

