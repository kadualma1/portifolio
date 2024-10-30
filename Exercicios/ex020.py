# Sorteando uma Ordem na Lista
from random import shuffle

n1 = str(input('Digite um nome: '))
n2 = str(input('Digite um nome: '))
n3 = str(input('Digite um nome: '))
n4 = str(input('Digite um nome: '))

lista_alunos = [n1, n2, n3, n4]
shuffle(lista_alunos)

print('A ordem de apresentação será: \n{}'.format(lista_alunos))