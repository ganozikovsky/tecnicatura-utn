def solicitar_numeros():
    cantidad = int(input("Ingresa la cantidad de números: "))
    return [int(input("Ingresa un número: ")) for _ in range(cantidad)]

def calcular_estadisticas_pares(numeros):
    pares = [num for num in numeros if num % 2 == 0]
    return sum(pares), len(pares)

def calcular_promedio_impares(numeros):
    impares = [num for num in numeros if num % 2 != 0]
    return sum(impares) / len(impares) if impares else 0

def mostrar_resultados(suma_pares, cantidad_pares, promedio_impares):
    print(f"La suma de los números pares es: {suma_pares}")
    print(f"La cantidad de números pares: {cantidad_pares}")
    print(f"El promedio de los números impares es: {promedio_impares:.2f}")

def par_impar():
    numeros = solicitar_numeros()
    suma_pares, cantidad_pares = calcular_estadisticas_pares(numeros)
    promedio_impares = calcular_promedio_impares(numeros)
    mostrar_resultados(suma_pares, cantidad_pares, promedio_impares)

par_impar()