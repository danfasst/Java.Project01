package Ex05;

public class Distancia extends Conversor {

    public Distancia(String unidadeOriginal, String unidadeModificada) {

        super(unidadeOriginal, unidadeModificada);
    }

    @Override
    public float converterDeSi(float valor) throws Exception {

        if (!unidadeModificada.equals("metro") || !unidadeOriginal.equals("quilometro")) {

            if (!unidadeModificada.equals("metro") && !unidadeOriginal.equals("quilometro")) 
                throw new Exception("\nA unidade original deve ser Quilometro e a unidade modificada em Metro!");

            if (!unidadeModificada.equals("metro"))
                throw new Exception("\nA unidade modificada deve ser Metro");
            
            throw new Exception("\nA unidade original deve ser Quilometro!");
        }
        
        return valor *= 1000;

    }

    @Override
    public float converterParaSi(float valor) throws Exception {

        if (!unidadeModificada.equals("metro") || !unidadeOriginal.equals("quilometro")) {

            if (!unidadeModificada.equals("metro") && !unidadeOriginal.equals("quilometro")) 
                throw new Exception("\nA unidade original deve ser Quilometro e a unidade modificada em Metro!");

            if (!unidadeModificada.equals("metro"))
                throw new Exception("\nA unidade modificada deve ser Metro");
            
            throw new Exception("\nA unidade original deve ser Quilometro!");
        }
        
        return valor /= 1000;
    }

}
