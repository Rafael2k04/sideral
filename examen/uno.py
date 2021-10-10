def PromedioNotas_CRMC():
 print("Calcular su Promedio final")
 #datos de entrada
 nota1=float(input("Ingrese nota 1:"))
 nota2=float(input("Ingrese nota 2:"))
 nota3=float(input("Ingrese nota 3:"))
 
 #proceso
 PromedioFin=(nota1*0.25)+(nota2*0.25)+(nota3*0.50)
 #datos de salida  
 print(f"Su Promedio final es: {round(PromedioFin,2)}")

PromedioNotas_CRMC()