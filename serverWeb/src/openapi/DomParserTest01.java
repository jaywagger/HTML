package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParserTest01 {
	public static void main(String[] args) throws Exception {
		//Parser생성
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		
		//DOM Parser
		DocumentBuilder domparser = factory.newDocumentBuilder();
		
		//Parser의 parse메소드를 호출하면 xml를 분석해서 DOM객체로 만들어 반환
		Document document  = domparser.parse("src/openapi/dept.xml");
		
		//root element
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		//dept element 추출
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		for(int i=0; i<nodelist.getLength(); i++) {
			Node node = nodelist.item(i);
			System.out.println("노드명: "+node.getNodeName());
		}
		
		
	}

}
