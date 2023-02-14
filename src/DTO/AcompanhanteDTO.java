package DTO;

public class AcompanhanteDTO {

    private String codigo_ac, nome_ac, idade_ac, codigo_p;

    public String getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(String codigo_p) {
        this.codigo_p = codigo_p;
    }

    public String getCodigo_ac() {
        return codigo_ac;
    }

    public void setCodigo_ac(String codigo_ac) {
        this.codigo_ac = codigo_ac;
    }

    public String getNome_ac() {
        return nome_ac;
    }

    public void setNome_ac(String nome_ac) {
        this.nome_ac = nome_ac;
    }

    public String getIdade_ac() {
        return idade_ac;
    }

    public void setIdade_ac(String idade_ac) {
        this.idade_ac = idade_ac;
    }
}
