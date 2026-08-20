package siga;

/**
 * Código INICIAL da disciplina.
 *
 * Esta classe é o ponto de partida da situação-problema da Aula 2 (SOLID).
 * O cálculo da mensalidade usa um bloco de condicionais que CRESCE a cada
 * novo tipo de desconto: a cada semestre, um novo desconto exige MODIFICAR
 * este método e testá-lo novamente por inteiro.
 *
 * Isso viola o princípio Aberto/Fechado (OCP): a classe deveria estar
 * fechada para modificação e aberta para extensão.
 *
 * Na atividade da Aula 2, este método será refatorado com o uso de uma
 * interface (por exemplo, Desconto) e polimorfismo.
 */
public class Matricula {

    public double valorBase;
    public String tipoDesconto;   // "BOLSISTA", "CONVENIO", "FUNCIONARIO"...

    public double calcularMensalidade() {
        // A cada novo tipo de desconto, mais um ramo é acrescentado aqui.
        if (tipoDesconto.equals("BOLSISTA")) {
            return valorBase * 0.5;
        } else if (tipoDesconto.equals("CONVENIO")) {
            return valorBase * 0.8;
        } else if (tipoDesconto.equals("FUNCIONARIO")) {
            return valorBase * 0.7;
        } else {
            return valorBase; // sem desconto
        }
    }
}
