# Seno, Cosseno e Tangente
from math import sin, cos, tan, radians
an = float(input('Digite um ângulo qualquer: '))
angulo = radians(an)
seno = sin(angulo)
cosseno = cos(angulo)
tangente = tan(angulo)

print('O ângulo {:.0f}° mencionado possui as seguintes características:\nSeno: {:.2f}\nCosseno: {:.2f}\nTangente: {:.2f}'.format(an, seno, cosseno, tangente))