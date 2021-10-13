import os

presupuesto = int (input ('Ingresa el valor de presupuesto: '))
if presupuesto<=10:
    print ('Tarjeta')
if presupuesto>=11 and presupuesto<=100:
    print ('Chocolates')
if presupuesto>=101 and presupuesto<=250:
    print ('Flores')
if presupuesto>=251:
    print ('Anillo')
print ()
