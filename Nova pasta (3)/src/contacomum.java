import java.util.Date;

public class contacomum {


    Long nro_conta;
    Date  dt_abertura;
    Date dt_encerramento;
    int  situação;
    int senha;
    double saldo;


    public contacomum(long nro_conta, Date dt_abertura, Date dt_encerramento, int situação, int senha, double saldo) {
        this.nro_conta = nro_conta;
        this.dt_abertura = dt_abertura;
        this.dt_encerramento = dt_encerramento;
        this.situação = situação;
        this.senha = senha;
        this.saldo = saldo;
    }


    public long getNro_conta() {
        return nro_conta;
    }

    public void setNro_conta(long nro_conta) {
        this.nro_conta = nro_conta;
    }

    public Date getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(Date dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public Date getDt_encerramento() {
        return dt_encerramento;
    }

    public void setDt_encerramento(Date dt_encerramento) {
        this.dt_encerramento = dt_encerramento;
    }

    public int getSituação() {
        return situação;
    }

    public void setSituação(int situação) {
        this.situação = situação;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
