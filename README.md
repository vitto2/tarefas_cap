# tarefas_cap
01 - Projeto piramide de estrelinhas 

Foram usados dois laços de repetição. As estrelas são jogadas na tela apenas quando a variável controladora do laço 02 é menor ou igual a variável controladora do laço 01. Desta forma a estrela é exibida de forma gradativa na tela. 


02 - Projeto validação de senha. 

Nesse projeto é necessário verificar se a senha é forte e atende aos requisitos abaixo: 

mínimo de 6 dígitos. 
1 letra maiuscula 
1 letra minuscula 
1 caractere especial deste grupo > (!@#$%^&*()-+)
1 número 

Para validar se a senha passada pelo usuário atende todos os requisitos foram criados 4 métodos boolean. Métodos searchNumber, searchChar, searchUpperCase e  searchLowerCase. 

Em todos foram utilizadas expressões regulares. No método para validar se havia números inseridos na senha, utilizei um replaceAll para substituir tudo que for número da string senha que é passada como parâmetro e depois disso comparei a string passada com a string alterada, se as strings forem diferentes, isso quer dizer que foi removido um número e que o requisito já foi atendido, logo é retornado true. 

Usei a mesma lógica para conseguir descobrir se o usuário inseriu letras maiusculas, minusculas e caracteres especiais. 






