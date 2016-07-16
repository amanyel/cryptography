

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;

import javax.crypto.spec.DHParameterSpec;

/**
 * Generating a Parameter Set for the Diffie-Hellman Key Agreement Algorithm
 * 
 * @author Amany
 */
public class DiffieHellman {
    

  public static void main(String[] argv) throws Exception {
    AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DH");
    paramGen.init(1024);

    AlgorithmParameters params = paramGen.generateParameters();
    DHParameterSpec dhSpec = (DHParameterSpec) params.getParameterSpec(DHParameterSpec.class);

    System.out.println("" + dhSpec.getP() + "," + dhSpec.getG() + "," + dhSpec.getL());
  }
}
