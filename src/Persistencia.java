import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author davi
 *
 */
public class Persistencia {

	private String separator = System.getProperty("file.separator");

	/**
	 * @param diretorio
	 * @param nome
	 * @return retorna se um arquivo existe
	 */
	public boolean isExiste(String diretorio, String nome) {
		boolean existe = false;
		File arquivo = new File(  diretorio + separator + nome + ".xml");
		if (arquivo.exists()) {
			existe = true;
		}
		return existe;
	}
	
	/** Salva um objeto em um arquivo XML.
	 */
	public void salvar(Object objeto, String diretorio, String nome) {
		try {
			String dadosGravadosViaXml = this.converteObjetoToXML(objeto);
			File diretorioPai = new File(diretorio);
			File arquivo = new File(  diretorio + separator + nome + ".xml");
			System.out.println( diretorio + separator + nome + ".xml");
			// se o arquivo nao existir crieo
			if (!this.isExiste(diretorio, nome))	
				diretorioPai.mkdir();
				arquivo.createNewFile();
				arquivo.mkdirs();
			PrintWriter pw = new PrintWriter(arquivo);
			// adcionando informaçoes ao conteudo no arquivo.
			pw.append(dadosGravadosViaXml);
			pw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar no arquivo.");
		}
		
	}
	
	/** Reculpera um objeto de um arquivo XML
	 * @return
	 */
	public Object recuperar(String diretorio, String nome){
		Object objeto = null;
		try {
			XStream xStream = new XStream(new DomDriver());
			File arquivo = new File(  diretorio + separator + nome + ".xml");
			if (arquivo.exists()) {
				FileInputStream lendoDadosDoXml = new FileInputStream(arquivo);
				objeto = (Object)xStream.fromXML(lendoDadosDoXml);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel ler o arquivo.");
		}
		return objeto;
	}
	
	/** Retorna uma String de XML a partir de um Object passado como parametro.
	 * @param objeto = Objeto que será convertido em XML.
	 * @return String
	 */
	public String converteObjetoToXML(Object objeto){
		XStream objetoXStream = new XStream(new DomDriver());
		String dadosGravadosViaXml = objetoXStream.toXML(objeto);
		return dadosGravadosViaXml;
	}
	
}
