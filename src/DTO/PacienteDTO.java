package DTO;

public class PacienteDTO {

    private String nome_pa, idade_pa, endereco_pa;
    private int codigo_pa;

    public void setNome_pa(String nome_pa) {
        this.nome_pa = nome_pa;
    }

    public void setIdade_pa(String idade_pa) {
        this.idade_pa = idade_pa;
    }

    public void setEndereco_pa(String endereco_pa) {
        this.endereco_pa = endereco_pa;
    }

    public int getCodigo_pa() {
        return codigo_pa;
    }

    public void setCodigo_pa(int codigo_pa) {
        this.codigo_pa = codigo_pa;
    }

    public String getNome_pa() {
        return nome_pa;
    }

    public String getIdade_pa() {
        return idade_pa;
    }

    public String getEndereco_pa() {
        return endereco_pa;
    }

}
