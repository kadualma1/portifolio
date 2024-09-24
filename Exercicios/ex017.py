# Catetos e Hipotenusa
from math import pow, sqrt
cat1 = float(input('Informe o tamanho do primeiro cateto: '))
cat2 = float(input('Informe o tamanho do segundo cateto: '))

hipotenusa = sqrt(pow(cat1, 2) + pow(cat2, 2))

print('O valor da hipotenusa é {}.'.format(hipotenusa))