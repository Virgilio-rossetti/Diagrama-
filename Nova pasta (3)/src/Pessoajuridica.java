public class Pessoajuridica  extends  pessoa {

Long cnpj_pessoa

    public Pessoajuridica(String nom_pessoa, String end_pessoa, long cep_pessoa, String tel_pessoa, double renda, int sit_pessoa, Long cnpj_pessoa) {
        super(nom_pessoa, end_pessoa, cep_pessoa, tel_pessoa, renda, sit_pessoa);
        this.cnpj_pessoa = cnpj_pessoa;
    }

    public Long getCnpj_pessoa() {
        return cnpj_pessoa;
    }

    public void setCnpj_pessoa(Long cnpj_pessoa) {
        this.cnpj_pessoa = cnpj_pessoa;
    }
}
