# TREEHASH

Este repositório contém três classes: `TableHash`, `BinaryTree` e `Node`. Essas classes fornecem implementações para uma tabela hash personalizada, uma árvore binária e um nó em Java.

## TableHash

A classe `TableHash` representa uma estrutura de dados de tabela hash. Ela permite inserir pares chave-valor, recuperar valores com base nas chaves, remover pares chave-valor e imprimir o conteúdo da tabela hash. A tabela hash é implementada usando um array de listas, onde cada lista armazena os pares chave-valor que têm o mesmo índice de hash.

### Utilização

Para utilizar a classe `TableHash`, siga estes passos:

1. Crie uma instância da classe `TableHash`, especificando a capacidade desejada.
2. Insira pares chave-valor usando o método `insert`.
3. Recupere valores fornecendo a chave para o método `get`.
4. Remova pares chave-valor usando o método `remove`.
5. Imprima o conteúdo da tabela hash usando o método `print`.

## BinaryTree

A classe `BinaryTree` representa uma estrutura de dados de árvore binária. Ela permite inserir pares chave-valor, recuperar valores com base nas chaves, remover pares chave-valor e realizar diferentes tipos de travessias da árvore (in-order, pré-ordem e pós-ordem).

### Utilização

Para utilizar a classe `BinaryTree`, siga estes passos:

1. Crie uma instância da classe `BinaryTree`.
2. Insira pares chave-valor usando o método `insert`.
3. Recupere valores fornecendo a chave para o método `get`.
4. Remova pares chave-valor usando o método `remove`.
5. Realize uma travessia in-order usando o método `inOrder`.
6. Realize uma travessia pré-ordem usando o método `preOrder`.
7. Realize uma travessia pós-ordem usando o método `postOrder`.

## Node

A classe `Node` representa um nó em uma árvore binária. Ela contém campos para armazenar a chave, o valor e as referências para os nós filhos esquerdo e direito.

### Utilização

A classe `Node` é usada internamente pela classe `BinaryTree`. Não é destinada a ser usada de forma independente.

---

Sinta-se à vontade para explorar o código e usar essas classes para implementar tabelas hash e árvores binárias em seus projetos Java. Se tiver alguma dúvida ou feedback, não hesite em entrar em contato.
