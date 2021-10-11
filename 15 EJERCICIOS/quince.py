import os

dinero_recibido = float (input ('Ingresa el valor de dinero recibido: '))
if dinero_recibido>=50000:
    print ('Paquete A')
if dinero_recibido>=20000 and dinero_recibido<50000:
    print ('Paquete B')
if dinero_recibido>=10000 and dinero_recibido<20000:
    print ('Paquete C')
if dinero_recibido<10000:
    print ('Paquete D')
print ()