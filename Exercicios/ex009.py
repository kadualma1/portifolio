# Tabuada V1.0
valor = int(input('Digite um número qualquer: '))
tabuada = [1, 2, 3, 4, 5, 6, 7, 8, 9]
x = 0

print('Tabuada de {}: '.format(valor))
while x < 9:
    resultado = valor * tabuada[x]
    print('{} * {} = {}'.format(valor, tabuada[x], resultado))
    x+=1