package siga;

/**
 * Sistema de Gestão Acadêmica Simplificado (SIGA)
 * Técnicas de Programação II - Fatec de Porto Ferreira
 *
 * ATENÇÃO: código INICIAL da disciplina.
 * Esta classe apresenta, propositalmente, problemas de orientação a objetos
 * que serão corrigidos na atividade prática da Aula 1.
 *
 * Problema principal: os atributos são PÚBLICOS, expondo o estado interno
 * do objeto e permitindo que qualquer código o coloque em um estado inválido
 * (por exemplo, uma média negativa ou maior que 10).
 */
public class Aluno {

    // Atributos públicos: violação do encapsulamento.
    public String nome;
    public String matricula;
    public double media;
    public boolean ativo;

    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.
}
