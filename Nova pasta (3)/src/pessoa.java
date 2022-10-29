public class pessoa {

     String Nom_pessoa;
     String end_pessoa;
    Long cep_pessoa;
     String tel_pessoa;
     double renda pessoa;
     int sit_pessoa;

    public pessoa(String nom_pessoa, String end_pessoa, long cep_pessoa, String tel_pessoa, double renda, int sit_pessoa) {
        Nom_pessoa = nom_pessoa;
        this.end_pessoa = end_pessoa;
        this.cep_pessoa = cep_pessoa;
        this.tel_pessoa = tel_pessoa;
        this.renda = renda;
        this.sit_pessoa = sit_pessoa;
    }

    public String getNom_pessoa() {
        return Nom_pessoa;
    }

    public void setNom_pessoa(String nom_pessoa) {
        Nom_pessoa = nom_pessoa;
    }

    public String getEnd_pessoa() {
        return end_pessoa;
    }

    public void setEnd_pessoa(String end_pessoa) {
        this.end_pessoa = end_pessoa;
    }

    public long getCep_pessoa() {
        return cep_pessoa;
    }

    public void setCep_pessoa(long cep_pessoa) {
        this.cep_pessoa = cep_pessoa;
    }

    public String getTel_pessoa() {
        return tel_pessoa;
    }

    public void setTel_pessoa(String tel_pessoa) {
        this.tel_pessoa = tel_pessoa;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getSit_pessoa() {
        return sit_pessoa;
    }

    public void setSit_pessoa(int sit_pessoa) {
        this.sit_pessoa = sit_pessoa;
    }

}
