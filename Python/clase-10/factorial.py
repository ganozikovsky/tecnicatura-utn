def calcular_factorial(num):
    if num < 0:
        return "El número debe ser mayor o igual a 0"
    
    factorial = 1
    i = 1
    
    while i <= num:
        factorial *= i
        i += 1
    
    return factorial

numero = int(input("Digite un número: "))

resultado = calcular_factorial(numero)
print("El factorial es:", resultado)