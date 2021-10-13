import os, sys

edad = float (input ('Ingresa el valor de edad: '))
print ('Selecciona el valor de tipo de poliza.')
print ('\t1.- A cobertura amplia')
print ('\t2.- B da\u00F1os a terceros')
sys.stdout.write ('\t')
tipo_de_poliza = 0
while tipo_de_poliza<1 or tipo_de_poliza>2:
    tipo_de_poliza = int (input (': '))
    if tipo_de_poliza<1 or tipo_de_poliza>2:
        sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
print ('Selecciona el valor de toma alcohol.')
print ('\t1.- si')
print ('\t2.- no')
sys.stdout.write ('\t')
toma_alcohol = 0
while toma_alcohol<1 or toma_alcohol>2:
    toma_alcohol = int (input (': '))
    if toma_alcohol<1 or toma_alcohol>2:
        sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
print ('Selecciona el valor de utiliza lentes.')
print ('\t1.- si')
print ('\t2.- no')
sys.stdout.write ('\t')
utiliza_lentes = 0
while utiliza_lentes<1 or utiliza_lentes>2:
    utiliza_lentes = int (input (': '))
    if utiliza_lentes<1 or utiliza_lentes>2:
        sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
print ('Selecciona el valor de padece enfermedad.')
print ('\t1.- si')
print ('\t2.- no')
sys.stdout.write ('\t')
padece_enfermedad = 0
while padece_enfermedad<1 or padece_enfermedad>2:
    padece_enfermedad = int (input (': '))
    if padece_enfermedad<1 or padece_enfermedad>2:
        sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
if tipo_de_poliza==1:
    cuota=1200
else:
    cuota=950
cargos=0
if toma_alcohol==1:
    cargos=cargos+cuota*0.1
if utiliza_lentes==1:
    cargos=cargos+cuota*0.05
if padece_enfermedad==1:
    cargos=cargos+cuota*0.05
if edad>40:
    cargos=cargos+cuota*0.2
else:
    cargos=cargos+cuota*0.1
costo_de_la_poliza=cuota+cargos
print ('Valor de cargos: ' + repr (cargos))
print ('Valor de costo de la poliza: ' + repr (costo_de_la_poliza))
print ('Valor de cuota: ' + repr (cuota))
print ()