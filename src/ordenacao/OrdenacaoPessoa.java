package ordenacao;

import java.util.*;

public class OrdenacaoPessoa {
    //Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

}
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa>ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Bia", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Tom", 24, 1.90);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.59);
        ordenacaoPessoa.adicionarPessoa("Lana", 33, 1.70);

        System.out.println(ordenacaoPessoa.pessoaList);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
