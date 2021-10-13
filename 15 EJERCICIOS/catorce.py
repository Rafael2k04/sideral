import os

puntos = float (input ('Ingresa el valor de puntos: '))
salario_minimo = float (input ('Ingresa el valor de salario minimo: '))
bono=0
if puntos<=100:
    bono=salario_minimo
if puntos>100 and puntos<=150:
    bono=salario_minimo*2
if puntos>150:
    bono=salario_minimo*3
print ('Valor de bono: ' + repr (bono))
print ()
