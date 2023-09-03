import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AventureiroTest {

    @Test
    public void deveImprimirGuerreiro(){
        Aventureiro aventureiro = new Aventureiro(new Guerreiro());
        aventureiro.setHabilidade("Força");
        assertEquals("Guerreiro: Força", aventureiro.imprimir());
    }

    @Test
    public void deveImprimirLadino(){
        Aventureiro aventureiro = new Aventureiro(new Ladino());
        aventureiro.setHabilidade("Destreza");
        assertEquals("Ladino: Destreza",aventureiro.imprimir());
    }

    @Test
    public void deveImprimirMago(){
        Aventureiro aventureiro = new Aventureiro(new Mago());
        aventureiro.setHabilidade("Inteligencia");
        assertEquals("Mago: Inteligencia",aventureiro.imprimir());
    }

    @Test
    public void deveVerificarAtributoNulo(){
        try{
            Aventureiro aventureiro = new Aventureiro(null);
            fail();
        } catch (NullPointerException e){
            assertEquals("Atributo invalido", e.getMessage());
        }
    }

}