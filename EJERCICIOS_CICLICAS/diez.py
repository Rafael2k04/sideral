import os

ventas_de_0_a_10000 = 0
ventas_de_10000_a_20000 = 0
monto_ventas_de_0_a_10000 = 0
monto_ventas_de_10000_a_20000 = 0
monto_global = 0
n = int (input ('Ingresa el valor de n: '))
for i in range (1, n + 1):
    print ('PROCESO ' + repr (i))
    venta = float (input ('Ingresa el valor de venta: '))
    if venta<=10000:
        ventas_de_0_a_10000=ventas_de_0_a_10000+1
        monto_ventas_de_0_a_10000=monto_ventas_de_0_a_10000+venta
    if venta>10000 and venta<=20000:
        ventas_de_10000_a_20000=ventas_de_10000_a_20000+1
        monto_ventas_de_10000_a_20000=monto_ventas_de_10000_a_20000+venta
    monto_global=monto_global+venta
    print ()
print ('Valor de ventas de 0 a 10000: ' + repr (ventas_de_0_a_10000))
print ('Valor de ventas de 10000 a 20000: ' + repr (ventas_de_10000_a_20000))
print ('Valor de monto ventas de 0 a 10000: ' + repr (monto_ventas_de_0_a_10000))
print ('Valor de monto ventas de 10000 a 20000: ' + repr (monto_ventas_de_10000_a_20000))
print ('Valor de monto global: ' + repr (monto_global))
os.system ('pause')