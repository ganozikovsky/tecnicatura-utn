def calcular_salarios():
    NUMERO_EMPLEADOS = 5
    total_nomina = 0

    for numero_empleado in range(1, NUMERO_EMPLEADOS + 1):
        print(f"\nEmpleado {numero_empleado}")
        horas_trabajadas = float(input("Ingrese las horas trabajadas: "))
        tarifa_horaria = float(input("Ingrese la tarifa por hora: "))
        
        salario_individual = horas_trabajadas * tarifa_horaria
        total_nomina += salario_individual
        
        print(f"Salario del empleado {numero_empleado}: ${salario_individual:.2f}")

    print(f"\nTotal de la nómina: ${total_nomina:.2f}")

calcular_salarios()