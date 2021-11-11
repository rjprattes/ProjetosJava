import com.dao.ClienteDAO;
import com.dao.DAOFactory;
import com.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("João da Silva");
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso.");
		
	}
}
