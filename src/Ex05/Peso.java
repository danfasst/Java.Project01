package Ex05;

public class Peso extends Conversor {

    public Peso(String unidadeOriginal, String unidadeModificada) {
        
        super(unidadeOriginal, unidadeModificada);
    }

    @Override
    public float converterDeSi(float valor) throws Exception {
        
        if (!unidadeModificada.equals("grama") || !unidadeOriginal.equals("quilo")) {

            if (!unidadeModificada.equals("grama") && !unidadeOriginal.equals("quilo")) 
                throw new Exception("\nA unidade original deve ser Quilogramaa e a unidade modificada em Grama!");

            if (!unidadeModificada.equals("grama"))
                throw new Exception("\nA unidade modificada deve ser Grama");
            
            throw new Exception("\nA unidade original deve ser Quilogramaa!");
        }

        return valor *= 1000;
    }

    @Override
    public float converterParaSi(float valor) throws Exception {
        
        if (!unidadeModificada.equals("grama") || !unidadeOriginal.equals("quilo")) {

            if (!unidadeModificada.equals("grama") && !unidadeOriginal.equals("quilo")) 
                throw new Exception("\nA unidade original deve ser Quilogramaa e a unidade modificada em Grama!");

            if (!unidadeModificada.equals("grama"))
                throw new Exception("\nA unidade modificada deve ser Grama");
            
            throw new Exception("\nA unidade original deve ser Quilogramaa!");
        }

        return valor /= 1000;
    }

}
