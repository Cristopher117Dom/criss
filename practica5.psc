Algoritmo practica5
	Definir N, i Como Entero
    Definir venta Como Real
    Definir mayores1000, entre500y1000, menores500 Como Entero
    mayores1000 <- 0
    entre500y1000 <- 0
    menores500 <- 0
    i <- 1
	
    Escribir "Ingrese la cantidad de ventas:"
    Leer N
	
    Mientras i <= N Hacer
        Escribir "Monto de la venta ", i, ":"
        Leer venta
		
        Si venta > 1000 Entonces
            mayores1000 <- mayores1000 + 1
        Sino
            Si venta >= 500 Entonces
                entre500y1000 <- entre500y1000 + 1
            Sino
                menores500 <- menores500 + 1
            FinSi
        FinSi
        i <- i + 1
    FinMientras
	
    Escribir "Ventas mayores a $1000: ", mayores1000
    Escribir "Ventas entre $500 y $1000: ", entre500y1000
    Escribir "Ventas menores a $500: ", menores500


FinAlgoritmo
