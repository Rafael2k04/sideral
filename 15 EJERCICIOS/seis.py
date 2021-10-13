import os

edad = float (input ('Ingresa el valor de edad: '))
promedio = float (input ('Ingresa el valor de promedio: '))
beca=0
if edad>18 and promedio>=9:
    beca=2000
if edad>18 and promedio>=7.5 and promedio<9:
    beca=1000
if edad>18 and promedio>=6 and promedio<7.5:
    beca=500
if edad<=18 and promedio>=9:
    beca=3000
if edad<=18 and promedio>=8 and promedio<9:
    beca=2000
if edad>18 and promedio>=6 and promedio<8:
    beca=100
if promedio<6:
    print ('Se env\u00EDa carta de invitaci\u00F3n a estudiar m\u00E1s')
print ('Valor de beca: ' + repr (beca))
print ()
