# Aluguel de Carros
v_km = float(input('KM percorridos: '))
v_dias = int(input('Dias alugado: '))

v_aluguel_km = v_km * 0.15
v_aluguel_dias = v_dias * 60

print('Valor total a pagar: R${:2f}'.format(v_aluguel_dias + v_aluguel_km))