// SOAP : Simple Object Access Protocol 
// JAX-WS (Java API for XML Web Service)
// JAXB (Java Architecture XML Binding) : il permet la serialization et la deserialization
// prendre un objet Java et le transformer en XML 

// URL : Uniform Resource Locator
// URN : Uniform Resource Name
// URI : Uniform Resource Identifier 
// URN + URL = URI

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.fr")
public class MonserviceWeb {

    @WebMethod(operationName = "convertir")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 0.9;
    }

    public double somme(
            @WebParam(name = "parametre1") double a,
            @WebParam(name = "parametre2") double b) {
        return a + b;
    }

    public Etudiant getEtudiant(@WebParam(name = "identifiant") int identifiant) {
        return new Etudiant(1, "Mario", 19);
    }
}
