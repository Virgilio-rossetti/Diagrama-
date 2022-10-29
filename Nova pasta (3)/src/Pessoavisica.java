public class Pessoavisica extends pessoa {

    Long cpf_pessoa;
    Long rg_pessoa;

    public Pessoavisica(String nom_pessoa, String end_pessoa, long cep_pessoa, String tel_pessoa, double renda, int sit_pessoa, Long cpf_pessoa, Long rg_pessoa) {
        super(nom_pessoa, end_pessoa, cep_pessoa, tel_pessoa, renda, sit_pessoa);
        this.cpf_pessoa = cpf_pessoa;
        this.rg_pessoa = rg_pessoa;
    }

    public Long getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(Long cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public Long getRg_pessoa() {
        return rg_pessoa;
    }

    public void setRg_pessoa(Long rg_pessoa) {
        this.rg_pessoa = rg_pessoa;
    }
}
