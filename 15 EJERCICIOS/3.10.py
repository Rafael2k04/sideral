import os

costo_por_km = float (input ('Ingresa el valor de costo por km: '))
presupuesto = float (input ('Ingresa el valor de presupuesto: '))
if costo_por_km*750*2<=presupuesto:
    print ('M\u00E9xico')
else:
    print ('Quedarse en casa')
if costo_por_km*800*2<=presupuesto:
    print ('Acapulco')
if costo_por_km*1200*2<=presupuesto:
    print ('Puerto Vallarta')
if costo_por_km*1800*2<=presupuesto:
    print ('Canc\u00FAn')
print ()
