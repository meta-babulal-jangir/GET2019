package service;

import java.util.ArrayList;

import element.Element;

public class Service {
	private ArrayList<Element> elements;
	private static Service instance = null;
	
	/**
	 * Method to get instance of Service
	 * @return Service instance
	 */
	public static Service getInstance(){
		if(instance == null){
			instance = new Service();
		}
		return instance;
	}
	
	/**
	 * Constructor
	 */
	public Service(){
		this.elements = new ArrayList<Element>();
		
		Element element1 = new Element("Orange",45);
		Element element2 = new Element("Mango",58);
		this.elements.add(element1);
		this.elements.add(element2);
	}
	
	/**
	 * Method to get all Elements
	 * @return ArrayList<Element> type
	 */
	public ArrayList<Element> getAllElements(){
		return this.elements;
	}
	
	/**
	 * Method to get Element by Name
	 * @param name String type 
	 * @return Element type Element 
	 */
	public Element getElementByName(String name){
		for(int i = 0 ; i < this.elements.size() ; i ++){
			if(this.elements.get(i).getName().equalsIgnoreCase(name)){
				return this.elements.get(i);
			}
		}
		return new Element();
	}
	
	/**
	 * Method to insert Element 
	 * @param element type Element 
	 */
	public boolean insertElement(Element element){
		return this.elements.add(element);
	}
	
	/**
	 * Method to update Element
	 * @param element type Element 
	 */
	public boolean updateElement(Element element){
		boolean flag = false;
		for(int i = 0 ; i < this.elements.size() ; i ++ ){
			if(this.elements.get(i).getName().equalsIgnoreCase(element.getName())){
				this.elements.get(i).setQuantity(element.getQuantity());
				flag=true;
			}
		}
		if(!flag){
			insertElement(element);
		}
		return flag;
	}
	
	/**
	 * Method to remove Element
	 * @param elementName String type 
	 */
	public boolean delete(String elementName) {
		Element element = getElementByName(elementName);
		boolean flag=false;
		for(int i=0 ; i < this.elements.size() ; i ++){
			if(this.elements.get(i) == element){
				this.elements.remove(i);
				flag=true;
			}
		}
		return flag;
	}
}
