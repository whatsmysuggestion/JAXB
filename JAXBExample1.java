import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample1 {
	public static void main(String[] args) {

	 try {

		File file = new File("E:\\file1.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer.age);
		System.out.println(customer.id);
		System.out.println(customer.name);

	  } catch (JAXBException e) {
		e.printStackTrace();
	  }

	}
}