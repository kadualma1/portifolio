# Calculando Descontos
preco = float(input('Digite o Preço (R$): '))
desconto = 0.05

print('O valor de R${:.2f}, após o desconto de {:.0f}% é:\nR${:.2f}'.format(preco, desconto * 100, preco * (1 - desconto)))