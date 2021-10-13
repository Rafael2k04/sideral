import os

antiguedad = float (input ('Ingresa el valor de antiguedad: '))
sueldo = float (input ('Ingresa el valor de sueldo: '))
bono_por_antiguedad=0
if antiguedad>2 and antiguedad<5:
    bono_por_antiguedad=sueldo*0.2
if antiguedad>=5:
    bono_por_antiguedad=sueldo*0.3
bono_por_sueldo=0
if sueldo<=1000:
    bono_por_sueldo=sueldo*0.25
if sueldo>1000 and sueldo<=3500:
    bono_por_sueldo=sueldo*0.15
if sueldo>3500:
    bono_por_sueldo=sueldo*0.1
if bono_por_antiguedad>bono_por_sueldo:
    bono_mensual=bono_por_antiguedad
else:
    bono_mensual=bono_por_sueldo
print ('Valor de bono mensual: ' + repr (bono_mensual))
print ('Valor de bono por antiguedad: ' + repr (bono_por_antiguedad))
print ('Valor de bono por sueldo: ' + repr (bono_por_sueldo))
print ()