/**
 * @author Lucas
 */
package br.com.lbomfim.abstratas;

public class Programa {

    public static void main(String[] args) {

        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Lucas");
        empregado.setSobrenome("Bomfim");
        empregado.setSalario(100d);
        System.out.println(empregado.getNome() + " Tem de salário: " + empregado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Vitor");
        comissionado.setSobrenome("Holanda");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        System.out.println(comissionado.getNome() + " Tem uma comissão de: " + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Gabriel");
        horista.setSobrenome("Pala");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {

        System.out.println(empregado.getNome() + " Tem de salário: " + empregado.vencimento());
        empregado.imprimirSobrenome();
        empregado.imprimirValores();

//        if (empregado instanceof Horista) {
//            Horista hor = (Horista) empregado;
//            System.out.println(hor.getPrecoHora());
//        }
    }
}
