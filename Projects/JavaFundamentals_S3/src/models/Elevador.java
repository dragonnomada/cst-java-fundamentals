package models;

public class Elevador {

    private int nivel = 0; // 0=E, 1=PB, 2=N1, 3=N2
    private int siguienteNivel = 0; // 0=E, 1=PB, 2=N1, 3=N2
    
    private boolean puertasAbiertas;
    
    private boolean haciaArriba;
    
    private boolean operando;
    
    // [  E     PB     N1     N2 ]
    // [false, true, false, false]
    private boolean[] nivelesPulsados = new boolean[] { 
        false, // E
        true,  // PB
        false, // N1
        false  // N2
    };
    
    public void describir() {
        String[] nivelEtiquetas = new String[] {
            "E",
            "PB",
            "N1",
            "N2"
        };
        
        System.out.printf("ELEVADOR (%s) %n", nivelEtiquetas[nivel]);
        System.out.printf("%s %s %s %n", 
                puertasAbiertas ? "]]]" : "[[[",
                haciaArriba ? "^^^^^^^^^^^^" : "vvvvvvvvvvvv",
                puertasAbiertas ? "[[[" : "]]]"
        );
        if (operando) {
            System.out.println("*************************");
        } else {
            System.out.println("-------------------------");
        }
        
        // <valor lógico> ? <exp. v> : <exp. f>
        System.out.printf("E   %c %n", nivelesPulsados[0] ? 'x' : '-');
        System.out.printf("PB  %c %n", nivelesPulsados[1] ? 'x' : '-');
        System.out.printf("N1  %c %n", nivelesPulsados[2] ? 'x' : '-');
        System.out.printf("N2  %c %n", nivelesPulsados[3] ? 'x' : '-');
        
        if (operando) {
            System.out.println("*************************");
        } else {
            System.out.println("-------------------------");
        }
        
        System.out.printf("PRÓXIMO NIVEL: %s %n", nivelEtiquetas[siguienteNivel]);
    }
    
    public void pulsarNivel(int nivel) {
        if (nivel >= 0 && nivel <= 3) {
            nivelesPulsados[nivel] = true;
        } else {
            System.out.println("[ADVERTENCIA] EL NIVEL NO ES VÁLIDO");
        }
    }
    
    public void pulsarNivel(String nivelEtiqueta) {
        
        switch (nivelEtiqueta) {
            case "E":
                nivelesPulsados[0] = true;
                break;
            case "PB":
                nivelesPulsados[1] = true;
                break;
            case "N1":
                nivelesPulsados[2] = true;
                break;
            case "N2":
                nivelesPulsados[3] = true;
                break;
            default:
                System.out.println("[ADVERTENCIA] EL NIVEL NO ES VÁLIDO");
                break;
        }
        
    }
    
    public int calcularSiguienteNivel() {
        
        if (haciaArriba) {
            for (int proximoNivel = nivel + 1; proximoNivel <= 3; proximoNivel++) {
                if (nivelesPulsados[proximoNivel]) {
                    siguienteNivel = proximoNivel;
                    return siguienteNivel;
                }
            }
        } else {
            for (int proximoNivel = nivel - 1; proximoNivel >= 0; proximoNivel--) {
                if (nivelesPulsados[proximoNivel]) {
                    siguienteNivel = proximoNivel;
                    return siguienteNivel;
                }
            }
        }
        
        return nivel;
    }
    
    public void irAlProximoNivel() {
        
        if (puertasAbiertas) {
            System.out.println("CIERRA PRIMERO LAS PUERTAS");
            return;
        }
        
        calcularSiguienteNivel();
        
        if (nivel == siguienteNivel) {
            System.out.println("> NO HAY MÁS PISOS EN ESA DIRECCIÓN");
            detenerse();
            abrirPuertas();
            haciaArriba = !haciaArriba;
            System.out.println("> LA DIRECCIÓN SE HA INVERTIDO");
        } else {
            cerrarPuertas();
            operando = true;
            if (nivel < siguienteNivel) {
                nivel++;
            } else {
                nivel--;
            }
            System.out.println("> VIAJANDO AL PRÓXIMO NIVEL");
        }
        
        if (nivelesPulsados[nivel]) {
            System.out.println("ESTE PISO SE DEBE VISITAR");
            detenerse();
            abrirPuertas();
        }
        
    }
    
    private void detenerse() {
        operando = false;
        System.out.println("EL ELEVADOR SE HA DETENIDO");
    }
    
    private void abrirPuertas() {
        if (!operando) {
            puertasAbiertas = true;
            System.out.println("LAS PUERTAS SE HAN ABIERTO");
            nivelesPulsados[nivel] = false;
        }
    }
    
    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("LAS PUERTAS SE HAN CERRADO");
    }
    
}
