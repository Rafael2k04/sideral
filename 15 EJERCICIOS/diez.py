import os

antiguedad = int (input ('Ingresa el valor de antiguedad: '))
if antiguedad<=5:
    bono=antiguedad*100
else:
    bono=1000
print ('Valor de bono: ' + repr (bono))
print ()
os.system ('pause')