# SIGA — Sistema de Gestão Acadêmica Simplificado (código inicial)

**Técnicas de Programação II (TP2)** · CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

Este é o **código inicial** do projeto incremental da disciplina. Ele contém, de forma **proposital**, problemas de orientação a objetos que você irá corrigir nas atividades práticas.

## Estrutura do projeto

```
siga-inicial/
├── README.md
└── src/
    └── siga/
        ├── Aluno.java       (atributos públicos — sem encapsulamento)
        ├── Professor.java   (duplica atributos de Aluno — falta herança)
        ├── Matricula.java   (condicionais crescentes — viola o OCP)
        └── Main.java        (demonstra os problemas em execução)
```

## Como compilar e executar

Pré-requisito: JDK 17 ou superior instalado (`java -version` para verificar).

A partir da pasta do projeto:

```bash
# 1. Compilar (a saída vai para a pasta "bin")
javac -d bin src/siga/*.java

# 2. Executar
java -cp bin siga.Main
```

## Problemas propositais deste código

| Arquivo | Problema | Aula que corrige |
|---|---|---|
| `Aluno.java` | Atributos `public`; sem construtor; estado inválido é aceito | Aula 1 (encapsulamento) |
| `Professor.java` | Repete `nome`/`ativo` de `Aluno` | Aula 1 (herança) |
| `Matricula.java` | Bloco de condicionais que cresce a cada desconto | Aula 2 (SOLID / OCP) |

## Sua tarefa (Aula 1)

Consulte a ficha da atividade prática da Aula 1. Em resumo, você deverá:

1. Analisar a classe `Aluno` e identificar a violação do encapsulamento.
2. Refatorar `Aluno` para atributos privados com métodos acessores **validados** (a média só pode ficar entre 0 e 10).
3. Criar a superclasse `Pessoa` e derivar `Aluno` e `Professor` por herança.
4. Modelar a classe `Turma` contendo `Aluno` por composição.
5. Desenhar o diagrama de classes do domínio.

> As classes `Matricula` e o problema do cálculo de mensalidade serão retomados na **Aula 2**, ao estudarmos os princípios SOLID. Por ora, concentre-se na refatoração de `Aluno` e `Professor`.

## Padrão de entrega

Siga as regras da ficha de atividade prática: identificadores em português, código formatado, entrega no repositório Git com README e commits descritivos.
