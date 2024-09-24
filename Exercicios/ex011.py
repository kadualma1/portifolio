# Pintando Parede
altura = float(input('Altura: '))
largura = float(input('Largura: '))

area = altura * largura
tinta = area / 2

print('Altura: {} m\nLargura: {} m\nÁrea: {} m²\nTinta necessária: {} L'.format(altura, largura, area, tinta))