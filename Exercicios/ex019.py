# Sorteando um item na lista
from random import randint
lista_alunos = ['Roberto', 'Carla', 'Marcos', 'Juréia']
aluno_escolhido = lista_alunos[randint(0,3)]

print('O aluno escolhido para apagar o quadro foi: {}'.format(aluno_escolhido))