import os, math

for i in range (1, 7):
    print ('PROCESO ' + repr (i))
    salario_inicial=1500
    year=i
    salario_recibido=salario_inicial*math.pow(1.1,year)
    print ('Valor de salario inicial: ' + repr (salario_inicial))
    print ('Valor de salario recibido: ' + repr (salario_recibido))
    print ('Valor de year: ' + repr (year))
    print ()