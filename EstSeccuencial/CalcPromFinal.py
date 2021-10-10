ksprint("******Calculat Promedio final******")
#Datos de entrada
nota1=float(input("Ingrese nota 1:"))
nota2=float(input("Ingrese nota 2:"))
nota3=float(input("Ingrese nota 3:"))
nota4=float(input("Ingrese nota 4:"))
nota5=float(input("Ingrese nota 5:"))
nota6=float(input("Ingrese nota 6:"))
nota7=float(input("Ingrese nota 7:"))
#Proceso
promedioFin=(nota1*0.15)+(nota2*0.15)+(nota3*0.10)+(nota4*0.15)+(nota5*0.05)+(nota6*0.10)+(nota7*0.30)
#Datos de Salida
print(f"Su promedio final es: {round(promedioFin,2)}")
