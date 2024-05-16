package Ex05;

public class Temperatura extends Conversor {

    public Temperatura(String unidadeOriginal, String unidadeModificada) {
        
        super(unidadeOriginal, unidadeModificada);
    }

    @Override
    public float converterDeSi(float valor) throws Exception {
        
        if (!unidadeModificada.equals("kelvin") || !unidadeOriginal.equals("celsius")) {

            if (!unidadeModificada.equals("kelvin") && !unidadeOriginal.equals("celsius")) 
                throw new Exception("\nA unidade original deve ser Celsius e a unidade modificada em Kelvin!");

            if (!unidadeModificada.equals("kelvin"))
                throw new Exception("\nA unidade modificada deve ser Kelvin");
            
            throw new Exception("\nA unidade original deve ser Celsius!");
        }
        
        return valor += 273;
    }

    @Override
    public float converterParaSi(float valor) throws Exception {
        
        if (!unidadeModificada.equals("kelvin") || !unidadeOriginal.equals("celsius")) {

            if (!unidadeModificada.equals("kelvin") && !unidadeOriginal.equals("celsius")) 
                throw new Exception("\nA unidade original deve ser Celsius e a unidade modificada em Kelvin!");

            if (!unidadeModificada.equals("kelvin"))
                throw new Exception("\nA unidade modificada deve ser Kelvin");
            
            throw new Exception("\nA unidade original deve ser Celsius!");
        }
        
        return valor -= 273;
    }

}