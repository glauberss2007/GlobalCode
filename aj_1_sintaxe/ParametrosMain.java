package aj_1_sintaxe;

/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	String nome = "Glauber";
	String dataNascimento = "15/02/1988";
	String rg = "123232448945";
	String salario = "1500";
	String sexo = "Undefined";
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", está registrado(a) com o salário de R$ " + salario
	    + ".";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
  }
}
