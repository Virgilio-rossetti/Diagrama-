import java.util.Date;

public class Contapoupança extends contacomum {

   Date dt_aniversario

   public Contapoupança(long nro_conta, Date dt_abertura, Date dt_encerramento, int situação, int senha, double saldo, Date dt_aniversario) {
      super(nro_conta, dt_abertura, dt_encerramento, situação, senha, saldo);
      this.dt_aniversario = dt_aniversario;
   }

   public Date getDt_aniversario() {
      return dt_aniversario;
   }

   public void setDt_aniversario(Date dt_aniversario) {
      this.dt_aniversario = dt_aniversario;
   }
}
