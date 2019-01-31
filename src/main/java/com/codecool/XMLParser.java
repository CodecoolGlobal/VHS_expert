package com.codecool;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public abstract class XMLParser {

    protected String searchFor;
    protected int arrLen;

    protected ArrayList<String[]> loadXmlDocument(String xmlPath) throws ParserConfigurationException, SAXException, IOException
    {

        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Build Document
        Document document = builder.parse(new File(xmlPath));

        //Normalize the XML Structure; It's just too important !!
        document.getDocumentElement().normalize();

        //Here comes the root node
        Element root = document.getDocumentElement();


        //Get all employees
        NodeList nList = document.getElementsByTagName(searchFor);


        return visitChildNodes(nList);
    }

    //This function is called recursively
    private ArrayList<String[]> visitChildNodes(NodeList nList)
    {
        ArrayList<String[]> objectList = new ArrayList<String[]>();
        String[] nodeStringList = new String[arrLen];
        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                String allNodes = node.getTextContent();
                nodeStringList = allNodes.split("\n");
                objectList.add(nodeStringList);
                /*for(String strNode : nodeStringList) {
                    System.out.println(strNode);
                }*/
                //Check all attributes
          /*      if (node.hasAttributes()) {
                    // get attributes names and values
                    NamedNodeMap nodeMap = node.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++)
                    {
                        Node tempNode = nodeMap.item(i);
                        System.out.println("Attr name : " + tempNode.getNodeName()+ "; Value = " + tempNode.getNodeValue());
                    }
                    if (node.hasChildNodes()) {
                        //We got more childs; Let's visit them as well
                        visitChildNodes(node.getChildNodes());
                    }
                }*/
            }
        }
        return objectList;
    }
}
