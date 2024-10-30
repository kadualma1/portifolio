# Sorteando um item na lista
from random import randint
n1 = str(input('Digite um nome: '))
n2 = str(input('Digite um nome: '))
n3 = str(input('Digite um nome: '))
n4 = str(input('Digite um nome: '))
lista_alunos = [n1, n2, n3, n4]
aluno_escolhido = lista_alunos[randint(0,3)]

print('O aluno escolhido para apagar o quadro foi: {}'.format(aluno_escolhido))