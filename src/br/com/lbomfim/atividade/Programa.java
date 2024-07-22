/**
 * @author Lucas
 */
package br.com.lbomfim.atividade;

public class Programa {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Lucas Bomfim");
        pessoaFisica.setIdade(20d);
        pessoaFisica.setCpf("382.267.424-98");
        pessoaFisica.setEndereco("Rua Java, 321");
        System.out.println(" ");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Rodrigo Pires");
        pessoaJuridica.setIdade(45d);
        pessoaJuridica.setCnpj("03.235.963/0001-62");
        pessoaJuridica.setEndereco("Rua Javinha, 123");
        System.out.println(" ");
        imprimir(pessoaJuridica);
    }

    public static void imprimir(Pessoa pessoa) {
        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) pessoa;
            System.out.println("Informações da pessoa física");
            System.out.println("Nome: " + pf.getNome());
            System.out.println("Idade: " + pf.getIdade());
            System.out.println("CPF: " + pf.getCpf());
            System.out.println("Endereço: " + pf.getEndereco());
        } else if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) pessoa;
            System.out.println("Informações da pessoa jurídica");
            System.out.println("Nome: " + pj.getNome());
            System.out.println("Idade: " + pj.getIdade());
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Endereço: " + pj.getEndereco());
        }
    }
}
