# Seno, Cosseno e Tangente
from math import sin, cos, tan
angulo = float(input('Digite um ângulo qualquer: '))
seno = sin(angulo)
cosseno = cos(angulo)
tangente = tan(angulo)

print('O ângulo {} mencionado possui as seguintes características:\nSeno: {}\nCosseno: {}\nTangente: {}'.format(angulo, seno, cosseno, tangente))