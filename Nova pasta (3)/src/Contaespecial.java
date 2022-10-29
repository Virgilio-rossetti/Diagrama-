public class Contaespecial extends pessoa  {

  double Limite_conta;

    public Contaespecial(String nom_pessoa, String end_pessoa, long cep_pessoa, String tel_pessoa, double renda, int sit_pessoa, double limite_conta) {
        super(nom_pessoa, end_pessoa, cep_pessoa, tel_pessoa, renda, sit_pessoa);
        Limite_conta = limite_conta;
    }

    public double getLimite_conta() {
        return Limite_conta;
    }

    public void setLimite_conta(double limite_conta) {
        Limite_conta = limite_conta;
    }
}

