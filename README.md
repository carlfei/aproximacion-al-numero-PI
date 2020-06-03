# aproximacion-al-numero-PI
Aproximacion al numero PI/4, a traves de sumas de hipotenusas con sus dos vertices tangentes al cuarto de circunferencia que van recorriendo.

poner en la variable particion_intervalo = , el numero de sumas que se van a emplear EJ si (particion_intervalo=88888888) 
se utilizaran 88888888 sumas en el intervalo 1/88888888,
No es un metodo de convergencia infinita, no por tender a infito se hace mas preciso el resultado,
Es un metodo de aproximación no de obtención del numero PI



![Alt text](https://github.com/carlfei/aproximacion-al-numero-PI/blob/master/12.png "")




Para desarrollar el método empleo el concepto de arco capaz de semicircunferencia, esto es la hipotenusa del triangulo es el diámetro de la circunferencia y el vértice de unión de los dos catetos es sobre un punto de la semicircunferencia, los dos catetos juntan  sus vértices  en un punto del perímetro de la semicircunferencia la cual recorren un cuarto de circunferencia empezado en x = radio,  termina en (x cerca de diámetro), en todo el recorrido los dos catetos forman un ángulo de 90 grados, la altura y empieza en y = radio, termina en (y cerca de 0).
Las hipotenusas se calculan en la diferencia de posición entre dos vértices consecutivos del triángulo rectángulo que recorre el cuarto de circunferencia.

![Alt text](https://github.com/carlfei/aproximacion-al-numero-PI/blob/master/7.png "")

ΣH(0-->n) ≈ PI/4
