# Vetores (Arrays)

Vetores, também chamados de *arrays*, são estruturas de dados que armazenam múltiplos valores do **mesmo tipo** em uma única variável, utilizando **índices** para acesso.

## Sintaxe Geral

A sintaxe básica para declaração de um vetor depende da linguagem. Aqui está um exemplo em C:

tipo nome_do_vetor[tamanho];

### Exemplo:
int numeros[5]; // vetor de 5 inteiros

## Funcionamento

O vetor armazena múltiplos valores do mesmo tipo em posições consecutivas de memória.

Os elementos do vetor são acessados por índices, que geralmente começam em 0.

Pode-se ler, modificar e iterar os elementos usando estruturas de repetição.

### Exemplo em java:

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }
    }
}

### Exemplo em C:

#include <stdio.h>

int main() {
    int numeros[5] = {1, 2, 3, 4, 5};
    for (int i = 0; i < 5; i++) {
        printf("Número: %d\n", numeros[i]);
    }
    return 0;
}


## Diferença entre Variável Simples e Vetor

| Característica           | Variável Simples | Vetor (Array)                |
| ------------------------ | ---------------- | ---------------------------- |
| Armazena quantos valores | Apenas um valor  | Vários valores do mesmo tipo |
| Acesso aos dados         | Nome da variável | Índice (`vetor[i]`)          |
| Utilização em loops      | Não aplicável    | Sim, com for/while           |

### Quando Usar Vetores?
- Quando é necessário armazenar coleções de dados do mesmo tipo, como notas de alunos, números, nomes etc.

- Quando se deseja acesso rápido por índice.

- Ideal para situações que envolvem iteração sobre elementos e processamento em lote.

- Vetores são fundamentais para programação, e servem como base para outras estruturas como matrizes, listas e filas.
