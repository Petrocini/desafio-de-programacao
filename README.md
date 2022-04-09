# desafio-de-programacao

Repositório montado para desafio de programação

Questões: 
1 - Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
2 - Construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura. 
3 - Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Como executar os projetos e funcionamento: 
Questão 1: Utilização -- Puxar projeto para a IDE java NETBEANS e executar
- O algoritmo verifica o valor informado pelo usuário, passando por uma estrutura de repetição inserindo * de acordo com a quantidade informada utilizando STRINGBUILDER.

Questão 2: Utilização -- Executar o arquivo .jar localizado em "Questao2/dist/Questao_2.jar" (Necessário JAVA no PC) ou puxar basta do projeto para NETBEANS e executar
- O algoritmo verifica a senha de entrada e valida todas as informações solicitadas (Quantidade de caracteres), informando ao usuário quais são as pendências de sua senha e o nível de segurança atual.

Questão 3: Utilização -- Executar o arquivo .jar localizado em "Questao3/dist/Questao_3.jar" (Necessário JAVA no PC) ou puxar basta do projeto para NETBEANS e executar

- O algoritmo verifica o valor informado pelo usuário, checando se está em branco, e retorna no jLabel a quantidade de anagramas detectados.
- Duas estruturas de repetição são criadas para a validação de todas as SubStrings da palavra informada pelo usuário
- É criado um CHAR[] para pegar todos os valores de uma SubString e inserir dentro de uma String em ordem alfabetica para seguir as validações.
- É utilizado um MAP dentro da estrutura de repetição para verificar se existe a chave da String passada e inserir no MAP.
- Um foreach é chamado para passar por todos os objetos do MAP e aumentar a quantidade de anagramas encontrados.
- Criado e desenvolvido por: Lucas Petrocini dos Reis
