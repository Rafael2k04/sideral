import os

total = 0
n = int (input ('Ingresa el valor de n: '))
for i in range (1, n + 1):
    print ('PROCESO ' + repr (i))
    cantidad_01_enero = float (input ('Ingresa el valor de cantidad 01 enero: '))
    cantidad_02_febrero = float (input ('Ingresa el valor de cantidad 02 febrero: '))
    cantidad_03_marzo = float (input ('Ingresa el valor de cantidad 03 marzo: '))
    cantidad_04_abril = float (input ('Ingresa el valor de cantidad 04 abril: '))
    cantidad_05_mayo = float (input ('Ingresa el valor de cantidad 05 mayo: '))
    cantidad_06_junio = float (input ('Ingresa el valor de cantidad 06 junio: '))
    cantidad_07_julio = float (input ('Ingresa el valor de cantidad 07 julio: '))
    cantidad_08_agosto = float (input ('Ingresa el valor de cantidad 08 agosto: '))
    cantidad_09_septiembre = float (input ('Ingresa el valor de cantidad 09 septiembre: '))
    cantidad_10_octubre = float (input ('Ingresa el valor de cantidad 10 octubre: '))
    cantidad_11_noviembre = float (input ('Ingresa el valor de cantidad 11 noviembre: '))
    cantidad_12_diciembre = float (input ('Ingresa el valor de cantidad 12 diciembre: '))
    intereses=total*0.1
    total=total+intereses+cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre
    inversion_final=total
    print ('Valor de intereses: ' + repr (intereses))
    print ('Valor de inversion final: ' + repr (inversion_final))
    print ()
print ('Valor de total: ' + repr (total))
os.system ('pause')