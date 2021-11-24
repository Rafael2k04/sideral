import os, math

ex = 0
factorial = 0
x = float (input ('Ingresa el valor de x: '))
n = int (input ('Ingresa el valor de n: '))
for i in range (1, n + 1):
    print ('PROCESO ' + repr (i))
    if i==1:
        ex=1
        factorial=1
    factorial=factorial*i
    ex=ex+math.pow(x,i)/factorial
    print ()
print ('Valor de ex: ' + repr (ex))
print ('Valor de factorial: ' + repr (factorial))
os.system ('pause')